package CaseStudy.ManageResort.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public boolean validateEmail(String s){
        String regex =  "^[\\w.]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+){1,2}$";
        return regex.matches(s);
    }
    public boolean validateID(String id){
        String regex =  "^([\\d]{9}|[\\d]{12})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }
}
