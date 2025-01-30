import java.util.Random;

public class SpecialChars extends PasswordDecorator {
    public SpecialChars(Password passwordBeginning) {
        super(passwordBeginning);
    }

    public String getPassword(){
        return addSpecial(passwordBeginning.getPassword());
    }

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
