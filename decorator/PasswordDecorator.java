/**
 * the abstract class that extends the abstract Password class.
 * allows for further modification of the password string by other classes which
 * extend it
 * 
 * @author Simion Cartis
 */

public abstract class PasswordDecorator extends Password {
    protected Password passwordBeginning;

    /**
     * constructor which creates a Password object
     * @param passwordBeginning takes in an object of type Password to be initalized 
     */
    public PasswordDecorator(Password passwordBeginning) {
        this.passwordBeginning = passwordBeginning;
    }

    /**
     * creates the abstract getPassword method that is needed in all of the 
     * class' children
     * @return returns a password of type string
     */
    public abstract String getPassword();
}
