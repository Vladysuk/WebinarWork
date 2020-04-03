package ua.lviv.iot.spring.first.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.spring.first.dataaccess.GroupRepository;

import java.awt.*;

@Service
public class GroupService {
    @Autowired
    private GroupRepository groupRepository;

    public List findAll() {
        return (List) groupRepository.findAll();
    }
}
