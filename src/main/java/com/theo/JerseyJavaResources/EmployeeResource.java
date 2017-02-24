package com.theo.JerseyJavaResources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author DuttaAsC
 * Jersey framework is an implementation of JAX-RS with additional features.
 * EmployeeResource class is an implementation of JAX-RS resource.
 * @Path identifies class as a service class.
 */
@Path("/resource")
public class EmployeeResource {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String welcomeMessage() {
		return "Hello Employee !!!";
	}
}
