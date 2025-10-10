package com.puzzlix.solid_task.domain.issue;
// pk
// 타이틀
// 내용
// 진행상태

// 프로젝트 pk
// 보고자 (누가 요청 했는지)
// 담당자 (누가 처리 하는지)

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Issue {

    private Long id;
    private String title;
    private String description;
    private IssueStatus issueStatus;

    // 추후 연관관계 필드
    private Long projectId;

    //누가 요청(보고)
    private Long reporterId;

    // 담당자(누군가에게 할당 되어 처리 됩니다)
    private Long assigneeId;
}
