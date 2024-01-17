//Создать класс для описания компьютера, в этом классе должны быть
//поля: стоимость, модель(строковый тип), RAM и HDD.
//Для полей RAM и HDD следует создать свои собственные классы.
//Классы для RAM и HDD должны иметь конструктор по умолчанию и
//конструктор со всеми параметрами.
//Класс RAM имеет поля "название" и "объем".
//Класс HDD имеет поля "название", "объем" и "тип" (внешний или
//внутренний).
//Класс Computer должен иметь два конструктора:
//- первый - с параметрами стоимость и модель,
//- второй - со всеми полями.
//При создании объекта "компьютер" с помощью первого конструктора
//должны создаваться поля RAM и HDD с помощью конструкторов по
//умолчанию.
//В каждом из классов предусмотреть методы для вывода полной
//информации (вывод всех полей и всех значений).
//Тестовый сценарий для проверки:
//создать объект "компьютер 1" с помощью первого конструктора и
//вывести информацию на экран;
//создать объект "компьютер 2" с помощью второго конструктора и
//вывести информацию на экран.

package Computer;

public class Computer {
    float coast;
    String model;
    RAM ram;
    HDD hdd;

    public Computer(float coast, String model, RAM ram, HDD hdd) {
        this.coast = coast;
        this.model = model;
        this.hdd = hdd;
        this.ram = ram;
    }

    public Computer(float coast, String model) {
        this.coast = coast;
        this.model = model;
        this.ram = new RAM();
        this.hdd = new HDD();
    }

    public void printer(float coast, String model, RAM ram, HDD hdd) {

        System.out.println("Модель компьютера " + model + " с стоимостью " + coast + " имеет RAM: "
                + ram.name_RAM + " " + ram.volume_RAM + ", имеет HDD: " + hdd.name_HDD + " " +
                hdd.type_HDD + " " + hdd.volume_HDD);
    }

    public static void main(String[] args) {
        System.out.println("Информация по 1 компьютеру ");
        Computer computer1 = new Computer(546, "hdewy6543");
        computer1.printer(computer1.coast, computer1.model, computer1.ram, computer1.hdd);

        HDD hdd = new HDD("hdjhd", 645, "внешняя");
        RAM ram = new RAM("hdfd", 456);

        System.out.println("Информация по 2 компьютеру ");
        Computer computer2 = new Computer(546, "hdewy6543", ram, hdd);
        computer2.printer(computer2.coast, computer2.model, computer2.ram, computer2.hdd);
    }

}
