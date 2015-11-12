package net.kamradtfamily.randy.samplews;

import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author kamradt
 */
public class Application extends ResourceConfig {
	public Application() {
		register(GreetingResource.class);
	}
}
