package com.sha.todo_list.controller;

import com.sha.todo_list.model.TaskStatus;
import com.sha.todo_list.model.Todo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TodoController {

    @GetMapping("/tasks")
    public List<Todo>getAllTodos(){

        return List.of();
    }

    @GetMapping("/tasks/{id}")
    public Todo getTodoById(Long id){
        return null;
    }

    @GetMapping("/tasks/{taskStatus}")
    public Todo getTodoByTaskStatus(TaskStatus taskStatus){
        return null;
    }

    @PostMapping("/tasks")
    public void createTodo(){

    }

    @PostMapping("/tasks")
    public Todo updateTodo(Todo todo){
        return null;
    }

    @DeleteMapping("/tasks/{id}")
    public void deleteTodo(Long id){

    }


}
