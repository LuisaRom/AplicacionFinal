package com.example.APP;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		loadEnv();
		SpringApplication.run(AppApplication.class, args);
	}

	private static void loadEnv() {
		Dotenv dotenv = Dotenv.configure()
				.ignoreIfMissing()
				.load();

		if (dotenv.get("DB_URL") != null)
			System.setProperty("DB_URL", dotenv.get("DB_URL"));
		if (dotenv.get("DB_USERNAME") != null)
			System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME"));
		if (dotenv.get("DB_PASSWORD") != null)
			System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));
	}
}
