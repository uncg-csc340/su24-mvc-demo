package com.csc340.mvcdemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@RestController
@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students/all")
    public String getAllStudents(Model model) {
        model.addAttribute("studentList", studentService.getAllStudents());
        return "list-students";
    }

    @GetMapping("/students/{id}")
    public String getStudentById(@PathVariable int id, Model model) {
        model.addAttribute("student", studentService.getStudentById(id));
       return "student-detail";
    }

    @GetMapping("/students/delete/{id}")
    public  String deleteStudentById(@PathVariable int id){
        studentService.deleteStudentById(id);
        return "redirect:/students/all";
    }

}
