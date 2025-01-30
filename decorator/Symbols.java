public class Symbols extends PasswordDecorator {
    public Symbols(Password passwordBeginning) {
        super(passwordBeginning);
        this.password = passwordBeginning.getPassword();
    }

    public String getPassword() {
        return passwordBeginning.getPassword().replace("a", "@")
        .replace("b", "8").replace("e", "3").replace("g", "9")
        .replace("i", "!").replace("o", "0").replace("s", "$")
        .replace("t", "7");
    }

}
