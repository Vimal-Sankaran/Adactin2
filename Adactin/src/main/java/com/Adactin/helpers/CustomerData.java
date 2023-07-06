package com.Adactin.helpers;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerData {

    @JsonProperty("id")
    private String id;
    @JsonProperty("username")
    private String username;
    @JsonProperty("password")
    private String password;
    @JsonProperty("location")
    private String location;
    @JsonProperty("hotelName")
    private String hotelName;
    @JsonProperty("roomType")
    private String roomType;
    @JsonProperty("noOfRooms")
    private String noOfRooms;
    @JsonProperty("adults")
    private String adults;
    @JsonProperty("child")
    private String child;
    @JsonProperty("dateIn")
    private String dateIn;
    @JsonProperty("dateOut")
    private String dateOut;
    public String getDateOut() {
        return dateOut;
    }
    public void setDateOut(String dateOut1) {
        this.dateOut = dateOut1;
    }
    public String getDateIn() {
        return dateIn;
    }
    public void setDateIn(String dateIn) {
        this.dateIn = dateIn;
    }
    public String getNoOfRoom() {return noOfRooms;    }
    public void setNoofroom(String noofroom) {this.noOfRooms = noofroom;    }
    public String getChild() { return child;  }
    public void setChild(String child) {  this.child = child; }
    public String getAdults() {return adults;    }
    public void setAdults(String adults) {this.adults = adults;  }
    public String getRoomtype() {return roomType;}
    public void setRoomtype(String roomtype) { this.roomType = roomtype;}
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getHotelName() { return hotelName;    }
    public void setHotelName(String hotelName) { this.hotelName = hotelName;    }
}
