package com.example.todolist;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String description;
    private boolean isCompleted;

    public Task() {
    }

    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }
}
