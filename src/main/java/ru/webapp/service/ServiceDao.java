package ru.webapp.service;

import ru.webapp.model.User;

import java.util.List;

public interface ServiceDao {
    public List<User> getAll();
    public void save(User user);
    public User getById(Long id);
    public void update(Long id, User user);
    public void delete(Long id);
}
