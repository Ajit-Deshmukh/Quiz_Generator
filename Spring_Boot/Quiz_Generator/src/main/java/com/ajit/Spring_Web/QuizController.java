package com.ajit.Spring_Web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/questions")
public class QuizController {
	@Autowired
	QService service;
	
	@GetMapping("/allquestions")
public List<Questions> allQuestions() {
		//ResponseEntity we used to send data and Http status code.
		return service.allQuestions();
	}
	
	@GetMapping("/category/{category}/{diffLevel}")
	public List<Questions> byCategory(@PathVariable String category){
		return service.findByCategories(category);
	}
}
