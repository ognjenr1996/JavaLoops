
import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        System.out.println("Loops");
        
        int age = 18;
        
        if (age >= 18) {
            System.out.println("Osoba je punoletna");
        } else {
            System.out.println("Osoba je maloletna ");
        }
        
        System.out.println("Koliko imate godina?");
        
        Scanner in = new Scanner(System.in);
        int age2 = in.nextInt();
        
        System.out.println("Uneli ste broj: " + age2);
        
        if (age2 <= 2) {
            System.out.println("Osoba je beba");
        } else if (age2 <= 11) {
            System.out.println("Osoba je dete");
        } else if (age2 <= 17) {
            System.out.println("Osoba je tinejdzer");
        } else {
            System.out.println("Osoba je odrasla");
        }
        
        
        System.out.println("-------------------------------");
        System.out.print("Unesite redni broj dana u nedelji (1-7): ");
        Scanner in2 = new Scanner(System.in);
        int dayNumber = in2.nextInt();
        String day;
        switch (dayNumber) {
            case 1:
                day = "Ponedeljak";
                break;
            case 2:
                day = "Utorak";
                break;
            case 3:
                day = "Sreda";
                break;
            case 4:
                day = "Cetvratak";
                break;
            case 5:
                day = "Petak";
                break;
            case 6:
                day = "Subota";
                break;
            case 7:
                day = "Nedelja";
                break;
            default:
                day = "Uneli ste pogresan broj";
                break;
        }
        System.out.println("Dan je: " + day);
        
        
        
         System.out.println("While loop example");
//        
//        int x = 5;
//        while (x < 10) {
//            System.out.println(x);
//            x++;
//        }
//        
//        while (x > 0) {
//            System.out.println(x);
//            x--;
//        }
//        
//        System.out.println("Trenutna vrednost broja X je: " + x);
//        
//        while (x > 5) {
//            System.out.println(x);
//            x--;
//        }
        
//        System.out.println("Do While loop example");
//        
//        int y = 45;
//        do {
//            System.out.println(y);
//            y = y + 2;
//        } while (y < 40);
        
        
        System.out.println("For loop example");
       
        for (int i = 0; i < 10; i++) {
            System.out.println("*");
        }
        
        for (int i = 99; i >= 90; i--) {
            System.out.println("*");
        }

     
        
        
        
 
        
        for (int i = 1; i <= 30; i++) {
            for (int j = 1; j <= 30; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        
        
        for (int i = 1; i <= 30; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    
  