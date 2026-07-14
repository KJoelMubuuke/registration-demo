package org.registration.com;


import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Named
@RequestScoped
public class StudentBean {


    @NotBlank(message = "Name is required")
    private String name;
    @NotBlank(message = "Email is required")
    @Email(message = "Valid email address only is allowed")

    private String email;
    private String course;


    @NotNull(message = "Age is required")
    @Min(value = 18, message = "Age can't be negative ")
    private Integer age;
    private String gender;


    public StudentBean(){

            System.out.println("StudentBean object has been created.");



    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public  String save() {

        System.out.println("Student saved");
        System.out.println(name);
        System.out.println(email);
        System.out.println(course);
        System.out.println(age);
        System.out.println(gender);

        return null;
    }




}
