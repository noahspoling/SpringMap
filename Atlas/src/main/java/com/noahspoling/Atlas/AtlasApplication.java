package com.noahspoling.Atlas;

import com.noahspoling.Atlas.Controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;


@SpringBootApplication
@ComponentScan(basePackages = {"com.noahspoling.Atlas.Controller.UserController", "com.noahspoling.Atlas.Controller.MarkerController"})
public class AtlasApplication {
	public static void main(String[] args) {
		SpringApplication.run(AtlasApplication.class, args);
	}

}
