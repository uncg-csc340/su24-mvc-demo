package com.csc340.mvcdemo.student;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StudentService {

    Map<Integer, Student> studentDatabase = new HashMap<>();


    private void populateDatabase() {
        studentDatabase.put(1, new Student(1, "sample1", "csc", 3.89));
        studentDatabase.put(2, new Student(2, "sample2", "eng", 3.89));
        studentDatabase.put(3, new Student(3, "sampl3", "mat", 3.89));
    }

    public Object getAllStudents() {
        if (studentDatabase.isEmpty()) {
            populateDatabase();
        }
        return studentDatabase.values();
    }

    public Student getStudentById(int id) {
        if (studentDatabase.isEmpty()) {
            populateDatabase();
        }
        return studentDatabase.get(id);
    }

    public void deleteStudentById(int id) {
        studentDatabase.remove(id);
    }
}
