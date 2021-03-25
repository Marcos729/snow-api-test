package com.snow.question.service;

import com.snow.question.model.Question;
import com.snow.question.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public Question salvar(Question question){
        return questionRepository.save(question);
    }

    public List<Question> findQuestionAll(String search){
        if (search != null){
            return questionRepository.findQuestion(search);
        }else{
            return questionRepository.findQuestionAll();
        }
    }
}
