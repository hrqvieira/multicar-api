package br.com.multicar.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name="usertb")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;
    private String password;
    private String email;
    private String socialName;

    public User(String username, String password, String email, String socialName) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.socialName = socialName;
    }

    public User() {
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
}
