package com.exl.hackathon.cloudfilemanager.repository;

import com.exl.hackathon.cloudfilemanager.entity.Activity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityIF extends MongoRepository<Activity, String> {
}
