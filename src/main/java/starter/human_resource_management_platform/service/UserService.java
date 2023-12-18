package starter.human_resource_management_platform.service;

import org.springframework.stereotype.Service;
import starter.human_resource_management_platform.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class UserService {
  private final List<User> users = new ArrayList<>();
  private Long idCounter = (long) 1;

  public List<User> getUsers() {
    return users;
  }

  public Optional<User> getUserById(Long id) {
    return users.stream().filter(user -> user.getId().equals(id)).findFirst();
  }

  public User createUser(User user) {
    user.setId(idCounter++);
    users.add(user);
    return user;
  }

  public Optional<User> updateUser(Long id, User newUser) {
    for (User user : users) {
      if (user.getId().equals(id)) {
        user.setName(newUser.getName());
        user.setEmail(newUser.getEmail());
        user.setGender(newUser.getGender());
        user.setPlatform(newUser.getPlatform());
        return Optional.of(user);
      }
    }
    return Optional.empty();
  }

  public boolean deleteUser(Long id) {
    return users.removeIf(user -> user.getId().equals(id));
  }
}
