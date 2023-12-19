package starter.human_resource_management_platform.service;

import org.springframework.stereotype.Service;
import starter.human_resource_management_platform.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class UserService {
  private List<User> users = new ArrayList<>(List.of(
    User.builder().id(1L).name("User1").email("user1@example.com").gender("Male").platform("Frontend").build(),
    User.builder().id(2L).name("User2").email("user2@example.com").gender("Female").platform("Backend").build(),
    User.builder().id(3L).name("User3").email("user3@example.com").gender("Male").platform("FullStack").build(),
    User.builder().id(4L).name("User4").email("user4@example.com").gender("Female").platform("Security").build(),
    User.builder().id(5L).name("User5").email("user5@example.com").gender("Male").platform("Frontend").build(),
    User.builder().id(6L).name("User6").email("user6@example.com").gender("Female").platform("Backend").build(),
    User.builder().id(7L).name("User7").email("user7@example.com").gender("Male").platform("FullStack").build(),
    User.builder().id(8L).name("User8").email("user8@example.com").gender("Female").platform("Security").build(),
    User.builder().id(9L).name("User9").email("user9@example.com").gender("Male").platform("Frontend").build(),
    User.builder().id(10L).name("User10").email("user10@example.com").gender("Female").platform("Backend").build(),
    User.builder().id(11L).name("User11").email("user11@example.com").gender("Male").platform("FullStack").build(),
    User.builder().id(12L).name("User12").email("user12@example.com").gender("Female").platform("Security").build(),
    User.builder().id(13L).name("User13").email("user13@example.com").gender("Male").platform("Frontend").build(),
    User.builder().id(14L).name("User14").email("user14@example.com").gender("Female").platform("Backend").build(),
    User.builder().id(15L).name("User15").email("user15@example.com").gender("Male").platform("FullStack").build(),
    User.builder().id(16L).name("User16").email("user16@example.com").gender("Female").platform("Security").build()
  ));
  private Long idCounter = Long.valueOf(users.size());

  public List<User> getUsers() {
    return users;
  }

  public Optional<User> getUserById(Long id) {
    return users.stream().filter(user -> user.getId().equals(id)).findFirst();
  }

  public User createUser(User user) {
    user.setId(++idCounter);
    users.add(user);
    return user;
  }

  public Optional<User> updateUser(Long id, User newUser) {
    for (User user : users) {
      if (user.getId().equals(id)) {
        if (newUser.getName() != null) {
          user.setName(newUser.getName());
        }
        if (newUser.getEmail() != null) {
          user.setEmail(newUser.getEmail());
        }
        if (newUser.getGender() != null) {
          user.setGender(newUser.getGender());
        }
        if (newUser.getPlatform() != null) {
          user.setPlatform(newUser.getPlatform());
        }
        return Optional.of(user);
      }
    }
    return Optional.empty();
  }

  public boolean deleteUser(Long id) {
    return users.removeIf(user -> user.getId().equals(id));
  }
}
