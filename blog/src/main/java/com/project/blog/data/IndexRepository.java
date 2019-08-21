package com.project.blog.data;

import com.project.blog.model.Index;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IndexRepository extends MongoRepository<Index,String> {
}
