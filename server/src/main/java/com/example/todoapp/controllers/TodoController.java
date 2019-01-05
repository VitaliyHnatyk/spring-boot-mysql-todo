package com.example.todoapp.controllers;

import com.example.todoapp.exception.ResourceNotFoundException;
import com.example.todoapp.models.Todo;
import com.example.todoapp.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class TodoController {


    @Autowired
    TodoRepository todoRepository;

    @GetMapping("/todos")
    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    @PostMapping("/todos")
    public Todo createTodo(@Valid @RequestBody Todo todo) {

        return todoRepository.save(todo);
    }

    @GetMapping(value="/todos/{id}")
    public Todo getTodoById(@PathVariable("id") Long id) {
        return todoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Todo", "id", id));
    }

    @PutMapping(value="/todos/{id}")
    public Todo updateTodo(@PathVariable("id") Long id,
                                           @Valid @RequestBody Todo todo) {

        Todo todoData = todoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Todo", "id", id));

        todoData.setTitle(todo.getTitle());
        return todoRepository.save(todoData);
    }

    @DeleteMapping(value="/todos/{id}")
    public ResponseEntity<?> deleteTodo(@PathVariable("id") Long id) {
        Todo todoData = todoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Todo", "id", id));
        todoRepository.delete(todoData);

        return ResponseEntity.ok().build();
    }
}