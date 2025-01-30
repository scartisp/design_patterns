import java.util.Random;

public class EasyPassword extends Password {

  public EasyPassword(String phrase) {
    this.password = phrase.replace(" ", "-") + randomNum();
  }

  public String getPassword() {
    return this.password;
  }

  private int randomNum() {
    Random random = new Random();
    return random.nextInt(100);
  }
}
