public class Pallendrome extends PasswordDecorator{
    public Pallendrome(Password passwordBeginning){
        super(passwordBeginning);
    }
    public String getPassword(){
        String reversed = new StringBuilder(passwordBeginning.getPassword()).reverse().toString();
        return passwordBeginning.getPassword()+reversed;
    }
}
