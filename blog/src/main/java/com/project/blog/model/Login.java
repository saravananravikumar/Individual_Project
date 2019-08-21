package com.project.blog.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
@Data
@Document
public class Login {
    @NotEmpty
     private String name;
    @NotEmpty(message = "Provide password")
    private String password;




    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

}
