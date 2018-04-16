package pro.helderlee.jersey.client;

import pro.helderlee.jersey.client.model.Planet;
import pro.helderlee.jersey.client.service.PlanetService;

public class Application {

	public static void main(String[] args) {

		PlanetService ps = new PlanetService();
		Planet p = ps.buscarPlaneta(1L);
		
		System.out.println(p.toString());

	}
}
