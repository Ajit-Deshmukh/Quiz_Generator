package com.ajit.Spring_Web;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionsDao extends JpaRepository<Questions, Integer>{

	List<Questions> findByCategories(String category);

}
