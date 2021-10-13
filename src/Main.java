public class Main {
    public static final String[] validAccount = new String[] { "123abc_", "_abc123", "______", "123456","abcdefgh" };
    public static final String[] invalidAccount = new String[] { ".@", "12345", "1234_", "abcde" };

    public static void main(String[] args) {
       Account account = new Account();
        for (String a:
             validAccount ) {
            boolean isvalid = account.validate(a);
            System.out.println(a +" "+ isvalid);
        }
        for (String b: invalidAccount
             ) {
            boolean isvalid1 = account.validate(b);
            System.out.println(b+" "+isvalid1);
        }
    }
}
