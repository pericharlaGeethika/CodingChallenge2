package entity.model;
import exception.*;
import java.sql.Connection;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import util.DBConnUtil;
import util.DBPropertyUtil;

public class Pet {
	    // Attributes
	    private String name;
	    private int age;
	    private String breed;

	    // Constructor
	 /*   public Pet(String name, int age, String breed) {
	        this.name = name;
	        this.age = age;
	        this.breed = breed;
	    }*/
	    // Getters
	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public String getBreed() {
	        return breed;
	    }

	    // Setters
	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public void setBreed(String breed) {
	        this.breed = breed;
	    }

	    // ToString method
	    public String toString() {
	        return "Name: " + name + ", Age: " + age + ", Breed: " + breed;
	    }
	    public Pet() 
	     {
	    	 System.out.println("default cons");
	     }
	    // Constructor
	    public Pet(String name, int age,String breed )
	    {
	    	 this.name = name;
	    	 this.age = age;
	    	 this.breed = breed;
	    }

	}

