package PetManagementSystem.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("BIRD")
public class Bird implements Pet{

    @Override
    public String makeNoise(){
        return "peekpeeeek";
    }
}
