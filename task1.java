import java.io.IOException;
import java.util.Scanner;

/**
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 * и возвращает введенное значение.
 * Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
 * необходимо повторно запросить у пользователя ввод данных.
 */

public class task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);   //System.in – поток ввода текста с клавиатуры.
        boolean val;
        Float num = null;
        String data;
        do {
            System.out.print("Введите дробное число: \t");  // \t это отступ
            try {
                data = scanner.nextLine();
                if (Float.parseFloat(data) > 0){
                    num = Float.parseFloat(data);
                    val = true;
                }else {
                    System.out.println("Неправильный ввод");
                    val = false;
                }
            }catch (Exception e){
               val = false;
            }
        }while (!val);
        System.out.println("Вы ввели: " + num);
    }
}
