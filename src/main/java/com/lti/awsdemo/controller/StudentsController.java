package com.lti.awsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentsController {


    @GetMapping("welcome")
    public  String calling(){
        return "aws demo";
    }

    @GetMapping("name")
	public String name() {
		return "ram";
	}

}
