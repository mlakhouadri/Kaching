package at.ac.fhcampuswien;

public class Main {

    public static void main(String[] args) {
        int number = 1;

        while (number <= 50) {
            if (number % 15 == 0) {
                System.out.println("ka-ching!");
            } else if (number % 5 == 0) {
                System.out.println("ching!");
            } else if (number % 3 == 0) {
                System.out.println("ka");
            } else {
                System.out.println(number);
            }
            number++;
        }
    }
}


