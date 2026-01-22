package com.sha.todo_list.service;

import com.sha.todo_list.model.TaskStatus;
import com.sha.todo_list.model.Todo;

import java.util.List;

public interface TodoService {

    List<Todo> getAllTodos();
    Todo getTodoById(long id);
    List<Todo> getTodosByTaskStatus(TaskStatus taskStatus);
    void createTodo(Todo todo);
    Todo updateTodo(Long id, Todo todo);
    void deleteTodo(Long id);

}
