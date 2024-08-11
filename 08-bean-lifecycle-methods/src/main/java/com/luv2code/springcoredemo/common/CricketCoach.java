package com.luv2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("In constructor "+getClass().getSimpleName());
    }

    //define init method
    @PostConstruct
    public void doStart()
    {
        System.out.println("In doStart() "+getClass().getSimpleName());
    }


    //define destroy method
  @PreDestroy
    public void doCleanUp()
    {
        System.out.println("In  doCleanUp() "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Daily Target-5km";
    }
}
