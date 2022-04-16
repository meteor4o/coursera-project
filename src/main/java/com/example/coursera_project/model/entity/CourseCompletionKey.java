package com.example.coursera_project.model.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CourseCompletionKey implements Serializable {

    private int studentPin;
    private int courseId;

    public CourseCompletionKey() {
    }

    @Column(name = "student_pin")
    public int getStudentPin() {
        return studentPin;
    }

    public CourseCompletionKey setStudentPin(int studentPin) {
        this.studentPin = studentPin;
        return this;
    }

    @Column(name = "course_id")
    public int getCourseId() {
        return courseId;
    }

    public CourseCompletionKey setCourseId(int courseId) {
        this.courseId = courseId;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseCompletionKey that = (CourseCompletionKey) o;
        return courseId == that.courseId && Objects.equals(studentPin, that.studentPin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentPin, courseId);
    }
}
