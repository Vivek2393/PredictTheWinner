package com.sports;

import com.sports.model.Role;
import com.sports.model.User;
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
		role.setRoleId(33L);
		role.setRoleName("ADMIN");

		Role role1 = new Role();
		role1.setRoleId(22L);
		role1.setRoleName("USER");

		role.setUser(user);
		role1.setUser(user);

		HashSet<Role> roles = new HashSet<>();
		roles.add(role);
		roles.add(role1);
		user.setRoles(roles);

		HashSet<Role> hs = new HashSet<>();
		hs.add(role1);

		User userx= this.userService.createUser(user);

		System.out.println(userx.getMobile());

	}
}
