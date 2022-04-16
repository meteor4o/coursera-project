package com.example.coursera_project.model.entity;

import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "students")
public class StudentEntity {

    private int pin;
    private String firstName;
    private String lastName;
    private LocalDateTime timeCreated;
//    private Set<CourseEntity> courses;

    public StudentEntity() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    public int getPin() {
        return pin;
    }

    public StudentEntity setPin(int pin) {
        this.pin = pin;
        return this;
    }

    @Column(nullable = false, name = "first_name", length = 50)
    @Nationalized
    public String getFirstName() {
        return firstName;
    }

    public StudentEntity setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Column(nullable = false, name = "last_name", length = 50)
    @Nationalized
    public String getLastName() {
        return lastName;
    }

    public StudentEntity setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public LocalDateTime getTimeCreated() {
        return timeCreated;
    }

    public StudentEntity setTimeCreated(LocalDateTime timeCreated) {
        this.timeCreated = timeCreated;
        return this;
    }

//    @ManyToMany
//    @JoinTable(
//            name = "students courses xref",
//            joinColumns = @JoinColumn(name = "student_pin"),
//            inverseJoinColumns = @JoinColumn(name = "course_id")
//    )
//    public Set<CourseEntity> getCourses() {
//        return courses;
//    }
//
//    public StudentEntity setCourses(Set<CourseEntity> courses) {
//        this.courses = courses;
//        return this;
//    }
}
