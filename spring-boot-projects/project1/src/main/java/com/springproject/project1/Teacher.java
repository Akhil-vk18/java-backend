package com.springproject.project1;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("entry")//entry point of  the following apis . localhost/first/api
public class Teacher {

  @GetMapping("/api")
 public String Api(){
  return "First Api";
 }
 
  @GetMapping("/api2")
 public String Api2() {
   return "Second Api";
 }
 
 @GetMapping("/api3")
 public String Api3() {
   return "Third Api";
 }
}
