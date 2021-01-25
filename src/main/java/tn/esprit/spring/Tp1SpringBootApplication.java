package tn.esprit.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import tn.esprit.spring.controller.UserRestController;

@SpringBootApplication
@EnableAspectJAutoProxy
public class Tp1SpringBootApplication {

	private static UserRestController controller;
	public static void main(String[] args) {
		ApplicationContext applicationContext= SpringApplication.run(Tp1SpringBootApplication.class, args);
		controller = (UserRestController) applicationContext.getBean("userRestController");
		controller.getUsers().forEach(System.out::println);
	}
	/*
	 * 
	 * @SpringBootApplication
public class SpringBootDataJpaApplication {
private static IUserControl userControl;
public static void main(String[] args) {
//Charger la configuration
ApplicationContext applicationContext =
SpringApplication.run(SpringBootDataJpaApplication.class, args);
//Instantiation du controleur par le container
userControl = (IUserControl)applicationContext.getBean("userControlImpl");
userControl.getAllUsers();
//Ajouter la modification et la suppression TODO
}
}
	 * */

}
