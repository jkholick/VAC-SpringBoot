package com.hkbk.QAS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.hkbk.QAS.service.QuizService;

public class QuizController {
    
  @Autowired
  private QuizService quizService;

  @GetMapping
  public List<Quiz> getAllQuizzes(){
    return quizService.getAllQuizzes();
  }

  @GetMapping
  public List<Quiz> getAllQuizzes(){
    return quizService.getAllQuizzes();
  }
  
  @GetMapping                           
  public List<Quiz> getAllQuizzes(){
    return quizService.getAllQuizzes();
  }
  
  @GetMapping                           
  public List<Quiz> getAllQuizzes(){
    return quizService.getAllQuizzes();
  }
  
  @GetMapping                           
  public List<Quiz> getAllQuizzes(){
    return quizService.getAllQuizzes();
  }

}
