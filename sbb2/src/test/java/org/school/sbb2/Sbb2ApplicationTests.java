package org.school.sbb2;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.school.sbb2.answer.Answer;
import org.school.sbb2.answer.AnswerRepository;
import org.school.sbb2.question.Question;
import org.school.sbb2.question.QuestionRepository;
import org.school.sbb2.question.QuestionService;
import org.school.sbb2.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class Sbb2ApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;
    @Autowired
    private AnswerRepository answerRepository;
    @Autowired
    private QuestionService questionService;
    @Autowired
    private UserService userService;

    //    Question Test
    @Test
    void createQuestion() {
        Question q1 = new Question();
        q1.setSubject("제목1");
        q1.setContent("내용1");
        q1.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q1);

        Question q2 = new Question();
        q2.setSubject("제목2");
        q2.setContent("내용2");
        q2.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q2);

    }

    @Test
    void findAll() {
        List<Question> all = this.questionRepository.findAll();
        assertEquals(2, all.size());

        Question q = all.get(0);
        assertEquals("제목1", q.getSubject());
    }

    @Test
    void findById() {
        Optional<Question> oq = this.questionRepository.findById(1);
        if (oq.isPresent()) {
            Question q = oq.get();
            assertEquals("제목1", q.getSubject());
        }
    }

    @Test
    void findBySubject() {
        Question question = this.questionRepository.findBySubject("제목1");
        assertEquals(1, question.getId());
    }

    @Test
    void findBySubjectAndContent() {
        Question question = this.questionRepository.findBySubjectAndContent("제목1", "내용1");
        assertEquals(1, question.getId());
    }

    @Test
    void findBySubjectLike() {
        List<Question> all = this.questionRepository.findBySubjectLike("제목%");
        Question question = all.get(0);
        assertEquals("제목1", question.getSubject());
    }


    @Test
    void edit() {
        Optional<Question> oq = this.questionRepository.findById(1);
        assertTrue(oq.isPresent());
        Question q = oq.get();
        q.setSubject("제목1수정");
        this.questionRepository.save(q);
    }

    @Test
    void edit2() {
        Optional<Question> oq = this.questionRepository.findById(1);
        if (oq.isPresent()) {
            Question q = oq.get();
            q.setSubject("제목1수정");
            this.questionRepository.save(q);
        }
    }


    @Test
    void del() {
        Optional<Question> oq = this.questionRepository.findById(1);
        assertTrue(oq.isPresent());
        Question q = oq.get();
        this.questionRepository.delete(q);
        assertEquals(1, this.questionRepository.count());

    }

//    Answer Test

    @Test
    void createAnswer() {
        Optional<Question> oq = this.questionRepository.findById(2);
        assertTrue(oq.isPresent());
        Question q = oq.get();

        Answer a = new Answer();
        a.setQuestion(q);
        a.setContent("답변2");
        a.setCreateDate(LocalDateTime.now());
        this.answerRepository.save(a);
    }

    @Test
    void answerFindById() {
        Optional<Answer> oa = this.answerRepository.findById(1);
        assertTrue(oa.isPresent());
        Answer a = oa.get();
        assertEquals("답변2", a.getContent());
    }

    @Test
    void getQuestion() {
        Optional<Answer> oa = this.answerRepository.findById(1);
        assertTrue(oa.isPresent());
        Answer answer = oa.get();
        Question q = answer.getQuestion();
        assertEquals("제목2", q.getSubject());
    }

    @Transactional
    @Test
    void getAnswer() {
        Optional<Question> oq = this.questionRepository.findById(2);
        assertTrue(oq.isPresent());
        Question q = oq.get();

        List<Answer> answerList = q.getAnswerList();

        assertEquals(2, answerList.size());
        assertEquals("답변2", answerList.get(0).getContent());
    }

    //    Make Test Data
    @Test
    void make() {
        for (int i = 1; i <= 100; i++) {
            String subject = String.format("테스트 데이터:[%03d]", i);
            String content = String.format("테스트 데이터 내용:[%03d]", i);
            this.questionService.createQuestion(subject, content, null);
        }
    }

}