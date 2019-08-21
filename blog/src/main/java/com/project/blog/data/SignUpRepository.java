package com.project.blog.data;

import com.project.blog.model.SignUp;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SignUpRepository extends MongoRepository<SignUp,String> {
    List<SignUp> findByNameAndPassword(String username,String password);
    List<SignUp> findAllByName(String username);
    List<SignUp> findByName(String username);

}
