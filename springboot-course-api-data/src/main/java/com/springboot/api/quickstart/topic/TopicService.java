package com.springboot.api.quickstart.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private RepositoryService repositoryService;
	
	public TopicService() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Topic> getTopics()
	{
		ArrayList<Topic> topics = new ArrayList<>();		
		repositoryService.findAll().forEach(topics::add);
		return topics;
	}

	public Topic getTopic(String id) {		
		return repositoryService.findById(id).get();
	}

	public void addTopic(Topic topic) {		
		repositoryService.save(topic);
	}
	
	public void updateTopic(Topic topic, String id)
	{		
		repositoryService.save(topic);		
	}
	
	public void deleteTopic(String id)
	{
		repositoryService.deleteById(id);
	}

}
