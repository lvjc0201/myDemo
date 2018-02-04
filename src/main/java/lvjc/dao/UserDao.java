package lvjc.dao;

import lvjc.model.User;

import java.util.List;

public interface UserDao {
    List<User> query();
    int insertUser(User user);
}
