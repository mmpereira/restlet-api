package com.genebio.nextprot.resource;

import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;
import org.springframework.stereotype.Service;

public class HelloWorldResource extends ServerResource {
	
	@Get()
	public String represent() {
		return "hello world";
	}
	
	//@Post
//	public void firstPost()

}
