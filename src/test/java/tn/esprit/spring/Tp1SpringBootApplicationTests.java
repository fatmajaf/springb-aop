package tn.esprit.spring;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entity.Role;
import tn.esprit.spring.entity.User;
import tn.esprit.spring.service.UserService;
@RunWith(SpringRunner.class)
@SpringBootTest
class Tp1SpringBootApplicationTests {
	@Autowired
	UserService us;
	@Test
	void contextLoads() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		 Date d = dateFormat.parse("2015-03-23");
		 //sinon :
	    
		System.out.println("Date modifiée : " + d);
		//User u = new User(1L, "Mayssa", "Mayssa", new Date(),Role.STUDENT);
		 User u = new User("Mayssa","Mayssa", Role.TECHNICIEN, d);
		 us.addUser(u); 
	}
	

}
