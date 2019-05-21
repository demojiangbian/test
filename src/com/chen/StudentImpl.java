package com.chen;

public class StudentImpl implements IStudent {
    @Override
    public void addStudent(String name) {
        System.out.println("欢迎" + name + "加入spring家庭");
    }
}
