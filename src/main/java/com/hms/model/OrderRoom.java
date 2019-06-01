package com.hms.model;

import lombok.Data;

@Data
public class OrderRoom {

    private Integer id;
    private String username;
    private String nickname;
    private String phone;
    private String numcount;
    private String message;
    private String starttime;
    private String endtime;
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
        return "OrderRoom{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", nickname='" + nickname + '\'' +
                ", phone='" + phone + '\'' +
                ", numcount='" + numcount + '\'' +
                ", message='" + message + '\'' +
                ", starttime='" + starttime + '\'' +
                ", endtime='" + endtime + '\'' +
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
