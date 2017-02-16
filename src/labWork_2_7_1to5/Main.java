package labWork_2_7_1to5;

/**
 * Created by Bulik on 26.07.2016.
 */
public class Main {
    public static void main(String[] args) {
        Device[] devices = {new Monitor("LG", 5000.4f, "Lg 546354613",1280, 1024),
                new EthernetAdapter("AA", 2098.02f,"AA53353",100,"987H"),
                new Device("HP",6000.0f,"HP4136458864E")};

        for (Device elem : devices){
            System.out.println(elem);
        }
        System.out.println(" --------------------------------------------------------------");
        System.out.println(devices[0].equals(devices[1]));
        System.out.println(devices[0].equals(devices[2]));
        System.out.println("----------------------------------------------------------------");
        for (Device element : devices){
            System.out.println(element.hashCode());
        }

    }
}
