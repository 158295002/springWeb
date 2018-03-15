package com.evada.springweb.jdbc.model;

import org.apache.commons.lang.StringUtils;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

/**
 * @author dingqin
 * @date 2017/11/21
 */
public class PersonRowMapper implements RowMapper<Person> {

    @Override
    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        Person student = new Person();
        student.setId(rs.getString("id"));
        student.setName(rs.getString("name"));
        String iconNames = rs.getString("iconNames");
        if (!StringUtils.isEmpty(iconNames)) {
            String[] strs = iconNames.split(",");
            List<String> icons = Arrays.asList(strs);
            student.setIconNames(icons);
        }
        return student;
    }
}
