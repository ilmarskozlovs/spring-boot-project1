package com.mycompany.springbootproject.services;

import com.mycompany.springbootproject.model.Topic;
import org.springframework.stereotype.Service;

@Service
public interface TopicService {

    void save(Topic topic);

    Topic findById(Long id);

    Iterable<Topic> findAll();

    void removeById(Long id);
}
