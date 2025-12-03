package PetManagementSystem.services;

import org.springframework.stereotype.Component;

@Component
public class Bird implements Pet{

    @Override
    public void makeNoise(){
        System.out.println("peekpeeeek");
    }
}
