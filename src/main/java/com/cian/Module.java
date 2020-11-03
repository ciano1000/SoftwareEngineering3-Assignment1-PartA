package com.cian;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Module {
    private String name;
    private UUID id;
    private List<Student> students;
    private List<Course> courses;

    public Module(String name) {
        this.name = name;
        this.id = UUID.randomUUID();
        this.students = new ArrayList<Student>();
        this.courses = new ArrayList<Course>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void removeStudent(Student student) {
        this.students.removeIf(s->s.getId().equals(student.getId()));
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public void removeCourse(Course course) {
        for(int i = 0; i < this.courses.size(); i++) {
            Course current = courses.get(i);
            if(current.getCourseName().equals(course.getCourseName())) {
                courses.remove(i);
            }
        }
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
