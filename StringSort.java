package rifa;

import java.util.*;

public class StringSort {
    public static void main(String[] args) {
        int count = 0, i, j, choice;
        String temp;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of strings to sort");
        count = s.nextInt();
        String strlist[] = new String[count];
        System.out.println("Enter your strings:");
        for (i = 0; i < count; i++) {
            strlist[i] = s.next();
        }
        
        System.out.println("1. In-built sort \n2. User-defined sort");
        choice = s.nextInt();
        
        switch (choice) {
            case 1:
                Arrays.sort(strlist);
                System.out.println("Sorted strings using in-built sort:");
                System.out.println(Arrays.toString(strlist));
                break;
                
            case 2:
                for (i = 0; i < count - 1; i++) {
                    for (j = i + 1; j < strlist.length; j++) {
                        if (strlist[i].compareTo(strlist[j]) > 0) {
                            temp = strlist[i];
                            strlist[i] = strlist[j];
                            strlist[j] = temp;
                        }
                    }
                }
                System.out.println("Sorted strings using user-defined sort:");
                System.out.println(Arrays.toString(strlist));
                break;
                
            default:
                System.out.println("Wrong choice");
        }
    }
}
