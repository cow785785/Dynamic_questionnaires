package com.example.Dynamic_questionnaires.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Dynamic_questionnaires.entity.Form;
@Repository
public interface FormDao extends JpaRepository<Form, Integer> {
	Optional<Form> findByFormName(String formname);
}
