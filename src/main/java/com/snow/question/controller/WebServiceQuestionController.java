package com.snow.question.controller;

import com.snow.question.model.Question;
import com.snow.question.model.dto.QuestionDTO;
import com.snow.question.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class WebServiceQuestionController {

    @Autowired
    private QuestionService questionService;


    @RequestMapping(value = "/get", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE, consumes = {
            MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_OCTET_STREAM_VALUE })
    @ResponseBody
    public ResponseEntity<List<Question>> get(@RequestParam(value = "search", required = false) String search){
        List<Question> questionList = questionService.findQuestionAll(search);

        return new ResponseEntity<>(questionList, HttpStatus.OK);
    }

    @PostMapping(value = "/add",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Question> salvar(@Valid @RequestBody QuestionDTO dto, BindingResult result) {
        if(result.hasErrors()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }else{
            Question question = questionService.salvar(dto.forQuestion());
            return new ResponseEntity<>(question, HttpStatus.CREATED);
        }
    }
}
