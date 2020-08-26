package com.qf.springboot.pojo;

//import lombok.AllArgsConstructor;
import lombok.Data;

@Data
//@AllArgsConstructor
public class User {
    private Integer id;
    private String username;
    private String password;

    public User(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
}
