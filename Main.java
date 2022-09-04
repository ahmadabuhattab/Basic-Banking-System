public class Main {
 
    public static void main(String[] args) {
       Bank account = new Bank();
 
       account.setCustomerName("Michael Scott");
       account.setAccountNumber("2148548473");
       account.setPhoneNumber("570-346-6563");
       account.setEmail("michaelscott@scranton.com");
       account.setBalance(3424.23);
 
        System.out.println("Name: " + account.getCustomerName());
        System.out.println("Email: " + account.getEmail());
        System.out.println("Phone Number: " + account.getPhoneNumber());
        System.out.println("Account ID: " + account.getAccountNumber());
        System.out.println("$" + account.getBalance());
 
        System.out.println("$" + account.depositFunds(123));
        System.out.println("$" + account.withdrawFunds(10000));
    }
}
