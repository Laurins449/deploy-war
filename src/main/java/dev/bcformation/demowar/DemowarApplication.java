package dev.bcformation.demowar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemowarApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemowarApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(){
		return "[From Deploy War] Bonjour tout le monde V2";
	}


}
