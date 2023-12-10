package com.sports;

import com.sports.model.Role;
import com.sports.model.User;
import com.sports.model.UserRole;
import com.sports.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class MyPredictionApplication implements CommandLineRunner{

	@Autowired
	UserService userService;

	public static void main(String[] args) {

		SpringApplication.run(MyPredictionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*User user = new User();
		user.setEmail("xyz@yahoo.com");
		user.setEnabled(true);
		user.setFirstName("Rahul");
		user.setMobile("8985478596");
		user.setLastName("Teja");
		user.setPassword("GJDFr897r9");
		user.setProfile("photo.png");

		Role role = new Role();
		role.setRoleId(33L);
		role.setRoleName("USER");

		Role role1 = new Role();
		role1.setRoleId(44L);
		role1.setRoleName("ADMIN");

		Set<UserRole> userRolesSet = new HashSet<>();

		UserRole userRole = new UserRole();
		userRole.setRole(role);
		userRole.setUser(user);

		UserRole userRole1 = new UserRole();
		userRole1.setRole(role1);
		userRole1.setUser(user);

		userRolesSet.add(userRole);
		userRolesSet.add(userRole1);

		User user1= this.userService.createUser(user, userRolesSet);
		System.out.println(user1.getMobile());*/
		System.out.println("On startup script");
	}
}
