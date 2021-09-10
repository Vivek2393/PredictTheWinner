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
		User user = new User();
		user.setEmail("blogupvivek@gmail.com");
		user.setEnabled(true);
		user.setFirstName("Vivek");
		user.setMobile("7415102635");
		user.setLastName("Mishra");
		user.setPassword("hfskdhfkdsh");
		user.setProfile("default.png");

		Role role = new Role();
		role.setRoleId(44L);
		role.setRoleName("ADMIN");

		Set<UserRole> userRolesSet = new HashSet<>();

		UserRole userRole = new UserRole();
		userRole.setRole(role);
		userRole.setUser(user);
		userRolesSet.add(userRole);

		User user1= this.userService.createUser(user, userRolesSet);
		System.out.println(user1.getMobile());

	}
}
