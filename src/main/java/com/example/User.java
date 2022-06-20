package com.example;

import org.apache.deltaspike.core.api.scope.WindowScoped;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Model;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped

//Either use @ManagedBean with @WindowScoped or use @Named ex. with @SessionScoped

//@ViewAccessScoped
//@SessionScoped

//@ManagedBean(name = "hello") : Depreciated and doesn't work on Quarkus
//@SessionScoped
public class User implements Serializable {

    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
