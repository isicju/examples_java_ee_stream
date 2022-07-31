package com.example.demo.repo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Country {
    private String id;
    private String name;
    private Integer regionId;
}
