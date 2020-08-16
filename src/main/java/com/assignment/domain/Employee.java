package com.assignment.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Employee {

    @Id
    private UUID id;
    private String name;
    private int age;
    private boolean active;

    public Employee() {
    }

    public Employee(UUID id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isActive() {
        return active;
    }
}
