package com.oocl.packagebooking.entity;

import javax.persistence.*;

@Entity
public class CustomerPackage {
    @Id
    @Column(name="trackNumber")
    private String trackNumber;
    @Column
    private String receiveName;
    @Column
    private String phoneNumber;
    @Column
    private String status;
    @Column
    private String reservationTime;

    public CustomerPackage() {
    }

    public void setTrackNumber(String trackNumber) {
        this.trackNumber = trackNumber;
    }

    public String getTrackNumber() {
        return trackNumber;
    }
    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setReservationTime(String reservationTime) {
        this.reservationTime = reservationTime;
    }

    public String getReceiveName() {
        return receiveName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getStatus() {
        return status;
    }

    public String getReservationTime() {
        return reservationTime;
    }
}
