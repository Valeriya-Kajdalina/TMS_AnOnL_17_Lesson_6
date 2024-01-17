//Создать класс, описывающий банкомат.
//Набор купюр, находящихся в банкомате, должен задаваться тремя
//свойствами:
//количеством купюр номиналом 20, 50 и 100.
//Сделать метод для добавления денег в банкомат.
//Сделать функцию, снимающую деньги, которая принимает сумму денег,
//а возвращает булевое значение - успешность выполнения операции.
//При снятии денег функция должна распечатывать каким количеством
//купюр какого номинала выдаётся сумма.
//Создать конструктор с тремя параметрами - количеством купюр каждого
//номинала.

package ATM;

public class ATM {
    public ATM(int numb_cash_20, int numb_cash_50, int numb_cash_100) {
        this.numb_of_cash_20 = numb_of_cash_20;
        this.numb_of_cash_50 = numb_of_cash_50;
        this.numb_of_cash_100 = numb_of_cash_100;
        this.summa = numb_cash_20 * 20 + numb_cash_50 * 50 + numb_cash_100 * 100;
        System.out.println("Сумма на счету: " + summa);
    }

    public float add_cash(int numb_cash_20, int numb_cash_50, int numb_cash_100, float summa) {
        return summa += numb_cash_20 * 20 + numb_cash_50 * 50 + numb_cash_100 * 100;
    }

    public boolean minus_cash(int numb_cash_20, int numb_cash_50, int numb_cash_100, float summa) {
        boolean flag = true;
        System.out.println("Было снято: " + numb_cash_20 + " - 20 рублевых купюр; " + numb_cash_50 +
                " - 50 рублевых купюр; " + numb_cash_100 + " - 100 рублевых купюр");
        summa -= numb_cash_20 * 20 + numb_cash_50 * 50 + numb_cash_100 * 100;
        if (summa < 0)
            flag = false;
        return flag;
    }

    int numb_of_cash_20;
    int numb_of_cash_50;
    int numb_of_cash_100;
    float summa;

    public static void main(String[] args) {
        ATM atm = new ATM(5, 7, 8);
        atm.summa = atm.add_cash(3, 5, 9, atm.summa);
        boolean operation = atm.minus_cash(9, 12, 8, atm.summa);
        System.out.println("Возможно снять такую сумму: " + operation);
    }
}
