import java.util.Random;

public class RandomCasing extends PasswordDecorator {
    public RandomCasing(Password passwordBeginning) {
        super(passwordBeginning);
    }

    public String getPassword(){
        return randomCap(passwordBeginning.getPassword());
    }

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
