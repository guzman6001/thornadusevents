package com.thornadus.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thornadus.model.Event;
import com.thornadus.service.api.EventServiceAPI;

@RestController
@RequestMapping(value = "/api/")
@CrossOrigin("*")
public class EventRestController {

	@Autowired
	private EventServiceAPI eventServiceAPI;

	@GetMapping(value = "/events")
	public List<Event> getAll() {
		return eventServiceAPI.getAll();
	}
	
	@GetMapping(value = "/events/{id}")
	public Event find(@PathVariable Long id) {
		return eventServiceAPI.get(id);
	}

	@PostMapping(value = "/events")
	public ResponseEntity<Event> save(@RequestBody @Valid Event event) {
		Event obj = eventServiceAPI.save(event);
		return new ResponseEntity<Event>(obj, HttpStatus.OK);
	}

	@DeleteMapping(value = "/events/{id}")
	public ResponseEntity<Event> delete(@PathVariable Long id) {
		Event event = eventServiceAPI.get(id);
		if (event != null) {
			eventServiceAPI.delete(id);
		} else {
			return new ResponseEntity<Event>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<Event>(event, HttpStatus.OK);
	}

}
