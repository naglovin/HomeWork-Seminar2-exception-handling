//Разработайте программу, которая выбросит Exception,
//когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.io.IOException;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String result = scanner.nextLine();
        if (result.equals("")) throw new RuntimeException("Нельзя вводить пустую строку");
        System.out.println(result);
    }
}
