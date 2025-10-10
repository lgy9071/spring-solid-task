package com.puzzlix.solid_task.domain.user;

import com.puzzlix.solid_task.domain.issue.Issue;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_table")
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //해당 데이터 베이스 정책에 따른다는 뜻
    private Long id;
    private String name;
    private String email;
    private String password;

    @OneToMany(mappedBy = "reporter")
    private List<Issue> issues = new ArrayList<>();
}
