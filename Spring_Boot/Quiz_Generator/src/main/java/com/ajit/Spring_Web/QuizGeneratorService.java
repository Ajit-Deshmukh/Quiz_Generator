package com.ajit.Spring_Web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class QuizGeneratorService {
	@Autowired
QuizGeneratorDao dao;
	public List<Questions> createQuiz(String category,String diffLevel) {
		return dao.findByCategories(category,diffLevel);
	}

}
