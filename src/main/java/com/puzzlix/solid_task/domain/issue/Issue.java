package com.puzzlix.solid_task.domain.issue;
// pk
// 타이틀
// 내용
// 진행상태

// 프로젝트 pk
// 보고자 (누가 요청 했는지)
// 담당자 (누가 처리 하는지)

import com.puzzlix.solid_task.domain.comment.Comment;
import com.puzzlix.solid_task.domain.project.Project;
import com.puzzlix.solid_task.domain.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString(exclude = {"project", "reporter", "assignee", "comments"})
public class Issue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;

    @Enumerated(EnumType.STRING)
    private IssueStatus issueStatus;

    // 추후 연관관계 필드
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id")
    private Project project;

    //누가 요청(보고) , (OPEN IN VIEW)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reporter_id")
    private User reporter;

    // 담당자(누군가에게 할당 되어 처리 됩니다)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assignee_id")
    private User assignee;

    // 댓글
    // 이슈 너는 댓글의 외래키 주인이 아니야!
    @OneToMany(mappedBy = "issue", cascade = CascadeType.ALL)
    private List<Comment> comments = new ArrayList<>();



}
