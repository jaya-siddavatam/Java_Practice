package com;

import java.util.Arrays;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OrderColumn;
@Entity
public class Question { //table will create automatically in DB
@Id
private int qid;
private String question;
@ElementCollection        // if a property contain array then we use this
@OrderColumn(name ="AnswerId")  //it maintain the order of array list
@CollectionTable(name ="Answer")  //need one table to store answers
private String answers[];
private String correctanswer;
public int getQid() {
	return qid;
}
public void setQid(int qid) {
	this.qid = qid;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public String[] getAnswers() {
	return answers;
}
public void setAnswers(String[] answers) {
	this.answers = answers;
}
public String getCorrectanswer() {
	return correctanswer;
}
public void setCorrectanswer(String correctanswer) {
	this.correctanswer = correctanswer;
}
@Override
public String toString() {
	return "Question [qid=" + qid + ", question=" + question + ", ansers=" + Arrays.toString(answers)
			+ ", correctanswer=" + correctanswer + "]";
}


}
