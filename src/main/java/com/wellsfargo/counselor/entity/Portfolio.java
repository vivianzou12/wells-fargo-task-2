package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {
  @GeneratedValue
  @Id
  private Long portfolioID;

  @Column(nullable = false)
  private Long clientID;

  @Column(nullable = false)
  private String creationDate;

  protected Portfolio() {

  }

  public Portfolio(Long clientID, String creationDate) {
    this.clientID = clientID;
    this.creationDate = creationDate;
  }

  public Long getClientID() {
    return clientID;
  }

  public String getCreationDate() {
    return creationDate;
  }

  public void setClientID(Long clientID) {
    this.clientID = clientID;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }
}

