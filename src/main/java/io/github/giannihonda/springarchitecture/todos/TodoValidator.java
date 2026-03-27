package io.github.giannihonda.springarchitecture.todos;

import org.springframework.stereotype.Component;

@Component
public class TodoValidator {

    private TodoRepository repository;

    public TodoValidator(TodoRepository repository) {
        this.repository = repository;
    }

    public void validate(TodoEntity todo){
        if(existTodoWithDescription(todo.getDescription())){
            throw new IllegalArgumentException("There is already a TODO with this description!");
        }
    }

    private boolean existTodoWithDescription(String description){
        return repository.existsByDescription(description);
    }
}
