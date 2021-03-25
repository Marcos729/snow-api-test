package com.snow.question.repository;

import com.snow.question.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {

    @Query("SELECT q FROM Question q")
    List<Question> findQuestionAll();

    @Query("SELECT q FROM Question q WHERE lower(q.question) like lower(concat('%', ?1,'%'))")
    List<Question> findQuestion(@Param("question") String question);
}
