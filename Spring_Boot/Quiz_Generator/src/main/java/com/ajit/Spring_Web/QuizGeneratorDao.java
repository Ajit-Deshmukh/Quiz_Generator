package com.ajit.Spring_Web;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizGeneratorDao extends JpaRepository<Questions, Integer>{
@Query(value= "select * from questions q where q.difficulty_level=:diffLevel AND categories=:category AND rownum<=3 ORDER BY dbms_random.random", nativeQuery = true)
	public List<Questions> findByCategories(String category,String diffLevel);

}
