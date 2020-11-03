package com.cian;

import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Course {
    private String courseName;
    private List<Module> moduleList;
    private List<Student> students;
    private DateTime startDate;
    private DateTime endDate;

    public Course(String courseName, DateTime startDate, DateTime endDate) {
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.moduleList = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void addModule(Module module) {
        module.getCourses().add(this);
        this.moduleList.add(module);
    }

    public void removeModule(Module module) {
        for(int i = 0; i < this.students.size(); i++) {
            Module current = moduleList.get(i);
            if(current.getName().equals(module.getName())) {
                current.removeCourse(this);
                moduleList.remove(i);
            }
        }
    }
    public List<Module> getModuleList() {
        return moduleList;
    }

    public void setModuleList(List<Module> moduleList) {
        this.moduleList = moduleList;
    }

    public void addStudent(Student student) {
        student.getCourses().add(this);
        this.students.add(student);
    }

    public void removeStudent(Student student) {
        for(int i = 0; i < this.students.size(); i++) {
            Student current = students.get(i);
            if(current.getName().equals(student.getName())) {
                current.removeCourse(this);
                students.remove(i);
            }
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
}
