package com.dandara.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

public class ProcedureCaller {
    final JdbcTemplate jdbcTemplate;

    @Autowired
    public ProcedureCaller(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public <T> T callQuery(Class<T> classe, String queryName, Object[] params){
        List<T> list = callQueryList(classe,queryName, params);

        if(list == null || list.size() == 0) {
            return null;
        }

        return list.get(0);
    }

    public <T> List<T> callQueryList(Class<T> classe, String queryName, Object[] params){
        List<T> list = new ArrayList<>();
        jdbcTemplate.query(queryName,
                params,
                (rs, rowNum) -> list.add((new BeanPropertyRowMapper<>(classe)).mapRow(rs, rowNum)));
        return list;
    }
}
