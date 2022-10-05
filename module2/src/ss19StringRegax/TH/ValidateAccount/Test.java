package ss19StringRegax.TH.ValidateAccount;

public class Test {
    private static String[] accounts = {"ngohoangnhan","hihi","12aSdada","a","asc","@12adf12","oisAsd"};

    public static void main(String[] args) {
        AccountExample accountExample = new AccountExample();
        for(String account : accounts){
            boolean isValid = accountExample.validate(account);
            System.out.println("Account "+ account+" is valid : "+ isValid);
        }
    }
}
