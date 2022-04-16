package com.example.coursera_project.model.entity;

import org.hibernate.annotations.Nationalized;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name="instructors")
public class InstructorEntity extends BaseEntity{

    private String firstName;
    private String lastName;
    private LocalDateTime timeCreated;

    public InstructorEntity() {
    }

    @Column(name = "first_name", nullable = false, length = 100)
    @Nationalized
    public String getFirstName() {
        return firstName;
    }

    public InstructorEntity setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }


    @Column(name="last_name", nullable = false, length = 100)
    @Nationalized
    public String getLastName() {
        return lastName;
    }

    public InstructorEntity setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Column(name="time_created", nullable = false)
    public LocalDateTime getTimeCreated() {
        return timeCreated;
    }

    public InstructorEntity setTimeCreated(LocalDateTime timeCreated) {
        this.timeCreated = timeCreated;
        return this;
    }

}
