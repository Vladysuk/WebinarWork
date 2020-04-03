package ua.lviv.iot.spring.first.rest.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.spring.first.business.GroupService;
import ua.lviv.iot.spring.first.rest.model.Group;

import java.awt.*;

@RequestMapping("/groups")
@RestController
public class GroupController {

    @Autowired
    private GroupService groupService;

    @GetMapping
    public List getAllGroups(){
        return groupService.findAll();
    }

}
