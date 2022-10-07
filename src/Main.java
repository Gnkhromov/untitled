import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float result = 0;
        double x1 = 0;
        double x2 = 0;
        System.out.println("Выберите необходимую функцию, введя число:\n 1)Сложение\n 2)Умножение\n 3)Деление\n 4)Вычитание\n 5)Вычисление квадратного уравнения");
        Scanner input = new Scanner(System.in);
        int vbr = input.nextInt();
        if (vbr == 1) {
            System.out.println("Введите количество чисел, которые необходимо сложить");
            int p = input.nextInt();
            for (int i = 0; i < p; i++) {
                System.out.println("Введите число, которое необходимо прибавить");
                float chsl = input.nextInt();
                result = result + chsl;
            }
            System.out.println("Результат сложения:" + " " + result);
        } else {
            if (vbr == 2) {
                System.out.println("Введите количество чисел, которые необходимо умножить");
                int p = input.nextInt();
                result = 1;
                for (int i = 0; i < p; i++) {
                    System.out.println("Введите число, которое необходимо умножить");
                    float chsl = input.nextInt();
                    result = result * chsl;
                }
                System.out.println("Результат умножения:" + " " + result);
            } else {
                if (vbr == 3) {
                    System.out.println("Введите делимое");
                    result = input.nextInt();
                    System.out.println("Введите делитель");
                    int delitel = input.nextInt();
                    result = result / delitel;
                    System.out.println("Результат деления:" + " " + result);
                } else {
                    if (vbr == 4) {
                        System.out.println("Введите число, из которого необходимо вычесть");
                        result = input.nextInt();
                        System.out.println("Введите числа, которые необходимо вычесть, 0 для окончания");
                        int p = input.nextInt();
                        for (int i = 0; i < p; i++) {
                            System.out.println("Введите число, которое необходимо вычесть");
                            float chsl = input.nextInt();
                            result = result - chsl;
                        }
                        System.out.println("Результат вычитания:" + " " + result);
                    } else {
                        if (vbr == 5) {
                            float a = 0;
                            float b = 0;
                            float c = 0;
                            System.out.println("Вы вошли в раздел решения квадратных уравнений\n универсальная форма квадратного уравнения выглядит так:ax^2+bx+c\n введите а");
                            a = input.nextInt();
                            System.out.println("Введите b");
                            b = input.nextInt();
                            System.out.println("Введите c");
                            c = input.nextInt();
                            double D = (b * b) - (4 * a * c);
                            if (D < 0) {
                                System.out.println("Действительных корней нет");
                            } else {
                                if (D == 0) {
                                    System.out.println((-b) / (2 * a));
                                } else {
                                    x1 = (-b + Math.sqrt(D)) / (2 * a);
                                    x2 = (-b - Math.sqrt(D)) / (2 * a);
                                    System.out.println("Корни уравнения:\n x1=" + " " + x1 + "x2=" + " " + x2);
                                }
                            }


                        } else {
                            System.out.println("Выбор не распонан, повторите попытку");
                        }
                    }
                }
            }
        }
    }
}