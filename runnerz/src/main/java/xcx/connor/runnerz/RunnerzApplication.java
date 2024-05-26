package xcx.connor.runnerz;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import xcx.connor.runnerz.run.Location;
import xcx.connor.runnerz.run.Run;
import xcx.connor.runnerz.run.RunRepository;

@SpringBootApplication
public class RunnerzApplication {

	private static final Logger log = LoggerFactory.getLogger(RunnerzApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RunnerzApplication.class, args);
	}

	// @Bean
	// CommandLineRunner runner(RunRepository runRepository) {
	// return args -> {
	// Run run = new Run(1, "First Run", LocalDateTime.now(),
	// LocalDateTime.now().plus(1, ChronoUnit.HOURS), 5,
	// Location.OUTDOOR);
	// runRepository.create(run);
	// };
	// }

}
