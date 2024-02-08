package com.example.si_tasks.excersises.day2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("v1/student/name")
    public String student(@RequestParam(value = "formal", defaultValue = "false") boolean formal) {
        return formal ? "Fernando Valdes Garcia" : "Fernando";
    }
}
