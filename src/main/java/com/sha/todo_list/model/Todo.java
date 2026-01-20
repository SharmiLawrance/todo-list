package com.sha.todo_list.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity(name = "tasks")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskId;

    @NotBlank(message = "Task name is required.")
    private String taskName;

    @Column(length = 100)
    private String taskDescription;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TaskStatus taskStatus = TaskStatus.NOT_STARTED;

    private LocalDateTime taskCreatedAt;
    private LocalDateTime taskUpdatedAt;
    private LocalDateTime taskCompletedAt;
    private LocalDateTime taskDueDate;

    @PrePersist
    public void onCreate() {
        taskCreatedAt = LocalDateTime.now();
        taskUpdatedAt = LocalDateTime.now();
    }

    @PreUpdate
    public void onUpdate() {
        taskUpdatedAt = LocalDateTime.now();
    }

}
