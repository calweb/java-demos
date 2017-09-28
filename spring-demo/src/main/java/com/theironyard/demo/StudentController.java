package com.theironyard.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by calvinwebster on 9/28/17.
 */

@Controller
public class StudentController {

    @RequestMapping(path = "/students", method = RequestMethod.GET)
    public String students(Model model) {
        Student[] myStudents = Student.buildStudents().toArray(new Student[0]);
        List<String> myStudentsStr = new ArrayList<>();
        for(Student student : myStudents) {
            myStudentsStr.add(student.getName());
        }
        model.addAttribute("students", myStudentsStr.toArray(new String[0]));
        model.addAttribute("name", "Calvin Webster");
        return "students";

    }
    @RequestMapping(path = "students/new", method = RequestMethod.GET)
    public String getNewStudentPage() {

        return "newStudent";
    }

    @RequestMapping(path = "/students/new", method = RequestMethod.POST)
    public String newStudent(@RequestParam String name, Model model) {
        model.addAttribute("studentName", name);
        return "redirect:/students.html";
    }
}
