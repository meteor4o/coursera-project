package com.example.coursera_project.model.entity;

import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name="courses")
public class CourseEntity extends BaseEntity {

    private String name;
    private byte totalTime;
    private byte credit;
    private LocalDateTime timeCreated;
    private InstructorEntity instructor;

    public CourseEntity() {
    }

    @Column(nullable = false, length = 150)
    @Nationalized
    public String getName() {
        return name;
    }

    public CourseEntity setName(String name) {
        this.name = name;
        return this;
    }

    @Column(name="total_time", nullable = false)
    public byte getTotalTime() {
        return totalTime;
    }

    public CourseEntity setTotalTime(byte totalTime) {
        this.totalTime = totalTime;
        return this;
    }

    @Column(nullable = false)
    public byte getCredit() {
        return credit;
    }

    public CourseEntity setCredit(byte credit) {
        this.credit = credit;
        return this;
    }

    @Column(name="time_created", nullable = false)
    public LocalDateTime getTimeCreated() {
        return timeCreated;
    }

    public CourseEntity setTimeCreated(LocalDateTime timeCreated) {
        this.timeCreated = timeCreated;
        return this;
    }

    public CourseEntity setInstructor(InstructorEntity instructor) {
        this.instructor = instructor;
        return this;
    }

    @ManyToOne
    @JoinColumn(name = "instructor_id")
    public InstructorEntity getInstructor() {
        return instructor;
    }
}
