package org.studyeasy;

//import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/app")
//@Singleton
//(singleton) once we create the object, the object will be there in the memory and the object will serve multiple users over a period of time till the web server is restarted
//default is (not singleton) object will be destroyed automatically after serving the request
public class App {
	
	//about messagebodywriter
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public Name demo() {
//		return new Name("btk", "pann");
//	}
	
	//about singleton
//	private int x = 0;
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public String demo() {
//		return "The value of x is " + (++x);
//	}
	
	
//	@QueryParam("x") String x;
//	@PathParam("demo") String demo;
//	//the two variables x and demo become class level variables, they can be used with all the methods within this class
//	@GET
//	@Path("/{demo}")
//	@Produces(MediaType.TEXT_PLAIN)
//	public String demo() {
//		return "The value of x is " + x + " The value of demo path param is " + demo;
//	}
	
	
	//about param converters
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String demo(@QueryParam("code") Currency currency) {
		return "The code of currency is : " + currency;
	}
}
