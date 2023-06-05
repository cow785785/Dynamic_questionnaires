package com.example.Dynamic_questionnaires.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Dynamic_questionnaires.entity.Question;
import com.example.Dynamic_questionnaires.entity.QuestionOption;
@Repository
public interface QuestionOptionDao extends JpaRepository<QuestionOption, Integer> {
	@Modifying
	@Query("DELETE FROM QuestionOption qo WHERE qo.question.questionId = :questionId")
	void deleteByQuestion(@Param("questionId") Question question);
}
