package com.example.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.pojos.User;

@Service
public class UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public boolean createUser(User newUser) {
        String sql = "INSERT INTO users (nombre, apellidos, fechaNacimiento) VALUES (?, ?, ?)";
        int rowsAffected = jdbcTemplate.update(sql, newUser.getNombre(), newUser.getApellido(), newUser.getFechaNacimiento());
        return rowsAffected > 0;
    }

    public boolean updateUser(int id, User updatedUser) {
        String sql = "UPDATE users SET nombre = ?, apellido = ?, fechaNacimiento = ? WHERE id = ?";
        int rowsAffected = jdbcTemplate.update(sql, updatedUser.getNombre(), updatedUser.getApellido(), updatedUser.getFechaNacimiento(), id);
        return rowsAffected > 0;
    }

    public boolean deleteUser(int id) {
        String sql = "DELETE FROM users WHERE id = ?";
        int rowsAffected = jdbcTemplate.update(sql, id);
        return rowsAffected > 0;
    }

    public List<Map<String, Object>> getAllUsers() {
        String sql = "SELECT * FROM users";
        return jdbcTemplate.queryForList(sql);
    }

    public Map<String, Object> getUserById(int id) {
        String sql = "SELECT * FROM users WHERE id = ?";
        return jdbcTemplate.queryForMap(sql, id);
    }
}
