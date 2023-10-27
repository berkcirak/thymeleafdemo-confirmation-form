package com.example.thymeleafdemo.model;

import java.util.List;

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private String favoriteLanguage;
    private List<String> operatingSystems;
    public Student(){

    }

    public void setOperatingSystems(List<String> operatingSystems){
        this.operatingSystems=operatingSystems;
    }
    public List<String> getOperatingSystems(){
        return operatingSystems;
    }
    public void setFavoriteLanguage(String favoriteLanguage){
        this.favoriteLanguage=favoriteLanguage;
    }
    public String getFavoriteLanguage(){
        return favoriteLanguage;
    }
    public void setCountry(String country){
        this.country=country;
    }
    public String getCountry(){
        return country;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getLastName(){
        return lastName;
    }



}
