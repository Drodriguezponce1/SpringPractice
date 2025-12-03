package PetManagementSystem.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
    basePackages = {"PetManagementSystem/primary", "PetManagementSystem/services"}
)
public class ProjectConfiguration {
}
