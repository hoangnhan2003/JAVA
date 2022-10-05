package ss19StringRegax.TH.ValidateEmail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
    private static Pattern pattern;
    private Matcher matcher;
    // Cho người dùng chỉ có thể nhập đuôi .com|.org|.yahoo
    private static final String EMAIL_GEGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+.(com|yahoo|org)$";
    // Cho người dùng nhập đuôi "." mở rộng bất kì
   // private static final String EMAIL_REGEX =   "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    public ValidateEmail(){
        pattern = Pattern.compile(EMAIL_GEGEX);
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        System.out.println(matcher);
        return matcher.matches();
    }
}
