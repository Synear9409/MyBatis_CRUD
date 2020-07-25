package com.cxzspringboot.springboottopcache.bean;

public class Student {

    private Long studentId;

    private String name;

    private String address;

    private Long phone;

    private Long sex;

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Long getSex() {
        return sex;
    }

    public void setSex(Long sex) {
        this.sex = sex;
    }

    public Student(Long studentId, String name, String address, Long phone, Long sex) {
        this.studentId = studentId;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.sex = sex;
    }

    public Student(){

    }
}
