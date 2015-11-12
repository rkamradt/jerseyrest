package net.kamradtfamily.randy.samplews;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author kamradt
 */
@Path("greeting")
public class GreetingResource {
	@GET
	@Produces("application/json")
	public String getGreeting() {
		return "{\"greeting\": \"hey there\"}";
	}
}
