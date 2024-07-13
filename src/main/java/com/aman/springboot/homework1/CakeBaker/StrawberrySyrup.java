package com.aman.springboot.homework1.CakeBaker;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@ConditionalOnProperty(name = "deploy.cake", havingValue = "Strawberry")
public class StrawberrySyrup implements Syrup {

    @Override
    public String getSyrupType(){
        return "StrawberrySyrup";
    }
}
