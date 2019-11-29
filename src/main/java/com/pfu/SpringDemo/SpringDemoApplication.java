package com.pfu.SpringDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

@SpringBootApplication
public class SpringDemoApplication {
	public static final int COUNT = 5;
	enum MyType {
		Type1,
		Type2,
	}
	public static void main(String[] args) {

		//SpringApplication.run(SpringDemoApplication.class, args);
		//System.out.printf("time:%s",new Date());


		System.out.printf(new Random().nextInt(100) + "");
	}

	public static void testInput(){
		//标准输入流
		Scanner in = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = in.nextLine();

		System.out.println("How old are you?");
		int age = in.nextInt();

		System.out.printf("Hi, %s , you are %d !",name,age);
	}
}
