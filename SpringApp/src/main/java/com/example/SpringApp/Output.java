package com.example.SpringApp;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Output {

    private String status;
    private List<Value> data;
    private String message;

    @Override
    public String toString() {
        return "OuterStatus {status=" + status + ", data=" + data + ", message=" + message + "}";
    }
}