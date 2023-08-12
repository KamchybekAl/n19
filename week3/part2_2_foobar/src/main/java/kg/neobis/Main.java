package kg.neobis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Foobar foobar = new Foobar();
        System.out.print("Введите целое число: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        foobar.foobar(num);
        sc.close();
    }
}