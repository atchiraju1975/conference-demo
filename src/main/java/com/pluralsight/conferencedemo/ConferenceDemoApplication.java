package com.pluralsight.conferencedemo;

//import org.apache.commons.logging.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConferenceDemoApplication {

	public static void main(String[] args) {
//		Log.d(TAG,"Application Starting");
		SpringApplication.run(ConferenceDemoApplication.class, args);
//		Log.d(tag,"Application Started");
	}

}
