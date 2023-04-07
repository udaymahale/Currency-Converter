
//Currency Converter 

import java.util.*;
import java.text.DecimalFormat; //used for formating numbers as per customized format and as per local

public class CurrencyConverter {
    public static void main(String args[]) {
        Double amount, code, usdollar, euro, rupee, britishpound, afghanigani, argentinapeso, australiandollar,
                bangladeshitaka, brazilianreal, canadiandollar, chineseyuan, danishkrone, hongkongdollar, iranianrial,
                japaneseyen, kuwaitdinar;

        DecimalFormat f = new DecimalFormat();
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("CURRENCY CONVERTER");
        System.out.println();
        System.out.println("Choose the currency type :");
        System.out.println(
                "\n1.Rupee \n2.US Dollar \n3.Euro ");
        code = sc.nextDouble();
        System.out.println("How much Currency you want to convert :");
        amount = sc.nextDouble();

        // FOR AMOUNT CONVERSION
        if (code == 1) {
            usdollar = amount / 81;
            System.out.println("Your " + amount + " Rupee is : " + f.format(usdollar) + " Dollar");

            euro = amount / 80;
            System.out.println("Your " + amount + " Rupee is : " + f.format(euro) + " Euro ");

            britishpound = amount / 91;
            System.out.println("Your " + amount + " Rupee is : " + f.format(usdollar) + " British Pound");

            afghanigani = amount / 1.08;
            System.out.println("Your " + amount + " Rupee is : " + f.format(afghanigani) + " Afghani Gani");

            argentinapeso = amount / 1.80;
            System.out.println("Your " + amount + " Rupee is : " + f.format(argentinapeso) + "Argentina Peso");

            australiandollar = amount / 0.019;
            System.out.println("Your " + amount + " Rupee is : " + f.format(australiandollar) + "Astralian Dollar");

            bangladeshitaka = amount / 1.24;
            System.out.println("Your " + amount + " Rupee is : " + f.format(bangladeshitaka) + " Bangladeshi Taka");

            brazilianreal = amount / 0.066;
            System.out.println("Your " + amount + " Rupee is : " + f.format(brazilianreal) + " Brazilian Real");

            canadiandollar = amount / 0.017;
            System.out.println("Your " + amount + " Rupee is : " + f.format(canadiandollar) + " Canadian Dollar");

            chineseyuan = amount / 0.087;
            System.out.println("Your " + amount + " Rupee is : " + f.format(chineseyuan) + "Chinese Yuan");

            danishkrone = amount / 0.93;
            System.out.println("Your " + amount + " Rupee is : " + f.format(danishkrone) + " Danish Krone");

            hongkongdollar = amount / 0.96;
            System.out.println("Your " + amount + " Rupee is : " + f.format(hongkongdollar) + " HognKong Dollar");

            iranianrial = amount / 515.331;
            System.out.println("Your " + amount + " Rupee is : " + f.format(iranianrial) + "Iranian Rial");

            japaneseyen = amount / 81;
            System.out.println("Your " + amount + " Rupee is : " + f.format(japaneseyen) + "Japanese Yen");

            kuwaitdinar = amount / 0.004;
            System.out.println("Your " + amount + " Rupee is : " + f.format(kuwaitdinar) + " Kuwait Dinar");
        }

        // FOR US DOLLAR CONVERSION
        else if (code == 2) {
            rupee = amount * 81;
            System.out.println("Your " + amount + " US Dollar is : " + f.format(rupee) + " Rupee");

            euro = amount * 1.020;
            System.out.println("Your " + amount + "US Dollar is  : " + f.format(euro) + " Euro ");

            britishpound = amount * 0.896;
            System.out.println("Your " + amount + "US Dollar is : " + f.format(britishpound) + " British Pound");

            afghanigani = amount * 88.130;
            System.out.println("Your " + amount + "US Dollar is  : " + f.format(afghanigani) + " Afghani Gani");

            argentinapeso = amount * 147.310;
            System.out.println("Your " + amount + "US Dollar is : " + f.format(argentinapeso) + "Argentina Peso");

            australiandollar = amount * 1.516;
            System.out.println("Your " + amount + " US Dollar is : " + f.format(australiandollar) + "Astralian Dollar");

            bangladeshitaka = amount * 100.930;
            System.out.println("Your " + amount + " US Dollar is : " + f.format(bangladeshitaka) + " Bangladeshi Taka");

            brazilianreal = amount * 5.415;
            System.out.println("Your " + amount + "US Dollar is  : " + f.format(brazilianreal) + " Brazilian Real");

            canadiandollar = amount * 1.383;
            System.out.println("Your " + amount + " US Dollar is  : " + f.format(canadiandollar) + " Canadian Dollar");

            chineseyuan = amount * 7.114;
            System.out.println("Your " + amount + " US Dollar is  : " + f.format(chineseyuan) + "Chinese Yuan");

            danishkrone = amount * 7.585;
            System.out.println("Your " + amount + " US Dollar is  : " + f.format(danishkrone) + " Danish Krone");

            hongkongdollar = amount * 7.850;
            System.out.println("Your " + amount + "US Dollar is : " + f.format(hongkongdollar) + " HognKong Dollar");

            iranianrial = amount * 42000;
            System.out.println("Your " + amount + "US Dollar is  : " + f.format(iranianrial) + "Iranian Rial");

            japaneseyen = amount * 81;
            System.out.println("Your " + amount + " US Dollar is : " + f.format(japaneseyen) + "Japanese Yen");

            kuwaitdinar = amount * 0.310;
            System.out.println("Your " + amount + " US Dollar is  : " + f.format(kuwaitdinar) + " Kuwait Dinar");
        }

        // FOR EURO CONVERSION
        else if (code == 3) {
            rupee = amount * 81;
            System.out.println("Your " + amount + "Euro : " + f.format(rupee) + " Rupee");

            usdollar = amount * 1.020;
            System.out.println("Your " + amount + "Euro : " + f.format(usdollar) + " US Dollar ");

            britishpound = amount * 0.896;
            System.out.println("Your " + amount + "Euro: " + f.format(britishpound) + " British Pound");

            afghanigani = amount * 88.130;
            System.out.println("Your " + amount + "Euro  : " + f.format(afghanigani) + " Afghani Gani");

            argentinapeso = amount * 147.310;
            System.out.println("Your " + amount + "Euro : " + f.format(argentinapeso) + "Argentina Peso");

            australiandollar = amount * 1.516;
            System.out.println("Your " + amount + " Euro : " + f.format(australiandollar) + "Astralian Dollar");

            bangladeshitaka = amount * 100.930;
            System.out.println("Your " + amount + " Euro : " + f.format(bangladeshitaka) + " Bangladeshi Taka");

            brazilianreal = amount * 5.415;
            System.out.println("Your " + amount + "Euro  : " + f.format(brazilianreal) + " Brazilian Real");

            canadiandollar = amount * 1.383;
            System.out.println("Your " + amount + " Euro : " + f.format(canadiandollar) + " Canadian Dollar");

            chineseyuan = amount * 7.114;
            System.out.println("Your " + amount + "Euro : " + f.format(chineseyuan) + "Chinese Yuan");

            danishkrone = amount * 7.585;
            System.out.println("Your " + amount + " Euro : " + f.format(danishkrone) + " Danish Krone");

            hongkongdollar = amount * 7.850;
            System.out.println("Your " + amount + "Euro : " + f.format(hongkongdollar) + " HognKong Dollar");

            iranianrial = amount * 42000;
            System.out.println("Your " + amount + "Euro: " + f.format(iranianrial) + "Iranian Rial");

            japaneseyen = amount * 81;
            System.out.println("Your " + amount + "Euro : " + f.format(japaneseyen) + "Japanese Yen");

            kuwaitdinar = amount * 0.310;
            System.out.println("Your " + amount + " Euro  : " + f.format(kuwaitdinar) + " Kuwait Dinar");
        }
        System.out.println();
        System.out.println("                      Thank You");
    }
}
