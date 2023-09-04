package atm.service;

public interface AccountService {
    void singUp(String name, String lastName);

    void singIn(String cardNumber, String pinCode);

    void balance(String cardNumber, String pinCode);

    void deposit(String cardNumber, String pinCode);

    void sendToFriend(String friendCardNumber);

    void withdrawMoney(int amount);

    void replenishBalance(int amount);
}
