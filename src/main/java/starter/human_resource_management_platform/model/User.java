package starter.human_resource_management_platform.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class User {
  private Long id;
  private String name;
  private String email;
  private String gender;
  private String platform;

  public User() {
  }

  public User(Long id, String name, String email, String gender, String platform) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.gender = gender;
    this.platform = platform;
  }
}
