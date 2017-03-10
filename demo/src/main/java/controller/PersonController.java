package controller;

import java.util.Hashtable;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.DemoApplication;
import model.BusRoute;
import model.Person;
import service.PersonService;

@RestController
@RequestMapping("/api")
public class PersonController {
	@Autowired
	PersonService ps;
	
	@RequestMapping("/all")
	public Hashtable<String, Person> getAll()
	{

		return ps.getAll();
	}
	
	@RequestMapping("/direct")
	public BusRoute checkIfDirectRoute(@PathParam("dep_sid") String dep_sid,@PathParam("arr_sid") String arr_sid)
	{

		return ps.getBusRouteInfo(dep_sid, arr_sid);
	}
	
	@RequestMapping("{id}")
	public Person getPerson(@PathVariable("id") String id)
	{
		return ps.getPerson(id);
	}
}
