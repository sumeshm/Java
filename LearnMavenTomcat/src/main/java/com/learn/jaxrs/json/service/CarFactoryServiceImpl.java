package com.learn.jaxrs.json.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


// http://localhost:8080/LearnMavenTomcat/carfactory/cars

@Path("/carfactory")
public class CarFactoryServiceImpl implements ICarFactoryService
{
	@GET
	@Path("/cars")
	@Produces(MediaType.APPLICATION_JSON)
	public List<CarPojo> getCarList()
	{
		List<CarPojo> carList = new ArrayList<>();
		carList.add(new CarPojo(1, "Kwid"));
		carList.add(new CarPojo(1, "Duster"));
		carList.add(new CarPojo(1, "Fluence"));
		carList.add(new CarPojo(1, "Captur"));

		return carList;
	}
}