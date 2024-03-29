package platform.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = {"platform"} )
@EnableMongoRepositories(basePackages = {"platform"})
public class Main{

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
