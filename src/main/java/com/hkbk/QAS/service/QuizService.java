package com.hkbk.QAS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hkbk.QAS.dao.QuizRepository;
import com.hkbk.QAS.model.Quiz;

@Service
public class QuizService {
	
	@Autowired
	private QuizRepository quizRepository;

  public List<Quiz> getAllQuizzes(){
    return quizRepository.getAllQuizzes();
  }

  public Quiz getQuizById(Long id){
    return quizRepository.getAllQuizzes();
  }
  
  public List<Quiz> getAllQuizzes(){
    return quizRepository.getAllQuizzes();
  }
  
  public List<Quiz> getAllQuizzes(){        
    return quizRepository.getAllQuizzes();
  }

  public List<Quiz> getAllQuizzes(){        
    return quizRepository.getAllQuizzes();
  }
                                          
}

