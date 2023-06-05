package com.example.Dynamic_questionnaires.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Dynamic_questionnaires.entity.Question;
@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {

}
