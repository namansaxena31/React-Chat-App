package com.mulchat.demo.Entities;

//import javax.persistence.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "USERS")
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "USERNAME",unique = true)
    private String username;

    @Column(name = "PASSWORD",unique = true)
    private String password;

    @Column(name = "EMAIL",unique = true)
    private String email;

    @Column(name = "PHONENUMBER",unique = true)
    private Long phonenumber;


    @Column(name = "isBot")
    private Boolean isBot;

    @Column(name = "PERSONALITY")
    private String personality;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Boolean getIsBot() {
        return isBot;
    }

    public void setIsBot(Boolean isBot) {
        this.isBot = isBot;
    }

    public String getPersonality() {
        return personality;
    }

    public void setPersonality(String personality) {
        this.personality = personality;
    }

    @Override
    public String toString() {
        return "Users [id=" + id + ", username=" + username +", password=" + password + ", email=" + email + ", phonenumber=" + phonenumber
                + ", isBot=" + isBot + ", personality=" + personality + ", getEmail()=" + getEmail() + ", getId()="
                + getId() + ", getIsBot()=" + getIsBot() + ", getPersonality()=" + getPersonality()
                + ", getPhonenumber()=" + getPhonenumber() + ", getUsername()=" + getUsername() +", getPassword()=" + getPassword() + ", hashCode()="
                + hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Users other = (Users) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (username == null) {
            if (other.username != null)
                return false;
        } else if (!username.equals(other.username))
            return false;
            if (password == null) {
                if (other.password != null)
                    return false;
            } else if (!password.equals(other.password))
                return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (phonenumber == null) {
            if (other.phonenumber != null)
                return false;
        } else if (!phonenumber.equals(other.phonenumber))
            return false;
        if (isBot == null) {
            if (other.isBot != null)
                return false;
        } else if (!isBot.equals(other.isBot))
            return false;
        if (personality == null) {
            if (other.personality != null)
                return false;
        } else if (!personality.equals(other.personality))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((username == null) ? 0 : username.hashCode());
        result = prime * result + ((password == null) ? 0 : password.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((phonenumber == null) ? 0 : phonenumber.hashCode());
        result = prime * result + ((isBot == null) ? 0 : isBot.hashCode());
        result = prime * result + ((personality == null) ? 0 : personality.hashCode());
        return result;
    }

}
