package com.aman.springboot.homework1.CakeBaker;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "deploy.cake", havingValue = "Strawberry")
public class StrawberryFrosting implements Frosting {

    @Override
    public String getFrostingType(){
        return "StrawberryFrosting";
    }
}
