package com.springboot.quick.api.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = Arrays.asList(
			new Topic("Java","Java Course","Java Description"),
			new Topic("Spring","Java Course","Java Description"),
			new Topic("Hibernate","Java Course","Java Description")
			);
	
	public TopicService() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Topic> getTopics()
	{
		return topics;
	}

	public Topic getTopic(String id) {
		// TODO Auto-generated method stub
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

}
