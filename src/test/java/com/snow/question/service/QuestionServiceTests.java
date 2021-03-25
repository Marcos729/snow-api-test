package com.snow.question.service;

import com.snow.question.model.Question;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class QuestionServiceTests {

    @Autowired
    QuestionService questionService;

    @Test
    public void addQuestionTest(){

        questionService.salvar(new Question("Capital de Roraima?", "Boa Vista", "#FFFFFF"));
    }
}
