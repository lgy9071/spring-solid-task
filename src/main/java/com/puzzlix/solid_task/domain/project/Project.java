package com.puzzlix.solid_task.domain.project;

import com.puzzlix.solid_task.domain.issue.Issue;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    // 나는 FK 주인이 아니야
    @OneToMany(mappedBy = "project")
    private List<Issue> issues = new ArrayList<>();
}
