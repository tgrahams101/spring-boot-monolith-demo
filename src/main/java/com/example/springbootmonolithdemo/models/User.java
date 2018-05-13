package com.example.springbootmonolithdemo.models;

import lombok.*;
import javax.persistence.*;

@Data
@AllArgsConstructor @NoArgsConstructor @Getter @Setter
@Entity
@Table(name = "USERS")
public class User {
    public User(String userName, String firstName, String lastName) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

}

//@Entity
//@Table(name = "USERS")
//public class User {
//
//    @Id
//        @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "USER_NAME")
//    private String userName;
//
//    @Column(name = "FIRST_NAME")
//    private String firstName;
//
//    @Column(name = "LAST_NAME")
//    private String lastName;
//
//    public User() {}
//
//    public Long getId() {
//        return id;
//    }
//
//    public String getUsername() {
//        return userName;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//}