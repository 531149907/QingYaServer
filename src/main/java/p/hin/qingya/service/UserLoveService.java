package p.hin.qingya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import p.hin.qingya.entity.UserLove;

import java.util.List;

@Service
public class UserLoveService {
    @Autowired
    UserLoveService userLoveService;

    public List<UserLove> getUserLovesByUserId(int userId) {
        return userLoveService.getUserLovesByUserId(userId);
    }

    public void addUserLove(UserLove userLove) {
        userLoveService.addUserLove(userLove);
    }

    public void deleteUserLoveById(int id) {
        userLoveService.deleteUserLoveById(id);
    }
}
