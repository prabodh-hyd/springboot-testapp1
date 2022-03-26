package in.prabodh.testbed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages={"in.prabodh"})
@EntityScan(basePackages={"in.prabodh"})
@EnableJpaRepositories({"in.prabodh.repo"})
public class TestbedApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestbedApplication.class, args);
	}

}
