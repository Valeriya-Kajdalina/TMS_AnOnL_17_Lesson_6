package Computer;


public class RAM {
    public RAM(String name_RAM, float volume_RAM) {
        this.name_RAM = name_RAM;
        this.volume_RAM = volume_RAM;
    }

    public RAM() {
    }

    public void printer(String name_RAM, Float volume_RAM) {
        System.out.println("имеет RAM: " + name_RAM + " " + volume_RAM);
    }

    String name_RAM;
    Float volume_RAM;
}
