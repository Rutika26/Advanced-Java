package com.mapping.lazy_eager;

import javax.persistence.*;

@Entity
public class Answer2 {
	
	@Id
	@Column(name="answer_id")
	private int answerId;
	private String answer;
	
	@ManyToOne
	private Question2 question;
	public Answer2() {
		super();
		
	}
	public Answer2(int answerId, String answer) {
		super();
		this.answerId = answerId;
		this.answer = answer;
	}
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Question2 getQuestion() {
		return question;
	}
	public void setQuestion(Question2 question) {
		this.question = question;
	}
	
	
}
