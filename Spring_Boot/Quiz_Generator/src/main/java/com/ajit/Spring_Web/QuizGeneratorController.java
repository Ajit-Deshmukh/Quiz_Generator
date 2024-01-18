package com.ajit.Spring_Web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quiz")
public class QuizGeneratorController {
	@Autowired
	QuizGeneratorService service;
	@PostMapping("/create/{category}/{diffLevel}")
	public List<Questions> createNewQuiz(@PathVariable String category,@PathVariable String diffLevel) {
	    return service.createQuiz(category,diffLevel);
	}

}
