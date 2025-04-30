package com.apitraining.movies; //declaring a package

import org.springframework.boot.SpringApplication;                   //class contains run method
import org.springframework.boot.autoconfigure.SpringBootApplication; //Annotations
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController //lets the application know that this is a REST API controller and not just another class
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	} //start run method
	//and pass class to it


}
