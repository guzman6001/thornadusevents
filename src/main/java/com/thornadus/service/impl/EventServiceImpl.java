package com.thornadus.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.thornadus.commons.GenericServiceImpl;
import com.thornadus.repo.EventRepo;
import com.thornadus.model.Event;
import com.thornadus.service.api.EventServiceAPI;

@Service
public class EventServiceImpl extends GenericServiceImpl<Event, Long> implements EventServiceAPI {

	@Autowired
	private EventRepo eventRepo;
	
	@Override
	public CrudRepository<Event, Long> getRepo() {
		return eventRepo;
	}

}
