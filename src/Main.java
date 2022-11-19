import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
          Нужно ввести год рождения программа должна вывесьт сколько человеку лет.
          И високосный ли год он родился.
         */

        System.out.println("Введите год рождения : ");
        int yearOfBirth = scanner.nextInt();
        int age=2022-yearOfBirth;

        if(yearOfBirth%4==0 && yearOfBirth%100==0 && yearOfBirth%400==0){
            System.out.println("Вам "+age+"(лет,год,года)"+"\n"+yearOfBirth+" год является високосным");
        }else if(yearOfBirth%4==0 && yearOfBirth%100!=0 ) {
            System.out.println("Вам " + age + "(лет,год,года)" + "\n" + yearOfBirth + " год является високосным");
        }else {
            System.out.println("Вам "+age+"(лет,год,года)"+"\n"+yearOfBirth+" год не является високосным");
        }
    }
}
