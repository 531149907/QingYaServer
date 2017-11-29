package p.hin.qingya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import p.hin.qingya.entity.User;
import p.hin.qingya.service.UserService;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api/user/")
public class UserController {
    @Autowired
    UserService service;

    @RequestMapping(value = "verify/email", method = RequestMethod.POST)
    int verifyUserEmail(String email) {
        return service.checkEmail(email);
    }

    @RequestMapping(value = "verify/username", method = RequestMethod.POST)
    int verifyUserUsername(String username) {
        return service.checkUsername(username);
    }

    @RequestMapping(value = "verify/combination", method = RequestMethod.POST)
    int verifyUserCombination(String email, String password) {
        return service.checkCombination(email, password);
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    User loginUser(User user) {
        return service.getUser(user.getEmail(), user.getPassword());
    }

    @RequestMapping(value = "register", method = RequestMethod.POST)
    User registerUser(User user) {
        service.addNewUser(user);
        return service.getUser(user.getEmail(), user.getPassword());
    }

    @RequestMapping(value = "update/password", method = RequestMethod.POST)
    void updatePassword(int id, String password) {
        service.updateUserPassword(id, password);
    }

    @RequestMapping(value = "update/signature", method = RequestMethod.POST)
    void updateSignature(int id, String signature) {
        service.updateUserSignature(id, signature);
    }

    @RequestMapping(value = "update/username", method = RequestMethod.POST)
    User updateUsername(int id, String username) {
        service.updateUserUsername(id, username);
        return service.getUser(id);
    }
}
