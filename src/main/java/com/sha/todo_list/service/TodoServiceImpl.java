package com.sha.todo_list.service;

import com.sha.todo_list.model.TaskStatus;
import com.sha.todo_list.model.Todo;
import com.sha.todo_list.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {
    @Autowired
    private TodoRepository todoRepository;


    @Override
    public List<Todo> getAllTodos() {
        List<Todo> todos = todoRepository.findAll();
        return todos;
    }

    @Override
    public Todo getTodoById(long id) {
        return null;
    }

    @Override
    public List<Todo> getTodosByTaskStatus(TaskStatus taskStatus) {
        return List.of();
    }

    @Override
    public void createTodo(Todo todo) {

    }

    @Override
    public Todo updateTodo(Long id, Todo todo) {
        return null;
    }
}
