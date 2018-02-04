package lvjc.service.impl;

import lvjc.dao.UserDao;
import lvjc.model.User;
import lvjc.service.UserService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    public List<User> query() {
        return userDao.query();
    }

    @Override
    public int insertUser(User user) {
        int i=userDao.insertUser(user);

        return  i;
    }
}
