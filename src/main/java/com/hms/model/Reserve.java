package com.hms.model;


import lombok.Data;

@Data
public class Reserve {

    private Integer id;
    private String username;
    private String nickname;
    private String phone;
    private String numcount;
    private String message;
    private String starttime;
    private String endtime;

    @Override
    public String toString() {
        return "Reserve{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", nickname='" + nickname + '\'' +
                ", phone='" + phone + '\'' +
                ", numcount='" + numcount + '\'' +
                ", message='" + message + '\'' +
                ", starttime='" + starttime + '\'' +
                ", endtime='" + endtime + '\'' +
                '}';
    }
}
