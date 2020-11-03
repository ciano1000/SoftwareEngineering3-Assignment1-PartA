package com.cian;

import org.joda.time.DateTime;
import org.joda.time.Years;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Student {
    private String name;
    private Integer age;
    private DateTime dateOfBirth;
    private UUID id;
    private String username;
    private List<Course> courses;
    private List<Module> modules;

    public Student(String name, DateTime dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.age = Years.yearsBetween(dateOfBirth, new DateTime()).getYears();
        this.courses = new ArrayList<>();
        this.modules = new ArrayList<>();
        this.id = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public DateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(DateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUsername() {
        this.username = name.concat(age.toString()).replaceAll("\\s+","").toLowerCase();
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }
}
