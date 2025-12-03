package PetManagementSystem.services;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Pet{

    @Override
    public void makeNoise(){
        System.out.println("MEOOOOOOW!");
    }
}
