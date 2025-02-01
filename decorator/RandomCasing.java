import java.util.Random;

/**
 * modifies the password string by randomly changing the capitalization
 * of characters (both upper and lower case have a 50% chance of being
 * applied)
 * 
 * @author Simion Cartis
 */
public class RandomCasing extends PasswordDecorator {

   /**
     * constructor that implements the extended classes' constructor
     * (the extended class being PasswordDecorator)
     * 
     * @param passwordBeginning takes in the abstract Password object
     */
    public RandomCasing(Password passwordBeginning) {
        super(passwordBeginning);
    }

    /**
     * alters the string by randomly changing the capitaliztion, then returns
     * the newly altered string
     * 
     * @return returns the newly altered password of type string
     */
    public String getPassword() {
        return randomCap(passwordBeginning.getPassword());
    }

    /**
     * private helper method for the getPassword method which alters the capitalization of the string
     * @param password takes in the object's password
     * @return returns the new string which has random casing
     */
    private String randomCap(String password) {
        Random random = new Random();
        StringBuilder result = new StringBuilder();
        for (char c : password.toCharArray()) {
            if (random.nextBoolean()) {
                result.append(Character.toUpperCase(c));
            } else
                result.append(Character.toLowerCase(c));
        }
        return result.toString();
    }
}
