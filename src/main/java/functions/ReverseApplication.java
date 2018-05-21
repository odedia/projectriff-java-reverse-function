package functions;

import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReverseApplication {

	@Bean
	public Function<String, String> uppercase() {
		return s -> new StringBuilder(s).reverse().toString();
	}

	public static void main(String[] args) {
		SpringApplication.run(ReverseApplication.class, args);
	}
}
