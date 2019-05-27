package com.mycompany.springbootproject;

import com.mycompany.springbootproject.model.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, Long> {
}
