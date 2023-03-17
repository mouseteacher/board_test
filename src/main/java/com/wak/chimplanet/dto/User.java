//package com.wak.chimplanet.dto;
//
//import lombok.*;
//
//import javax.persistence.*;
//
//@Entity
//@Getter
//@Setter
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
//@ToString(of = {"id","username","age"})
//public class User {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "user_id")
//    private Long id;
//    private String username;
//    private int age;
//
//
//    public User(String username) {
//        this(username, 0);
//    }
//
//    public User(String username, int age) {
//        this.username = username;
//        this.age = age;
//    }
//
//
//}