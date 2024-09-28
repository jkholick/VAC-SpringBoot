package com.hkbk.QAS.dao;

import java.util.List;

import com.hkbk.QAS.model.Quiz;

public interface QuizRepository {
  List<Quiz> getAllQuizzes();
  Quiz getQuizById(Long id);
  void saveQuiz(Quiz quiz);
  void deleteQuiz(Long id);
  
}
