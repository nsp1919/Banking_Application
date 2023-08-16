public interface BankAccount {
    String checkBalance(String password);

    String addMoney(int amount);

    String withdrawMoney(int amount,String password);

    String changePassword(String oldPassword,String newPassword);


    double Interest(int year);  //ROI will be vary for each bank


}
