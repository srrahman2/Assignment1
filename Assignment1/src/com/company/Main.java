package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("You are in a land full of dragons. In front of you,\nyou see two caves. In one cave, the dragon is friendly\nand will share his treasure with you. The other dragon");
        System.out.println("is greedy and hungry and will eat you on sight.\nWhich cave will you go into? (1 or 2)");
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        if(input == 1)
        {
            System.out.println("You approach the cave...\nIt is dark and spooky...\nA large dragon jumps out in front of you! He opens his jaws and...");
            System.out.println("Gobbles you down in one bite!");
        }
        else if(input == 2)
        {
            System.out.println("You approach the cave...\nIt is dark and spooky...\nA large dragon jumps out in front of you! He opens his jaws and...");
            System.out.println("ALAS! Shares his treasure with you!");
        }
        else
        {
            System.out.println("Invalid Choice");
        }
    }
}
