package starter.human_resource_management_platform.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import starter.human_resource_management_platform.model.User;
import starter.human_resource_management_platform.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping
  public List<User> getUsers() {
    return userService.getUsers();
  }

  @GetMapping("/{id}")
  public Optional<User> getUserById(@PathVariable("id") Long id) {
    return userService.getUserById(id);
  }

  @PostMapping
  public User createUser(@RequestBody User user) {
    System.out.println("55688");
    System.out.println(user);
    return userService.createUser(user);
  }

  @PutMapping("/{id}")
  public Optional<User> updateUser(@PathVariable("id") Long id, @RequestBody User newUser) {
    return userService.updateUser(id, newUser);
  }

  @DeleteMapping("/{id}")
  public boolean deleteUser(@PathVariable("id") Long id) {
    return userService.deleteUser(id);
  }
}
