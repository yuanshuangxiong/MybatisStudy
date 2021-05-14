package com.yuan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Alias("Student")
//@Data//使用这个标签可以不用写set，get,无参 构造方法
//@AllArgsConstructor//有参构造方法
//@NoArgsConstructor
public class Student {
    private int id;
    private String name;
    private String password;
    private Teacher teacher;

    public Student(){}

    public Student(int id, String name, String password, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
