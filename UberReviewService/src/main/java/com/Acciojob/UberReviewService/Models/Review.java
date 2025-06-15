package com.Acciojob.UberReviewService.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Review {
    @Id
    Long id; // this anotaion is the primary key in the our tables
    String name;
    String address;

}
