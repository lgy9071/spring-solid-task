package com.puzzlix.solid_task.domain.issue;

import org.springframework.data.jpa.repository.JpaRepository;

/*
* 저장소 역할(규칙)을 정의하는 인터페이스
* */
// @Repository -> JpaRepository가 이미 스프링 빈으로 등록이 되어있다.
public interface IssueRepository extends JpaRepository<Issue, Long> {
    //JpaRepository를 상속 받으면 기본적인 많은 기능을 바로 제공해준다.

    /*Issue save(Issue issue);
    Optional<Issue> findById(Long id);
    List<Issue> findAll();*/
}
