package com.snow.question.service.controller;


import com.snow.question.controller.WebServiceQuestionController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class WebServiceQuestionControllerTests {

    @Autowired
    private WebServiceQuestionController webServiceQuestionController;

    @Test
    public void getControllerQuestion(){
//        System.out.println(webServiceQuestionController.get());;
    }
}
