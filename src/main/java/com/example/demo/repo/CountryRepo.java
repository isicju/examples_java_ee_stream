package com.example.demo.repo;

import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@AllArgsConstructor
@Repository
public class CountryRepo {

    JdbcTemplate jdbcTemplate;

    public List<Country> getCountriesJdbcTemplate() throws SQLException {
        return jdbcTemplate.query(
                "SELECT * FROM hr.countries",
                (rs, rowNum) -> new Country(rs.getString("country_id"),
                        rs.getString("country_name"),
                        rs.getInt("region_id")));
    }


}
