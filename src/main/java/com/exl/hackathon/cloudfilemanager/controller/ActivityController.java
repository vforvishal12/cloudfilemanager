package com.exl.hackathon.cloudfilemanager.controller;

import com.exl.hackathon.cloudfilemanager.entity.Activity;
import com.exl.hackathon.cloudfilemanager.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/activities")
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @PostMapping
    public Activity addActivity(@RequestBody Activity activity){
        return activityService.addActivity(activity);
    }

    @GetMapping
    public List<Activity> getAllActivity(){
        return activityService.getAllActivity();
    }

}
