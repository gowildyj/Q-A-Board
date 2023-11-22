package org.school.sbb2.answer;

import lombok.RequiredArgsConstructor;
import org.school.sbb2.DataNotFoundException;
import org.school.sbb2.question.Question;
import org.school.sbb2.question.QuestionService;
import org.school.sbb2.user.SiteUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class AnswerService {
    private final AnswerRepository answerRepository;

    public Answer create(Question question, String content, SiteUser author) {
        Answer answer = new Answer();
        answer.setQuestion(question);
        answer.setContent(content);
        answer.setCreateDate(LocalDateTime.now());
        answer.setAuthor(author);
        this.answerRepository.save(answer);
        return answer;
    }

    public Answer getAnswer(Integer id) {
        Optional<Answer> answer = this.answerRepository.findById(id);
        if (answer.isPresent()) {
            return answer.get();
        } else {
            throw new DataNotFoundException("answer not found");
        }
    }

    public void modifyAnswer(Answer answer, String content) {
        answer.setContent(content);
        answer.setModifyDate(LocalDateTime.now());
        this.answerRepository.save(answer);
    }

    public void deleteAnswer(Answer answer){
        this.answerRepository.delete(answer);
    }

    public void voteAnswer(Answer answer,SiteUser siteUser){
        answer.getVoter().add(siteUser);
        this.answerRepository.save(answer);
    }
}


