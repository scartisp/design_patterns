/**
 * modifies the password string by adding a reversed version of it
 * at the end
 * 
 * @author Simion Cartis
 */
public class Pallendrome extends PasswordDecorator {

    /**
     * constructor that implements the extended classes' constructor
     * (the extended class being PasswordDecorator)
     * 
     * @param passwordBeginning takes in the abstract Password object
     */
    public Pallendrome(Password passwordBeginning) {
        super(passwordBeginning);
    }

    /**
     * returns the object password (of type string) with the reversed version of it
     * added at the end
     * 
     * @return the string password modified to be a pallendrome
     */
    public String getPassword() {
        String reversed = new StringBuilder(passwordBeginning.getPassword()).reverse().toString();
        return passwordBeginning.getPassword() + reversed;
    }
}
