package ss19StringRegax.BT.validateName;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateName {
    private static String[] names= {"C0318G","M0318G","P0323A","C0989312K"};
    public static void main(String[] args) {
        String regexName = "^(C|A|P)+[0-9]{4}(G|H|I|K|L|M)$";
        Pattern pattern;
        Matcher matcher;
        pattern = Pattern.compile(regexName);
        for(String name : names){
            matcher = pattern.matcher(name);
            boolean isValid = matcher.matches();
            System.out.println("Name: "+ name +" is valid : "+isValid);

        }

    }
}
