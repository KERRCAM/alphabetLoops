package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	char a;
	Scanner input = new Scanner(System.in);
    //char alphabet[] = new char[260];
    System.out.println("enter your start character and number: ");
    char StartCharacter = input.next(".").charAt(0);
    int RunsNumber = input.nextInt();


        for ( a = StartCharacter; a <= 'z'; ++a) {
            //int i = 0;
            //alphabet[i] = a;
            //i++;
            if (RunsNumber==0) {
                break;
            }
            System.out.println(a);
            RunsNumber--;
        }

        for ( a = 'a'; a <= StartCharacter - 1 ; ++a) {
            if (RunsNumber==0) {
                break;
            }
            System.out.println(a);
            RunsNumber--;
        }






/*
        for (int i = 0; i < 26; i++) {
            System.out.print(alphabet[i]);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("shift by: ");
        int AST = input.nextInt();

        for (int i = 0; i <26 ;i++) {
            if (i + AST > 25) {


            }
            System.out.println(alphabet[i+AST]);

        }
*/
















    }
}
