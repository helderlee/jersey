package pro.helderlee.jersey.client.service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import pro.helderlee.jersey.client.model.Planet;

public class PlanetService {

	private Client client;

	private WebTarget webTarget;

	private final String URL_SERVICE = "https://swapi.co/api/planets/";

	public PlanetService() {
		super();
		this.client = ClientBuilder.newClient();
	}

	public Planet buscarPlaneta(Long id) {
		this.webTarget = this.client.target(URL_SERVICE).path(String.valueOf(id));

		Invocation.Builder invocationBuilder = this.webTarget.request("application/json;charset=UTF-8");

		Response response = invocationBuilder.get();

		return response.readEntity(Planet.class);
	}

}
