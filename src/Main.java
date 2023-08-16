public class Main {
    public static void main(String[] args) {

        HDFC sai=new HDFC("sai","sai123",2000);
        System.out.println(sai);
        System.out.println(sai.checkBalance("sai123"));
        System.out.println(sai.getAccountNumber());

    }
}