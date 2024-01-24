package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int power_degree = 1;
        int counter = 0;
        if (power < 0) {
            System.out.println("too much power");
        } else {
            while (counter <= power) {
                System.out.println(power_degree);
                counter++;
                power_degree *= 2;
            }
        }
    }
}
