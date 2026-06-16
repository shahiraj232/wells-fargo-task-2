package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long clientId;

    @ManyToOne
    @JoinColumn(name = "advisorId")
    private Advisor advisor;

    @Column(nullable = false)
    private String firstname;

    @Column(nullable = false)
    private String lastname;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private Timestamp createdAt;

    protected Client(){

    }
    public Client(Advisor advisor,String firstname,String lastname, String email, Timestamp createdAt ){
        this.advisor = advisor;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.createdAt = createdAt;
    }

    public long getClientId(){
        return clientId;
    }
    public Advisor getAdvisor(){
        return advisor;
    }
    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }
    public String getFirstname(){
        return firstname;
    }
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public Timestamp getCreatedAt(){
        return createdAt;
    }
    public void setCreatedAt(Timestamp createdAt){
        this.createdAt = createdAt;
    }

}
