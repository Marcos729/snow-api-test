package com.snow.question.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.snow.question.model.Question;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class QuestionDTO {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("question")
    @NotBlank(message = "{question.not.blank}")
    @NotNull(message = "{question.not.blank}")
    private String question;

    @JsonProperty("answer")
    @NotBlank(message = "{answer.not.blank}")
    @NotNull(message = "{answer.not.blank}")
    private String answer;

    @JsonProperty("color")
    @NotBlank(message = "{color.not.blank}")
    @NotNull(message = "{color.not.blank}")
    private String color;

    public QuestionDTO() {
    }

    public QuestionDTO(@NotBlank(message = "{question.not.blank}") String question, @NotBlank(message = "{answer.not.blank}") String answer, @NotBlank(message = "{color.not.blank}") String color) {
        this.question = question;
        this.answer = answer;
        this.color = color;
    }

    public QuestionDTO(Integer id, @NotBlank(message = "{question.not.blank}") String question, @NotBlank(message = "{answer.not.blank}") String answer, @NotBlank(message = "{color.not.blank}") String color) {
        this.id = id;
        this.question = question;
        this.answer = answer;
        this.color = color;
    }

    public Question forQuestion(){
        return new Question(this.question, this.answer, this.color);
    }

    public static QuestionDTO forQuestionDTO(Question question){
        return new QuestionDTO(question.getId(), question.getQuestion(), question.getAnswer(), question.getColor());
    }


    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
