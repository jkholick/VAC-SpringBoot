package com.hkbk.QAS.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.hkbk.QAS.dao.QuizRepository;
import com.hkbk.QAS.model.Quiz;

import jakarta.annotation.PostConstruct;

@Repository
public class QuizRepositoryImpl implements QuizRepository {

 @Value("${spring.datasource.url}")
 private String url;
 
 @Value("${spring.datasource.username}")
 private String username;               
 
 @Value("${spring.datasource.password}")
 private String password;

 private Connection connection;

 @PostConstruct
 public void init() {
	 try {
		connection = DriverManager.getConnection(url,username,password);
	} catch (SQLException e) {
		e.printStackTrace();
	}
 }

@Override
public List<Quiz> getAllQuizzes() {
	List<Quiz> quizzes = new ArrayList<>();
	String query = "SELECT * From quiz";
	
	try(Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(query)){
	  while (resultSet.next()) {
		  Quiz quiz = new Quiz();
		  quiz.setQuizID(ResultSet.getLong("id"));
      
       
	  }
    }
	catch (SQLException e) {
    e.printStackTrace();
	}
	
}

@Override
public Quiz getQuizById(Long id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void saveQuiz(Quiz quiz) {
	String query = "INSERT INTO quiz(question,answer,options) VALUES (?,?,?)";
	
	try(PreparedStatement preparedStatement = connection.prepareStatement(query)){
		preparedStatement.setString(1, quiz.getQuizQ());
		preparedStatement.setString(2, quiz.getQuizA());
		preparedStatement.setString(3, quiz.getQuizOptions());
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
}

@Override
public void deleteQuiz(Long id) {
	// TODO Auto-generated method stub
	
}
}

