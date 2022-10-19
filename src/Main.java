import java.util.Scanner;
import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер программы, которую вы хотите исполнить:\n 1)Значения выражений\n 2)Четыре числа, которая говорит равны они или нет\n 3)Поиск k наибольших элементов массива\n 4)Поиск k наименьших элементов массива\n 5)Поиск чисел, которые превышают среднее значение массива\n 6)Умножение двух чисел без оператора умножения\n 7)Четные или нечетные числа массива\n 8)Из фаренгейта в цельсий\n 9)Расчет ИМТ\n 10)Квадрат, куб и четвертая степень числа\n 11)Может ли существовать треугольник с заданными сторонами\n ");
        int vybor = scan.nextInt();
        if(vybor==1)
        {
            one();
        }
        else if(vybor==2)
        {
            two();
        }
        else if(vybor==3)
        {
            three();
        }
        else if(vybor==4)
        {
            four();
        }
        else if(vybor==5)
        {
            five();
        }
        else if(vybor==6)
        {
            six();
        }
        else if(vybor==7)
        {
            seven();
        }
        else if(vybor==8)
        {
            eight();
        }
        else if(vybor==9)
        {
            nine();
        }
        else if(vybor==10)
        {
            ten();
        }
        else if(vybor==11)
        {
            eleven();
        }
        else
        {
            System.out.println("Неправильно выбран номер программы повторите попытку");
        }
    }
    static void one()
    {
    System.out.println("a)Результат выражения:(101+0)/3");
    System.out.println((101+0)/3);
    System.out.println("b)Результат выражения:(3.0e-6*10000000.1");
    System.out.println(3.0e-6*10000000.1);
    System.out.println("c)Результат выражения:(true&&true)");
    System.out.println(true&&true);
    System.out.println("d)Результат выражения:(false&&true)");
    System.out.println(false&&true);
    System.out.println("e)Результат выражения:(false&&false)|(true&&true)");
    System.out.println((false&&false)|(true&&true));
    System.out.println("f)Результат выражения:(false&&false)&&(true&&true)");
    System.out.println((false|false)&&(true&&true));
    }
    static void two()
    {
        System.out.println("Введите 4 целых числа");
        Scanner scunner = new Scanner(System.in);
        int a = scunner.nextInt();
        int b = scunner.nextInt();
        int c = scunner.nextInt();
        int d = scunner.nextInt();
        if(a==b & b==c & c ==d)
        {
            System.out.println("Все четыре числа равны");
        }
        else
        {
            System.out.println("Числа не равны");
        }

    }
    static void three()
    {
        System.out.println("Введите сколько наибольших чисел вы хотите получить");
        Scanner scan = new Scanner(System.in);
        int kol = scan.nextInt();
        int max = 0;
        int [] arr1 = {10,350,750,40,20,35,12,17,85};
        int [] arr2 = {0,0,0,0,0,0,0,0,0};
        Arrays.sort(arr1);
        for (int i = arr1.length - kol; i < arr1.length; i++)
        {
            System.out.println(arr1[i]);
        }

    }
    static void four()
    {
        System.out.println("Введите сколько наименьших чисел вы хотите получить");
        Scanner scan = new Scanner(System.in);
        int kol = scan.nextInt();
        int vrem = 0;
        int [] arr1 = {10,350,750,40,20,35,12,17,85};
        for (int i = 0; i < arr1.length - 1; i++)
        {
            for (int z = i + 1; z < arr1.length; z++)
            {
                if (arr1[i] < arr1[z])
                {
                    vrem = arr1[z];
                    arr1[z] = arr1[i];
                    arr1[i] = vrem;
                }
            }
        }
        for (int n = arr1.length - kol; n < arr1.length; n++)
        {
            System.out.println(arr1[n]);
        }
    }
    static void five()
    {
        int sum = 0;
        int schet = 0;
        double srznach = 0;
        int [] arr1 = {10,350,750,40,20,35,12,17,85};
        for(int i = 0; i < arr1.length; i++ )
        {
            sum = arr1[i] + sum;
            schet = schet + 1;
        }
        srznach = sum/schet;
        for(int z = 0; z < arr1.length; z++)
        {
            if(arr1[z] > srznach)
            {
                System.out.println("Числа, которые превышают среднее значение массива:"+arr1[z]);
            }
        }
    }
    static void six()
    {
        System.out.println("Введите числа для умножения");
        Scanner scunner = new Scanner(System.in);
        float a = scunner.nextFloat();
        float b = scunner.nextFloat();
        float result = 0;
        for(int i = 0; i < b; i++)
        {
            result = result + a;
        }
        System.out.println("Результат умножения:" + result);
    }
    static void seven()
    {
        int [] arr1 = {10,350,750,40,20,35,12,17,85};
        System.out.println("Четные числа:");
        for(int i = 0; i < arr1.length; i++)
        {
            if(arr1[i] % 2 == 0)
            {
                System.out.println(arr1[i]);
            }
        }
        System.out.println("Нечетные числа:");
        for(int i = 0; i < arr1.length; i++)
        {
            if(arr1[i] % 2 != 0)
            {
                System.out.println(arr1[i]);
            }
        }
    }
    static void eight()
    {
        System.out.println("Введите температуру в градусах фаренгейта");
        Scanner scunner = new Scanner(System.in);
        float fahren = scunner.nextFloat();
        System.out.println("Ваша температура в человеческих градусах цельсия:" + ((fahren-32)*5/9));
    }
    static void nine()
    {
        System.out.println("Введите ваш рост");
        Scanner scunner = new Scanner(System.in);
        float rost = scunner.nextFloat();
        System.out.println("Введите ваш вес");
        float ves = scunner.nextFloat();
        System.out.println("Ваш имт:" + (ves/(rost*rost*0.0001)));
    }
    static void ten()
    {
        System.out.println("Введите ваше число");
        Scanner scunner = new Scanner(System.in);
        float chislo = scunner.nextFloat();
        System.out.println("Квадрат вашего числа:" + (chislo*chislo));
        System.out.println("Куб вашего числа:" + (chislo*chislo*chislo));
        System.out.println("Четвертая степень вашего числа:" + (chislo*chislo*chislo*chislo));
    }
    static void eleven()
    {
        System.out.println("Введите последовательно стороны треугольника");
        Scanner scunner = new Scanner(System.in);
        int a = scunner.nextInt();
        int b = scunner.nextInt();
        int c = scunner.nextInt();
        if((a + b) > c & (b + c) > a & (a + c) > b)
        {
            System.out.println("Треугольник с такими сторонами возможен");
        }
        else
        {
            System.out.println("Треугольник с такими сторонами не существует");
        }
    }
}

