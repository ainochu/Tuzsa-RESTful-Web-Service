package main.java.application;

import main.java.controller.PosteController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackageClasses=PosteController.class)
public class Application {
	
	public static void main(String args[]) {
		SpringApplication.run(Application.class, args);
		
	}

}
