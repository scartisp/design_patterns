import java.util.Random;

/**
 * modifies the password string by adding random characters
 * after every pre-existing characters (there is a 1/3 chance of doing this)
 * 
 * @author Simion Cartis
 */
public class SpecialChars extends PasswordDecorator {

    /**
     * constructor that implements the extended classes' constructor
     * (the extended class being PasswordDecorator)
     * 
     * @param passwordBeginning takes in the abstract Password object
     */
    public SpecialChars(Password passwordBeginning) {
        super(passwordBeginning);
    }

    /**
     * alters the string by having a 1/3 chance to add a special character
     * after every pre-existing character, then returns the altered string
     * 
     * @return returns the altered password of type string
     */
    public String getPassword() {
        return addSpecial(passwordBeginning.getPassword());
    }

    /**
     * private helper method for the getPassword method that adds the special character to
     * the string
     * 
     * @param password takes in the object's password
     * @return returns the newly altered string
     */
    private String addSpecial(String password) {
        Random random = new Random();
        StringBuilder result = new StringBuilder();
        char[] specialChars = { '*', '!', '%', '+', '.', '{', '}' };

        for (char c : password.toCharArray()) {
            int randomNum = random.nextInt(3);
            result.append(c);
            if (randomNum == 0) {
                char randomChar = specialChars[random.nextInt(specialChars.length)];
                result.append(randomChar);
            }
        }
        return result.toString();

    }
}


