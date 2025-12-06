package com.example.JWT_TOKEN.Student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
   private int id;
   private String name;
   private int marks;
}
