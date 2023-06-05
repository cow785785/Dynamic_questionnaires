package com.example.Dynamic_questionnaires.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Dynamic_questionnaires.entity.UserInfo;
@Repository
public interface UserInfoDao extends JpaRepository<UserInfo, Integer> {

}
