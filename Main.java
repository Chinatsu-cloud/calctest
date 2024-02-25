package org.example;

// Shift を 2 回押して 'どこでも検索' ダイアログを開き、`show whitespaces` と入力して
// Enter キーを押します。これでコードに空白文字が表示されます。
public class Main {
    public static void main(String[] args){
        String str1 = "9";
        String str2 = "-20";

        int number1 = Integer.parseInt(str1);
        int number2 = Integer.parseInt(str2);

        System.out.println("正の整数number1の値：" + number1);
        System.out.println("負の整数number2の値：" + number2);

        String str3 = "1011";
        String str4 = "nullnull";

        int number3 = Integer.parseInt(str3,2);
        int number4 = Integer.parseInt(str4,16);

        System.out.println("2を基数とした正の整数number3の値" + number3);
        System.out.println("16を基数とした正の整数number4の値" + number4);
    }
}