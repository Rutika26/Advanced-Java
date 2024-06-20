 package com.mapping.lazy_eager;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Question2 {
	@Id
	@Column(name="question_id")
	private int questionId;
	private String question;
	
	//LAZY---->1)query for associate data not fired 
	//         2)query for associate data will fired only it is required
	//EAGER---->query for associate data fired even if it is not required
	@OneToMany(mappedBy="question", fetch=FetchType.EAGER)
	
	//using mappedBy we reduced creation of question1_answer1 table
	private List<Answer2> answer;
	
	
	
	
	
	public Question2(int questionId, String question, List<Answer2> answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
	}
	public Question2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public List<Answer2> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answer2> answer) {
		this.answer = answer;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
	
}
