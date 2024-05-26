package xcx.connor.runnerz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import foo.bar.WelcomeMessage;

@SpringBootApplication
public class RunnerzApplication {

	public static void main(String[] args) {
		SpringApplication.run(RunnerzApplication.class, args);

		var welcomeMessage = new WelcomeMessage();
		System.out.println(welcomeMessage.getWelcomeMessage());

	}

}
