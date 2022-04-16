package com.example.coursera_project.model.entity;

import org.hibernate.annotations.Target;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "students_courses_xref")
public class CourseCompletion {

    private CourseCompletionKey id;
    private StudentEntity student;
    private CourseEntity course;
    private LocalDate completionDate;

    public CourseCompletion() {
    }

    @EmbeddedId
    public CourseCompletionKey getId() {
        return id;
    }

    public CourseCompletion setId(CourseCompletionKey id) {
        this.id = id;
        return this;
    }

    @ManyToOne
    @MapsId("studentPin")
    @JoinColumn(name = "student_pin")
    public StudentEntity getStudent() {
        return student;
    }

    public CourseCompletion setStudent(StudentEntity student) {
        this.student = student;
        return this;
    }

    @ManyToOne
    @MapsId("courseId")
    @JoinColumn(name = "course_id")
    public CourseEntity getCourse() {
        return course;
    }

    public CourseCompletion setCourse(CourseEntity course) {
        this.course = course;
        return this;
    }

    public LocalDate getCompletionDate() {
        return completionDate;
    }

    public CourseCompletion setCompletionDate(LocalDate completionDate) {
        this.completionDate = completionDate;
        return this;
    }
}
