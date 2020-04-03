package ua.lviv.iot.spring.first.dataaccess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.spring.first.rest.model.Group;

import java.awt.*;

@Repository
public interface GroupRepository extends JpaRepository<Group, Integer> {


}
