package com.example.SpringApp;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SaveEmployeeRequestModel {
    private String id;
    private String employee_name;
    private int employee_age;
    private String profile_image;
    private int employee_salary;


}

