package com.skillsimprover.ittrainings.server;

import com.skillsimprover.ittrainings.data.Student;

public class TrainingsServerApp {

    public static void main(String[] args) {
        System.out.println("Server App start and running...");

        Student student = new Student("Petr");
        System.out.println(student.getFirstName());

    }
}
