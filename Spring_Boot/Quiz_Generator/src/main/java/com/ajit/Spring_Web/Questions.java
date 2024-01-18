package com.ajit.Spring_Web;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Questions {
	@Id
public Integer id;
public String question;
public String option1;
public String option2;
public String option3;
public String option4;
public String correctOption;
public String categories;
public String difficultyLevel;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public String getOption1() {
	return option1;
}
public void setOption1(String option1) {
	this.option1 = option1;
}
public String getOption2() {
	return option2;
}
public void setOption2(String option2) {
	this.option2 = option2;
}
public String getOption3() {
	return option3;
}
public void setOption3(String option3) {
	this.option3 = option3;
}
public String getOption4() {
	return option4;
}
public void setOption4(String option4) {
	this.option4 = option4;
}
public String getCorrectOption() {
	return correctOption;
}
public void setCorrectOption(String correctOption) {
	this.correctOption = correctOption;
}
public String getCategories() {
	return categories;
}
public void setCategories(String categories) {
	this.categories = categories;
}
public String getDifficultyLevel() {
	return difficultyLevel;
}
public void setDifficultyLevel(String difficultyLevel) {
	this.difficultyLevel = difficultyLevel;
}
public Questions(Integer id, String question, String option1, String option2, String option3, String option4,
		String correctOption, String categories, String difficultyLevel) {
	super();
	this.id = id;
	this.question = question;
	this.option1 = option1;
	this.option2 = option2;
	this.option3 = option3;
	this.option4 = option4;
	this.correctOption = correctOption;
	this.categories = categories;
	this.difficultyLevel = difficultyLevel;
}
public Questions() {
	super();
}



}
