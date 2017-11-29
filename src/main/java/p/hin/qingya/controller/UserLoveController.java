package p.hin.qingya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import p.hin.qingya.entity.UserLove;
import p.hin.qingya.service.UserLoveService;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api/love")
public class UserLoveController {
    @Autowired
    UserLoveService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    void deleteCollectionItem(@PathVariable("id") int id) {
        service.deleteUserLoveById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    List<UserLove> getCollections(int userId) {
        return service.getUserLovesByUserId(userId);
    }

    @RequestMapping(method = RequestMethod.POST)
    void addCollectionItem(UserLove userLove) {
        service.addUserLove(userLove);
    }
}
