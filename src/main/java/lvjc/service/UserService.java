package lvjc.service;

import lvjc.model.User;

import java.util.List;

public interface UserService {
    List<User> query();
    int insertUser(User user);
}
