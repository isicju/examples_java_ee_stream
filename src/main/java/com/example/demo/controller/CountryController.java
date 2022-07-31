package com.example.demo.controller;

import com.example.demo.repo.Country;
import com.example.demo.repo.CountryRepo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@AllArgsConstructor
@RestController
public class CountryController {

    CountryRepo countryRepo;

    @GetMapping("/countries")
    public List<Country> getCountriesJdbcTemplate() throws SQLException {
        return countryRepo.getCountriesJdbcTemplate();
    }

}
