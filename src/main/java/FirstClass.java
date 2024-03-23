import java.util.List;
public class FirstClass {
    public static void main(String[] args) {

//0) прочитать про диапазоны типов данных для вещественных / чисел с плавающей точкой

        System.out.println("Существует два числа с плавающей точкой (вещественных) — float, double, они выполняют задачу — представляют дробные числа.");
        System.out.println("float это - 32 бита, диапазон от 2-149 до (2-2-23)*2127");
        System.out.println("double это - 64 бита, диапазон, от 2-1074 до (2-2-52)*21023");

//1) поупражняться с математическими и логическими операторами, добиться переполнения при вычислениях, посмотреть результаты (вывести в консоль)

        int number1 = 9;
        int number2 = 2;
        byte number3 = 127;
        byte number4 = 1;


        System.out.println(number1 + number2 + " результат сложения");
        System.out.println(number1 - number2 + " результат вычитания");
        System.out.println(number1 * number2 + " результат умножения");
        System.out.println(number1 / number2 + " результат деления");
        System.out.println(number1 % number2 + " результат отстатка от деления");
        System.out.println(number1++ + " пример написания постфикса с ++");
        System.out.println(number1-- + " пимер написания постфикса с --");
        System.out.println(++number1 + " пример написания префикса с ++");
        System.out.println(--number1 + " пимер написания префикса с --");

        if (number1 > number2){
            System.out.println(number1 + " больше "+ number2);
        } else {
            System.out.println(number1 + " меньше "+ number2);
        }

        boolean number5 = true;
        boolean number6 = false;

        System.out.println("number5 && number6 = " + (number5&&number6));
        System.out.println("number5 || number6 = " + (number5||number6) );
        System.out.println("!(number5 && number6) = " + !(number5 && number6));

        System.out.println(number1 == number2);
        System.out.println(number1 > ++number2);
        System.out.println(number1 < number2);

        System.out.println(number3+number4 + " тут происходит автоматическое преобразование типа, но результат уже не тип byte");
        System.out.println((byte)(number3+number4)  + " явное преобразование типа данных");

//2) попробовать вычисления комбинаций типов данных (int и double)
        int number7 = 10;
        double number8 = 0.610;

        System.out.println(number7);
        System.out.println(number8);
        System.out.println((int)(number7 + number8));
        System.out.println(number7 - number8);
        System.out.println(number7 * number8);
        System.out.println(number7 / number8);
        System.out.println(number7 % number8);
    }
}