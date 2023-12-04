package com.example.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "STU_DATA")
public class StudentEntity {

    @Id
    private int stu_Id;
    private String stu_Name;

    private Float stu_Marks;

    private Boolean stu_Status;
}
