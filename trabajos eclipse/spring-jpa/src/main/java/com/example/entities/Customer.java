package com.example.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "CUSTOMERS")
public class Customer {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "ID")
long id;
@Column (name = "NAME")
String name;

@Column (name = "SURNAME")
String surname;

 @Column (name = "BIRTDATE")
 String birtdate;
 
 @Column (name = "PHONE")
 String phone;
}
