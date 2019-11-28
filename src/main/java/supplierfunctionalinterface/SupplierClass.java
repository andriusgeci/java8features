package supplierfunctionalinterface;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierClass {

    public static void main(String[] args) {

        Supplier<Date> s = () -> new Date();
        System.out.println(s.get());

        Supplier<String> randomName = () -> {
            String[] s1 = {"Sunny", "Bunny", "Chinny", "Vinny"};
            int x = (int) (Math.random() * 4);
            return s1[x];
        };
        System.out.println(randomName.get());

        Supplier<String> otp = () -> {
            String pass = "";
            for (int i = 0; i < 6; i++) {
                pass = pass + (int) (Math.random() * 10);
            }
            return pass;
        };
        System.out.println(otp.get());

        Supplier<String> generatedRandomPass = () -> {
            String pwd = "";
            Supplier<Integer> randomDigit = () -> (int) (Math.random() * 10);
            String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
            Supplier<String> randomChars = () -> String.valueOf(symbols.charAt((int) (Math.random() * 29)));
            for (int i = 1; i <= 8; i++) {
                pwd = (i % 2 == 0) ? pwd + randomDigit.get() : pwd + randomChars.get();
            }
            return pwd;
        };
        System.out.println(generatedRandomPass.get());
    }
}
