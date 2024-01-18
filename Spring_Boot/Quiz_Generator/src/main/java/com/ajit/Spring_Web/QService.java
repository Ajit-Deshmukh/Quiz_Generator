package com.ajit.Spring_Web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class QService {
	@Autowired
	QuestionsDao questions;
public List<Questions> allQuestions(){
	return questions.findAll();
	
}
public List<Questions> findByCategories(String category) {
	return questions.findByCategories(category);
}
}
