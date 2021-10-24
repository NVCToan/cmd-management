package com.comaymanagement.cmd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CmdApplication {

	public static void main(String[] args) {
		SpringApplication.run(CmdApplication.class, args);
		
		for(int i =1;i<49;i++) {
			
			System.out.println("UPDATE" + " employees " + "SET active_flag = true where id = " + i +";" );
		}
	}

}
