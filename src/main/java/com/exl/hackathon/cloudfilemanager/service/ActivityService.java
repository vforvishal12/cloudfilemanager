package com.exl.hackathon.cloudfilemanager.service;

import com.exl.hackathon.cloudfilemanager.entity.Activity;
import com.exl.hackathon.cloudfilemanager.repository.ActivityIF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActivityService {

    @Autowired
    private ActivityIF activityRepo;

    public Activity addActivity(Activity activity){
        return activityRepo.save(activity);
    }

    public List<Activity> getAllActivity(){
        List<Activity> activityList=new ArrayList<>();
        activityRepo.findAll().forEach(activity -> activityList.add(activity));
        return activityList;
    }



}
