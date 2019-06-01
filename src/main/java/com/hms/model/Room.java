package com.hms.model;


import lombok.Data;

@Data
public class Room {

    private String id;
    private String roomno;
    private String area;
    private String breakfast;
    private String price;
    private String isflag;
    private String leib;
    private String content;
    private String nono;

    @Override
    public String toString() {
        return "Room{" +
                "id='" + id + '\'' +
                ", roomno='" + roomno + '\'' +
                ", area='" + area + '\'' +
                ", breakfast='" + breakfast + '\'' +
                ", price='" + price + '\'' +
                ", isflag='" + isflag + '\'' +
                ", leib='" + leib + '\'' +
                ", content='" + content + '\'' +
                ", nono='" + nono + '\'' +
                '}';
    }
}
