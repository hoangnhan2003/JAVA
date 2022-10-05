package ss19StringRegax.TH.ValidateEmail;

import ss19StringRegax.TH.ValidateEmail.ValidateEmail;

public class Main {
    static String[] validEmail = {"at@gmail.com","ab@yahoo.com","abc@gmail.abc"};
    static String[] invalidEmail = {"t@gmail.com","ab@gmail.","@#abcgmail.com"};

    public static void main(String[] args) {
        ValidateEmail validateEmail = new ValidateEmail();
        for(String email : validEmail){
            boolean isValid = validateEmail.validate(email);
            System.out.println("Email is"+ email +" is valid: "+ isValid);
        }
        for(String email : invalidEmail){
            boolean isValid = validateEmail.validate(email);
            System.out.println("Email is "+ email+" is valid: "+ isValid);
        }
    }

}
