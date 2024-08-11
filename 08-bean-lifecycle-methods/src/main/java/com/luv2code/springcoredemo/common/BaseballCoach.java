package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    public BaseballCoach() {
        System.out.println("In constructor "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Batting practice-30 mins";
    }
}
