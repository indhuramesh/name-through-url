package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.pojoclass;
@RestController
public class controller {
	@GetMapping("student")
	public List <pojoclass> info(){
		return Arrays.asList(new pojoclass(1,"indhu","IT"),new pojoclass(2,"ligi","IT"));
	}

}
