package com.example.SpringApp;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "Employees")
public class Employee {
    @Id
    private String id;
    private String employee_name;
    private int employee_age;
    private String profile_image;
    private int employee_salary;

    public static Employee from(SaveEmployeeRequestModel saveEmployeeRequestModel) {
        var newEmployee = new Employee();
        newEmployee.setId(UUID.randomUUID().toString());
        newEmployee.setEmployee_name(saveEmployeeRequestModel.getEmployee_name());
        newEmployee.setEmployee_age(saveEmployeeRequestModel.getEmployee_age());
        newEmployee.setEmployee_salary(saveEmployeeRequestModel.getEmployee_salary());
        return newEmployee;

    }

    public static Employee from(Value value) {
        var newEmployee = new Employee();
        newEmployee.setId(UUID.randomUUID().toString());
        newEmployee.setEmployee_name(value.getEmployee_name());
        newEmployee.setEmployee_age(value.getEmployee_age());
        newEmployee.setEmployee_salary(value.getEmployee_salary());
        return newEmployee;

    }
}