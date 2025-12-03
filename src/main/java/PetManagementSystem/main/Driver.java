package PetManagementSystem.main;

import PetManagementSystem.config.ProjectConfiguration;
import PetManagementSystem.primary.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var person = context.getBean(Person.class);
        person.setName("Danny");
        System.out.println(person);
    }
}
