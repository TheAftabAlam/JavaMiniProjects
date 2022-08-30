package com.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	@Id
	private int aid;
	private String answer;
	@OneToOne
	private Question question;
	
	public Answer(int aid, String answer, Question question) {
		super();
		this.aid = aid;
		this.answer = answer;
		this.question = question;
	}
	public Answer() {
		super();
		
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	@Override
	public String toString() {
		return "Answer [aid=" + aid + ", answer=" + answer + ", question=" + question + "]";
	}
	
}
