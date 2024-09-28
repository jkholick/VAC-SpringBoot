package com.hkbk.QAS.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "quiz")
public class Quiz {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private static Integer quizID;

	@Column(name = "TimeTaken",nullable = false)
	private static Integer quizTimeTaken;
  
	@Column(name = "TimeToSelect",nullable = false)	
	private static Integer quizTimeToSelect;
	  
	@Column(name = "Question",nullable = false)	
	private static String quizQ;

	@Column(name = "Options",nullable = false)	
	private static String quizOptions;
	  
	@Column(name = "Answer",nullable = false)	
	private static String quizA;
	
	public static Integer getQuizID() {
		return quizID;
	}
	public static void setQuizID(Integer quizID) {
		Quiz.quizID = quizID;
	}
	public static Integer getQuizTimeTaken() {
		return quizTimeTaken;
	}
	public static void setQuizTimeTaken(Integer quizTimeTaken) {
		Quiz.quizTimeTaken = quizTimeTaken;
	}
	public static Integer getQuizTimeToSelect() {
		return quizTimeToSelect;
	}
	public static void setQuizTimeToSelect(Integer quizTimeToSelect) {
		Quiz.quizTimeToSelect = quizTimeToSelect;
	}
	public static String getQuizQ() {
		return quizQ;
	}
	public static void setQuizQ(String quizQ) {
		Quiz.quizQ = quizQ;
	}
	public static String getQuizOptions() {
		return quizOptions;
	}
	public static void setQuizOptions(String quizOptions) {
		Quiz.quizOptions = quizOptions;
	}
	public static String getQuizA() {
		return quizA;
	}	public static void setQuizA(String quizA) {
		Quiz.quizA = quizA;
	}
	public Quiz() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Quiz [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
		
}
