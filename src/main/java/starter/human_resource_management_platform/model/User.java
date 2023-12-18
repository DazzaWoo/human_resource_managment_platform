package starter.human_resource_management_platform.model;

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

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getGender() {
    return this.gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getPlatform() {
    return this.platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  @Override
  public String toString() {
    return "{" +
      " id='" + getId() + "'" +
      ", name='" + getName() + "'" +
      ", email='" + getEmail() + "'" +
      ", gender='" + getGender() + "'" +
      ", platform='" + getPlatform() + "'" +
      "}";
  }
}
