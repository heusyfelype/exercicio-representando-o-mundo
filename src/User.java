import java.util.UUID;

public class User {
  private UUID id;
  private String name;
  private String email;
  private String pass;
  private String university;
  private Question userQuestion;

  User(){
    this.setId();
  }

  private void setId(){
    this.id = UUID.randomUUID();
  }
  
  public void setName(String name) {
    this.name = name;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public void setPass(String pass) {
    this.pass = pass;
  }
  public void setUniversity(String university) {
    this.university = university;
  }

  
  public void setUserQuestion(Question userQuestions) {
    this.userQuestion = userQuestions;
  }

  public UUID getId() {
    return id;
  }
  public String getName() {
    return name;
  }
  public String getEmail() {
    return email;
  }
  public String getPass() {
    return pass;
  }
  public String getUniversity() {
    return university;
  }

  public Question getUserQuestions() {
    return userQuestion;
  }
  
  
}
