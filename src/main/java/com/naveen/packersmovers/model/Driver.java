package com.naveen.packersmovers.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Driver {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;
    private String phone;
    private String fullName;
    private String vehicleNumber;
    private String rideDate;
    private String VehicleType;

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

    public String getvehicleNumber() {
        return vehicleNumber;
    }

    public void setvehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getrideDate() {
        return rideDate;
    }

    public void setrideDate(String rideDate) {
        this.rideDate = rideDate;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(String VehicleType) {
        this.VehicleType = VehicleType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
