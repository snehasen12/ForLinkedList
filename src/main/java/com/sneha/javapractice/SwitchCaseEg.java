package com.sneha.javapractice;
import java.util.*;
public class SwitchCaseEg {
    public static void main(String[] args) {
        SwitchCaseEg b = new SwitchCaseEg();
        b.SwitchCase();
    }

    public void SwitchCase(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the button number:");
        int button = sc.nextInt();

        switch(button){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid button");
        }
    }
}
