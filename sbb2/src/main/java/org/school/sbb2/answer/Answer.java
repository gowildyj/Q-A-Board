package org.school.sbb2.answer;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.school.sbb2.question.Question;
import org.school.sbb2.user.SiteUser;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(columnDefinition = "TEXT")
    private String content;
    @Column
    private LocalDateTime createDate;
    @ManyToOne
    private Question question;

    @ManyToOne
    private SiteUser author;

    private LocalDateTime modifyDate;

    @ManyToMany
    Set<SiteUser> voter;
}
