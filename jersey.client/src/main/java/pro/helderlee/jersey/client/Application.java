package pro.helderlee.jersey.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pro.helderlee.jersey.client.model.Planet;
import pro.helderlee.jersey.client.service.PlanetService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		PlanetService ps = new PlanetService();
		Planet p = ps.buscarPlaneta(1L);
		
		System.out.println(p.toString());

	}
}
