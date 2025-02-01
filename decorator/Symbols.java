/**
 * modifies the password by changing specified characters to
 * other specified characters
 * 
 * @author Simion Cartis
 */
public class Symbols extends PasswordDecorator {

    /**
     * constructor that implements the extended classes' constructor
     * (the extended class being PasswordDecorator)
     * 
     * @param passwordBeginning takes in the abstract Password object
     */
    public Symbols(Password passwordBeginning) {
        super(passwordBeginning);
    }

    /**
     * changes specified characters and then returns the newly modified password
     * 
     * @return returns the newly altered password of type string
     */
    public String getPassword() {
        return passwordBeginning.getPassword().replace("a", "@")
                .replace("b", "8").replace("e", "3").replace("g", "9")
                .replace("i", "!").replace("o", "0").replace("s", "$")
                .replace("t", "7");
    }

}
