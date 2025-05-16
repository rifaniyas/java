package rifa;

class CPU {
    double price = 25000.0;

    class Processor {
        double cores = 8;
        String manufacturer = "Intel";

        double getCache() {
            return 4.3;
        }
    }

    static class RAM {
        double memory = 16;
        String manufacturer = "Kingston";

        double getClockSpeed() {
            return 5.5;
        }
    }
}

public class CPUDetails {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        CPU.Processor processor = cpu.new Processor();
        CPU.RAM ram = new CPU.RAM();

        System.out.println("CPU Price = " + cpu.price);
        System.out.println("Processor Cores = " + processor.cores);
        System.out.println("Processor Manufacturer = " + processor.manufacturer);
        System.out.println("Processor Cache = " + processor.getCache());
        System.out.println("RAM Size = " + ram.memory + " GB");
        System.out.println("RAM Manufacturer = " + ram.manufacturer);
        System.out.println("RAM Clock speed = " + ram.getClockSpeed() + " GHz");
    }
}
