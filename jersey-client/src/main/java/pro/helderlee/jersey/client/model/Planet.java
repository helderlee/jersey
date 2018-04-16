package pro.helderlee.jersey.client.model;

import java.util.Arrays;

public class Planet {

	private String name;
	private String rotation_period;
	private String climate;
	private String terrain;
	private String[] films;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRotation_period() {
		return rotation_period;
	}

	public void setRotation_period(String rotation_period) {
		this.rotation_period = rotation_period;
	}

	public String getClimate() {
		return climate;
	}

	public void setClimate(String climate) {
		this.climate = climate;
	}

	public String getTerrain() {
		return terrain;
	}

	public void setTerrain(String terrain) {
		this.terrain = terrain;
	}

	public String[] getFilms() {
		return films;
	}

	public void setFilms(String[] films) {
		this.films = films;
	}

	@Override
	public String toString() {
		return "Planet [name=" + name + ", rotationPeriod=" + rotation_period + ", climate=" + climate + ", terrain="
				+ terrain + ", films=" + Arrays.toString(films) + "]";
	}

}
