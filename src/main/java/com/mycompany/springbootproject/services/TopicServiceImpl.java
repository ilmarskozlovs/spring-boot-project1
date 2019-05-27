package com.mycompany.springbootproject.services;

import com.mycompany.springbootproject.TopicRepository;
import com.mycompany.springbootproject.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicServiceImpl implements TopicService {

    @Autowired
    private TopicRepository topicRepository;

    @Override
    public void save(Topic topic) {
        topicRepository.save(topic);
    }

    @Override
    public Topic findById(Long id) {
        return topicRepository.findById(id).orElse(null);
    }

    @Override
    public Iterable<Topic> findAll() {
        return topicRepository.findAll();
    }

    @Override
    public void removeById(Long id) {
        topicRepository.deleteById(id);
    }
}
