package com.springproject.project1;

import org.springframework.stereotype.Controller;

@Controller
public class Student {
    public String hello(){
        return "hello from student";
    }
}
