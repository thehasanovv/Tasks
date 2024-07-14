package classtasks.nestedclasses;

public class CPU {

    double price;

    class Processor {
        double cores;
        String manufacturer;

        double getCache() {
            return 4.3;
        }
    }

    protected class RAM {

        // members of protected nested class
        double memory;
        String manufacturer;

        double getClockSpeed() {
            return 5.5;
        }
    }
}
