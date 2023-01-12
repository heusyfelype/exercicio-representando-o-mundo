import java.util.UUID;

public class Question {
  private UUID id;
  private String title;
  private String statement;

  Question(String title, String statement){
    this.setId();
    this.setTitle(title);
    this.setStatement(statement);
  }

  public UUID getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }
  public String getStatement() {
    return statement;
  }

  private void setId() {
    this.id = UUID.randomUUID();
  }


  public void setTitle(String title) {
    this.title = title;
  }
  public void setStatement(String statement) {
    this.statement = statement;
  }

  

}
