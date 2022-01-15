package com.springboot.api.quickstart.topic;

import org.springframework.data.repository.CrudRepository;

public interface RepositoryService extends CrudRepository<Topic, String> {


}
