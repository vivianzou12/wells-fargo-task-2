package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client {
  @Id
  @GeneratedValue
  private Long clientID;

  @Column(nullable = false)
  private Long advisorID;

  @Column(nullable = false)
  private String firstName;

  @Column(nullable = false)
  private String lastName;

  @Column(nullable = false)
  private String address;

  @Column(nullable = false)
  private int phoneNumber;

  @Column(nullable = false)
  private String email;

  protected Client() {

  }

  public Client(String firstName, String lastName, String address, int phoneNumber, String email,
                Long advisorID) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.email = email;
    this.advisorID = advisorID;
  }

  public Long getClientID() {
    return this.clientID;
  }

  public void setClientID(Long clientID) {
    this.clientID = clientID;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setPhoneNumber(int phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Long getAdvisorID() {
    return advisorID;
  }

  public void setAdvisorID(Long advisorID) {
    this.advisorID = advisorID;
  }

  public String getEmail() {
    return email;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getPhoneNumber() {
    return phoneNumber;
  }
}

