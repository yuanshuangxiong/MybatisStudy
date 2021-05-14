package com.yuan.pojo;

public class Student2 {
    private int id;
    private String name;
    private String password;
    private int tid;

    public Student2() {
    }

    public Student2(int id, String name, String password, int tid) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.tid = tid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", tid=" + tid +
                '}';
    }
}
