package vn.namtran.laptopshop;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LaptopshopApplication {

	public static void main(String[] args) {

		// container
		ApplicationContext namtran = SpringApplication.run(LaptopshopApplication.class, args);

		for (String s : namtran.getBeanDefinitionNames()) {
			System.out.println(s);
		}
	}
}
