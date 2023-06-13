package com.atom.springbootbasics.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * This class will be responsible for handling all the business logic. It will be a singleton also known as business service.
 */
@Service
public class TopicService {
    private static List<Topic> topics = new ArrayList<>(List.of(
            new Topic("spring", "Spring Framework", "Spring Framework Description"),
            new Topic("java", "Core Java", "Core Java Description"),
            new Topic("javascript", "JavaScript", "JavaScript Description")
    ));
    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }
}
