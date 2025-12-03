package PetManagementSystem.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("DOG")
@Primary
public class Dog implements Pet {

    @Override
    public String makeNoise(){
        return "woooooof!";
    }
}
