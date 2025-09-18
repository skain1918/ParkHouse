package cz.kolonicnystepan.parkhouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@SpringBootApplication
public class ParkhouseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkhouseApplication.class, args);
	}

}
