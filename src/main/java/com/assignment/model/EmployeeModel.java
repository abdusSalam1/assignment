package com.assignment.model;

import javax.validation.constraints.NotNull;
import java.util.UUID;

public class EmployeeModel {

    private UUID id;
    @NotNull(message = "Name cannot be empty")
    private String name;
    @NotNull(message = "Age cannot be empty")
    private int age;
    private boolean active;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
