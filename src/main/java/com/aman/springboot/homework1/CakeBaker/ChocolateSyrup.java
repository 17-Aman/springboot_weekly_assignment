package com.aman.springboot.homework1.CakeBaker;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "deploy.cake", havingValue = "Chocolate")
public class ChocolateSyrup implements Syrup {

    @Override
    public String getSyrupType(){
        return "ChocolateSyrup";
    }
}
