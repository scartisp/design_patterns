/**
 * abstract class that creates the password object and sets up the required
 * methods for it
 * 
 * @author Simion Cartis
 */
public abstract class Password {
    protected String password;

    /**
     * method that is used to retrieve the password string
     * 
     * @return returns the string "password"
     */
    public abstract String getPassword();
}
