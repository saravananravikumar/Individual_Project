package com.project.blog.data;

import com.project.blog.model.Create;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PostRepository extends MongoRepository<Create,String> {
    List<Create> findByName(String name);
    Create findAllByName(String name);
    Create findAllById(String t);
    Create findAllByNameAndId(String s,String t);
    void deleteByName(String s);
    void deleteByNameAndId(String t,String s);
}
