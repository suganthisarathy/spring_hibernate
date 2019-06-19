package com.pack.form;

import javax.persistence.Entity;

import javax.persistence.Table;

@Entity
@Table(name="signup",schema="OLXResale")
public class User {
       private String firstname;
       private String lastname;
       private int age;
       private String gender;
       private String contactnumber;
       private String password;
       private String email;
       private String city;
       private String sublocation;
       private String state;
       private String pincode;
       private String country;
       private String street;
       public String getFirstname() {
              return firstname;
       }
       public void setFirstname(String firstname) {
              this.firstname = firstname;
       }
       public String getLastname() {
              return lastname;
       }
       public void setLastname(String lastname) {
              this.lastname = lastname;
       }
       public int getAge() {
              return age;
       }
       public void setAge(int age) {
              this.age = age;
       }
       public String getGender() {
              return gender;
       }
       public void setGender(String gender) {
              this.gender = gender;
       }
       public String getContactnumber() {
              return contactnumber;
       }
       public void setContactnumber(String contactnumber) {
              this.contactnumber = contactnumber;
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
       public String getCity() {
              return city;
       }
       public void setCity(String city) {
              this.city = city;
       }
       public String getSublocation() {
              return sublocation;
       }
       public void setSublocation(String sublocation) {
              this.sublocation = sublocation;
       }
       public String getState() {
              return state;
       }
       public void setState(String state) {
              this.state = state;
       }
       public String getPincode() {
              return pincode;
       }
       public void setPincode(String pincode) {
              this.pincode = pincode;
       }
       public String getCountry() {
              return country;
       }
       public void setCountry(String country) {
              this.country = country;
       }
       public String getStreet() {
              return street;
       }
       public void setStreet(String street) {
              this.street = street;
       }      
}

