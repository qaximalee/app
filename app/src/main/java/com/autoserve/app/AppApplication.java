package com.autoserve.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.EventListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AppApplication {

	@Value("${server.port}")
	private int port;
	
	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void onAppStarted() {
		System.out.println(String.format("http://localhost:%d", this.port));
	}

}
