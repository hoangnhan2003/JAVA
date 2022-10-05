package ss19StringRegax.TH.ValidateAccount;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private Pattern pattern;
    private Matcher matcher;
    private static final String ACCOUNT_REGAX = "^[A-Za-z0-9]{6}$";
    public AccountExample(){
        pattern = Pattern.compile(ACCOUNT_REGAX);
    }
    public boolean validate(String account){
         matcher = pattern.matcher(account);
         return matcher.matches();
    }
}
