package PetManagementSystem.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("CAT")
public class Cat implements Pet{

    @Override
    public String makeNoise(){
        return "MEOOOOOOW!";
    }
}
