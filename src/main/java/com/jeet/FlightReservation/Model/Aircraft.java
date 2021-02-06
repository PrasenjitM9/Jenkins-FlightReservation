package com.jeet.FlightReservation.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Aircraft {
	
	@Id
	@GeneratedValue
	private long aircractId;
	private String manufacturer;
	private String model;
	private Integer numberOfSeats;
	
	@OneToMany(mappedBy = "aircraft")
	private List<Flight> flights = new ArrayList<>();

	public Aircraft() {
	}

	public Aircraft(String manufacturer, String model, Integer numberOfSeats) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.numberOfSeats = numberOfSeats;
	}

	public long getAircractId() {
		return aircractId;
	}

	public void setAircractId(long aircractId) {
		this.aircractId = aircractId;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(Integer numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public List<Flight> getFlights() {
		return flights;
	}

	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}
	
	
}