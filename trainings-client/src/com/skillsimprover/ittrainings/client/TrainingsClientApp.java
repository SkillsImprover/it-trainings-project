package com.skillsimprover.ittrainings.client;

import com.skillsimprover.ittrainings.data.Student;

public class TrainingsClientApp {

    public static void main(String[] args) {
        System.out.println("Client App start and running...");

        Student student = new Student("Ivan");
        System.out.println(student.getFirstName());

    }
}
