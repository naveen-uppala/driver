package com.naveen.packersmovers.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Customer {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;
    private String phone;
    private String fullName;
    private String fromAddress;
    private String toAddress;
    private String email;
    private String estDate;
    private String moveSize;

	/*
	 * public User() {
	 * 
	 * }
	 */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfullName() {
        return fullName;
    }

    public void setfullName(String fullName) {
        this.fullName = fullName;
    }

    public String getfromAddress() {
        return fromAddress;
    }

    public void setfromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String gettoAddress() {
        return toAddress;
    }

    public void settoAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getestDate() {
        return estDate;
    }

    public void setestDate(String estDate) {
        this.estDate = estDate;
    }

    public String getmoveSize() {
        return moveSize ;
    }

    public void setmoveSize(String moveSize) {
        this.moveSize = moveSize;
    }
}
