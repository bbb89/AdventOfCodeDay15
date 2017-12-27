package com.lukasz;

import java.util.Scanner;

public class Main {
    private static int genA;
    private static int genB;

    private static void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start values:");
        scanner.next();
        scanner.next();
        scanner.next();
        scanner.next();
        genA = scanner.nextInt();
        scanner.nextLine();
        scanner.next();
        scanner.next();
        scanner.next();
        scanner.next();
        genB = scanner.nextInt();
    }

    public static void main(String[] args) {
        getInput();

        System.out.println("Searching for matches...");

        Solution solution = new Solution(genA, genB);
        Solution2 solution2 = new Solution2(genA, genB);
        System.out.println("There are " + solution.getMatches() + " matches for part I.");
        System.out.println("There are " + solution2.getMatches() + " matches for part II.");
    }
}
