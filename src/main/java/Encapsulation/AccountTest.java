package Encapsulation;

public class AccountTest {
    public static void main(String[] args){
        Account obj = new Account();
        obj.setName("praveen");
        obj.setEmail("praveen@yopmail.com");
        obj.setNumber(2435736353L);
        obj.setAmount(50000);
        System.out.println("Account holder name: "+obj.getName());
        System.out.println("Account number: "+obj.getNumber());
        System.out.println("Account email address: "+obj.getEmail());
        System.out.println("Account balance : "+obj.getAmount());
    }
}
