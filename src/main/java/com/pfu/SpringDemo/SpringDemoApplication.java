package com.pfu.SpringDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringDemoApplication {
	@RequestMapping("/")
	String index(){
		return "Hello,Spring";
	}

	public static void main(String[] args) {

		SpringApplication.run(SpringDemoApplication.class, args);

	}

//	@Bean
//	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
//		return args -> {
//			System.out.println("Lets check out:");
//			String[] names = ctx.getBeanDefinitionNames();
//			Arrays.sort(names);
//			for(String name : names){
//				System.out.println("-- "+name);
//			}
//		};
//	}
}


