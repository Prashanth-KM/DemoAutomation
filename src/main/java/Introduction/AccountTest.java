package Introduction;

public class AccountTest {
    public static void main(String[] args) {
        Account obj= new Account();
        obj.setAccountName("Current");
        obj.setAccountNumber("36637843793938");
        obj.setAmount(20000);
        String name=obj.getAccountName();
        String number=obj.getAccountNumber();
        int amount=obj.getAmount();
        System.out.println("Acc No :"+name);
        System.out.println("Number :"+number);
        System.out.println("Amount :"+amount);
    }
}
