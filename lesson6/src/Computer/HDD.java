package Computer;

public class HDD {
    public HDD(String name_HDD, float volume_HDD, String type_HDD) {
        this.name_HDD = name_HDD;
        this.volume_HDD = volume_HDD;
        this.type_HDD = type_HDD;
    }

    public HDD() {
    }

    public void printer(String name_RAM, Float volume_RAM) {
        System.out.println("имеет HDD: " + name_HDD + " " + type_HDD + " " + volume_HDD);
    }

    String name_HDD;
    Float volume_HDD;
    String type_HDD;

}
