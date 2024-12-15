package web.services;

import web.models.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findOne(int id);
    void save(User user);
    void delete(int id);
    void update(int id, User updatedUser);

}
