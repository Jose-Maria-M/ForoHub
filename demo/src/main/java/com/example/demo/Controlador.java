package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class Controlador {
    @Autowired
    private TopicRepository topicRepository;

    @PostMapping
    public ResponseEntity<Topic> createTopic(@Valid @RequestBody Topic topic) {
        Topic existingTopic = topicRepository.findByTitleAndMessage(topic.getTitle(), topic.getMessage());
        if (existingTopic != null) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        Topic savedTopic = topicRepository.save(topic);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedTopic);
    }

    @GetMapping
    public ResponseEntity<List<Topic>> getAllTopics() {
        List<Topic> topics = topicRepository.findAll();
        return ResponseEntity.ok().body(topics);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Clasetopico> getTopicById(@PathVariable Long id) {
        Clasetopico clasetopico = topicRepository.findById(id).orElse(null);
        if (Clasetopico == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(topic);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Topic> updateTopic(@PathVariable Long id, @Valid @RequestBody Topic topicDetails) {
        Topic topic = topicRepository.findById(id).orElse(null);
        if (topic == null) {
            return ResponseEntity.notFound().build();
        }
        topic.setTitle(topicDetails.getTitle());
        topic.setMessage(topicDetails.getMessage());
        topic.setAuthor(topicDetails.getAuthor());
        topic.setCourse(topicDetails.getCourse());
        Topic updatedTopic = topicRepository.save(topic);
        return ResponseEntity.ok().body(updatedTopic);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTopic(@PathVariable Long id) {
        Topic topic = topicRepository.findById(id).orElse(null);
        if (topic == null) {
            return ResponseEntity.notFound().build();
        }
        topicRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
