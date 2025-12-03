package PetManagementSystem.services;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet {

    @Override
    public void makeNoise(){
        System.out.println("woooooof!");
    }
}
