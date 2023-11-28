package com.gte3.mongodemo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
//hello from azure devops s
@Data 
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student implements Serializable {

    @Id
    private String id;

    private int CIN;
    private String name;
    private String email;
    private int phoneNumber;

}
