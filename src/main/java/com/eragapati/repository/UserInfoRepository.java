package com.eragapati.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eragapati.entity.UserInfo;

@Repository
public interface UserInfoRepository extends CrudRepository<UserInfo, Integer>{

}
