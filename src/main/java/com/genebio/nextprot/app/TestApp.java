package com.genebio.nextprot.app;

import org.restlet.Application;
import org.restlet.Component;
import org.restlet.Restlet;
import org.restlet.data.Protocol;
import org.restlet.routing.Router;

import com.genebio.nextprot.resource.HelloWorldResource;

public class TestApp extends Application {
	
	@Override
    public Restlet createInboundRoot() {
        // Create a router Restlet that routes each call to a
        // new instance of HelloWorldResource.
        Router router = new Router(getContext());

        // Defines only one route
        router.attachDefault(HelloWorldResource.class);

        return router;
    }
	
	public static void main(String[] args) {
	    try {
	        // Create a new Component.
	        Component component = new Component();

	        // Add a new HTTP server listening on port 8182.
	        component.getServers().add(Protocol.HTTP, 8182);

	        // Attach the sample application.
	        component.getDefaultHost().attach(new TestApp());

	        // Start the component.
	        component.start();
	    } catch (Exception e) {
	        // Something is wrong.
	        e.printStackTrace();
	    }
	}
}
