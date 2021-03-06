package p.hin.qingya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import p.hin.qingya.entity.User;
import p.hin.qingya.mapper.UserMapper;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public int checkUsername(String username) {
        if (userMapper.verifyUserByUsername(username) != null) {
            return 0;//用户名已存在
        } else {
            return 1;
        }
    }

    public int checkEmail(String email) {
        if (userMapper.verifyUserByEmail(email) != null) {
            return 0;//email已存在
        } else {
            return 1;
        }
    }

    public void addNewUser(User user) {
        userMapper.addUser(user);
    }

    public int checkCombination(String email, String password) {
        if (userMapper.getUser(email, password) != null) {
            return 1;//成功
        } else {
            return 0;
        }
    }

    public User getUser(int userId) {
        return userMapper.getUser(userId);
    }

    public User getUser(String email, String password) {
        return userMapper.getUser(email, password);
    }

    public void updateUserPassword(int userId, String password) {
        userMapper.updateUserPassword(userId, password);
    }

    public int updateUserUsername(int userId, String username) {
        if (checkUsername(username) == 0) {
            return 0;
        } else {
            userMapper.updateUserUsername(userId, username);
            return 1;
        }
    }

    public void updateUserSignature(int userId, String signature) {
        userMapper.updateUserSignature(userId, signature);
    }
}
