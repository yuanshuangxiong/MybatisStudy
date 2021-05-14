package com.yuan.pojo;

import java.util.List;

public class Teacher2 {

    private int id;
    private String name;
    private List<Student2> studentList;

    public Teacher2() {
    }

    public Teacher2(int id, String name, List<Student2> studentList) {
        this.id = id;
        this.name = name;
        this.studentList = studentList;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentList(List<Student2> studentList) {
        this.studentList = studentList;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Student2> getStudentList() {
        return studentList;
    }

    @Override
    public String toString() {
        return "Teacher2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
