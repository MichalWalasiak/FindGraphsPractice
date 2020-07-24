package Algorythms;

import java.util.Scanner;

public class NumbersService {

    private Scanner scanner = new Scanner(System.in);

    public String[] getNumbers() {
        return scanner.nextLine().split(" ");
    }

    public int getFirstNumber() {
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }
}
