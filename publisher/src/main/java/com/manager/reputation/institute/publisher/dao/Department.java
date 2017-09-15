package com.manager.reputation.institute.publisher.dao;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Department {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    private String instituteId;

    private String name;

    private int strength;

    public Department(String id, String instituteId, String name, int strength) {
        this.id = id;
        this.instituteId = instituteId;
        this.name = name;
        this.strength = strength;
    }

    public Department(String instituteId, String name, int strength) {
        this.instituteId = instituteId;
        this.name = name;
        this.strength = strength;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInstituteId() {
        return instituteId;
    }

    public void setInstituteId(String instituteId) {
        this.instituteId = instituteId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
