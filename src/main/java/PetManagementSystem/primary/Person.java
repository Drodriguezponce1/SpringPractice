package PetManagementSystem.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import PetManagementSystem.services.Pet;
@Service
public class Person {

    private final Pet pet;
    private String name;

    @Autowired
    public Person(Pet pet){
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "[Person: " + this.getName() + ", Pet Noise: " + pet.makeNoise() + "]";
    }
}
