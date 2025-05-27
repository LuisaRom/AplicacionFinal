package com.example.APP;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		loadEnv(); // 1. Carga el .env antes de iniciar Spring Boot
		SpringApplication.run(AppApplication.class, args); // 2. Arranca el backend
	}

	private static void loadEnv() {
		Dotenv dotenv = Dotenv.configure()
				.ignoreIfMissing()
				.load();

		// Solo setea si la variable existe en el .env
		if (dotenv.get("DB_URL") != null)
			System.setProperty("DB_URL", dotenv.get("DB_URL"));
		if (dotenv.get("DB_USERNAME") != null)
			System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME"));
		if (dotenv.get("DB_PASSWORD") != null)
			System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));
	}
}
