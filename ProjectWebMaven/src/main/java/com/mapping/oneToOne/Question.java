package com.mapping.oneToOne;

import javax.persistence.*;

@Entity
public class Question {
	@Id
	@Column(name="question_id")
	private int questionId;
	private String question;
	@OneToOne
	@JoinColumn(name="a_id")
	private Answer ans;
	
	
	
	public Question(int questionId, String question, Answer ans) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.ans = ans;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Answer getAns() {
		return ans;
	}
	public void setAns(Answer ans) {
		this.ans = ans;
	}
	
}
