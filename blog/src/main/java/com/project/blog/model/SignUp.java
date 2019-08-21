package com.project.blog.model;

import lombok.Data;

import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;

import javax.validation.constraints.Size;

@Data
@Document
@RequiredArgsConstructor
public class SignUp {

    @Id
    private String id;
    @NotBlank
    @Digits(integer=10,message="Invalid mobile number",fraction = 0)
    private String contact;
    @NotBlank
    @Size(min = 7,message = "Invalid email")
    private String email_address;
    @NotBlank
    @Size(min =5,message = "Enter at least 5 characters")
    private  String name;
    @NotBlank
    @Size(min = 8,message = "Must be at least 8 characters")
    private String password;

    @Size(min = 8,message = "Must be at least 8 characters")
    private String confirmpassword;


}