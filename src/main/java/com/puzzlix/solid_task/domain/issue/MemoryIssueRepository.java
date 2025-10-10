/*
package com.puzzlix.solid_task.domain.issue;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

// 더 이상 사용 안함!
//@Repository // 이 클래스가 데이터 저장소 역할을 하는 스프링 빈임을 선언함
public class MemoryIssueRepository implements IssueRepository{

    // 동시성 문제를 방지하기 위해 ConcurrentHashMap 사용
    private static Map<Long, Issue> store = new ConcurrentHashMap<>();
    private static AtomicLong sequence = new AtomicLong(0);

    @Override
    public Issue save(Issue issue) {
        //save 요청 시 Issue 에 상태값 id가 없는 상태이다.
        if(issue.getId() == null){
            // -> 1 변경하고 issue 객체에 상태값 id를 1로 할당
            issue.setId(sequence.incrementAndGet());
            // sequence -> 1로 결정됨
            // sequence -> 2로 결정됨

        }

        store.put(issue.getId(), issue);
        return issue;
    }

    @Override
    public Optional<Issue> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public List<Issue> findAll() {
        return new ArrayList<>(store.values());
    }
}
*/
