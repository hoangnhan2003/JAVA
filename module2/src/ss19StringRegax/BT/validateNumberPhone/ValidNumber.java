package ss19StringRegax.BT.validateNumberPhone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidNumber {
    private static String[] numberPhones = {"84-0978489648","84-097848964","84097848964","84-0978489646"};
    public static void main(String[] args) {
        String regexNum = "^[0-9]{2}(-0)[0-9]{9}";
        Pattern pattern;
        Matcher matcher;
        pattern = Pattern.compile(regexNum);
        for(String number : numberPhones){
            matcher = pattern.matcher(number);
            boolean isValid = matcher.matches();
            System.out.println("Number phone : "+ number +" is valid : "+isValid);
        }
        String x = "    afasdfadsfa   ";
        System.out.println(x.trim());
    }
}
