//Создать класс CreditCard c полями номер счета, текущая сумма на счету.
//Добавьте метод, который позволяет начислять сумму на кредитную
//карточку.
//Добавьте метод, который позволяет снимать с карточки некоторую
//сумму.
//Добавьте метод, который выводит текущую информацию о карточке.
//Напишите программу, которая создает три объекта класса CreditCard у
//которых заданы номер счета и начальная сумма
//Тестовый сценарий для проверки:
//Положите деньги на первые две карточки и снимите с третьей.
//Выведите на экран текущее состояние всех трех карточек.

import java.util.Scanner;

public class CreditCard {
    String account_number;
    float account_summ;

    public float subtract_cash(float account_summ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму снятия: ");
        float replenishment_amount = scanner.nextFloat();
        return account_summ -= replenishment_amount;
    }

    public float add_cash(float account_summ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму пополнения: ");
        float replenishment_amount = scanner.nextFloat();
        return account_summ += replenishment_amount;
    }

    public void printer(String account_number, float account_summ) {

        System.out.println("На счету № " + account_number + " сумма " + account_summ);
    }

    public CreditCard(String account_number, float account_summ) {

        this.account_number = account_number;
        this.account_summ = account_summ;
    }

    public static void main(String[] args) {

        CreditCard creditcard1 = new CreditCard("hfjdh37473gdf", 56);
        CreditCard creditcard2 = new CreditCard("hf435h37473gdf", 5463);
        CreditCard creditcard3 = new CreditCard("78jdh37473gdf", 894);

        creditcard1.account_summ = creditcard1.add_cash(creditcard1.account_summ);
        creditcard2.account_summ = creditcard2.add_cash(creditcard2.account_summ);
        creditcard3.account_summ = creditcard3.subtract_cash(creditcard3.account_summ);

        creditcard1.printer(creditcard1.account_number, creditcard1.account_summ);
        creditcard2.printer(creditcard2.account_number, creditcard2.account_summ);
        creditcard3.printer(creditcard3.account_number, creditcard3.account_summ);

    }

}