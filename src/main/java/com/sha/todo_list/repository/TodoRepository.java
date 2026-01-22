package com.sha.todo_list.repository;

import com.sha.todo_list.model.TaskStatus;
import com.sha.todo_list.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todo,Long> {

    List<Todo> findByTaskStatus(TaskStatus taskStatus);
    List<Todo> findByTaskStatusOrderByTaskCompletedDesc(TaskStatus taskStatus);
    List<Todo> findByTaskDueDateBefore(LocalDateTime Date);
    List<Todo> findByTaskDueDateAfterAndNotCompleted(LocalDateTime Date, TaskStatus taskStatus);
}
