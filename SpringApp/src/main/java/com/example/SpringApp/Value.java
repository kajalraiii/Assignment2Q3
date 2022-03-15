package com.example.SpringApp;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Value {
    private String id;
    private String employee_name;
    private int employee_age;
    private String profile_image;
    private int employee_salary;
    private boolean b;


    @Override
    public String toString() {
        return "Value [id=" + id + ", employee_name=" + employee_name + ", employee_age=" + employee_age
                + ", profile_image=" + profile_image + "]";
    }

    public boolean setEligibleForLoan(boolean b) {
        return b;
    }
}
