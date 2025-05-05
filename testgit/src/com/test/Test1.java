package com.test;

import com.pojo.Student;

public class Test1 {
    public static void main(String[] args) {
        Student student=new Student("chen","111",12);
        System.out.println(student.name);

        System.out.println(student.age);

    }
}
