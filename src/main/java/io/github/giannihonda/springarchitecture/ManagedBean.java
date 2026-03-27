package io.github.giannihonda.springarchitecture;

import io.github.giannihonda.springarchitecture.todos.TodoEntity;
import io.github.giannihonda.springarchitecture.todos.TodoValidator;
import org.springframework.beans.factory.annotation.Autowired;

public class ManagedBean {

    private String idLoggedUser;
    @Autowired
    private TodoValidator validator;

    @Autowired
    public ManagedBean(TodoValidator validator){
        this.validator = validator;
    }

    public void use(){
        var todo = new TodoEntity();
        validator.validate(todo);
    }

    @Autowired
    public void setValidator(TodoValidator validator){
        this.validator = validator;
    }
}
