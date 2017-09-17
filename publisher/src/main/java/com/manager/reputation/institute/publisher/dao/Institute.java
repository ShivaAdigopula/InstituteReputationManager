package com.manager.reputation.institute.publisher.dao;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Institute {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    private String name;

    private String licenceNumber;

    private boolean govtRecognized;

    @Embedded
    private Address address;

    private String foundedBy;

    @Embedded
    private ContactDetails contactDetails;

    private InstituteType instituteType;

    private String foundedOn;

    public Institute(String id, String name, String licenceNumber, boolean govtRecognized, Address address, String foundedOn) {
        this.id = id;
        this.name = name;
        this.licenceNumber = licenceNumber;
        this.govtRecognized = govtRecognized;
        this.address = address;
        this.foundedOn = foundedOn;
    }

    public Institute(String name, String licenceNumber, boolean govtRecognized, Address address, String foundedOn) {
        this.name = name;
        this.licenceNumber = licenceNumber;
        this.govtRecognized = govtRecognized;
        this.address = address;
        this.foundedOn = foundedOn;
    }

    public Institute(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public boolean isGovtRecognized() {
        return govtRecognized;
    }

    public void setGovtRecognized(boolean govtRecognized) {
        this.govtRecognized = govtRecognized;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFoundedOn() {
        return foundedOn;
    }

    public void setFoundedOn(String foundedOn) {
        this.foundedOn = foundedOn;
    }

    public String getFoundedBy() {
        return foundedBy;
    }

    public void setFoundedBy(String foundedBy) {
        this.foundedBy = foundedBy;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    public InstituteType getInstituteType() {
        return instituteType;
    }

    public void setInstituteType(InstituteType instituteType) {
        this.instituteType = instituteType;
    }
}
