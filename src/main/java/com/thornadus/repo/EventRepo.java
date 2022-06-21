package com.thornadus.repo;

import org.springframework.data.repository.CrudRepository;

import com.thornadus.model.Event;

public interface EventRepo extends CrudRepository<Event, Long> {

}
