import java.util.Random;

/**
 * class that allows for the creation of the password object as well as the
 * modificatons
 * of replacing spaces with '-', and adding a random number at the ends
 * 
 * @author Simion Cartis
 */
public class EasyPassword extends Password {

  /**
   * constructor for the EasyPassword class. initalizes the password Object's
   * string
   * while also changing the spaces to '-' and adding the random number at the end
   * (this is done in the same step as the initialization)
   * 
   * @param phrase
   */
  public EasyPassword(String phrase) {
    this.password = phrase.replace(" ", "-") + randomNum();
  }

  /**
   * private helper method for creating a random number to then be added at the
   * end of the password
   * 
   * @return returns a random number from 0-99 (inclusive)
   */
  private int randomNum() {
    Random random = new Random();
    return random.nextInt(100);
  }

  /**
   * returns the EasyPassword's password object
   * 
   * @return returns the string "password"
   */
  public String getPassword() {
    return this.password;
  }

}