package com.calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double firstNum = scan.nextDouble();
        System.out.println("Enter the operation +, -, *, /, % : ");
        char operator = scan.next().charAt(0);
        System.out.println("Enter Second Number: ");
        double secondNum = scan.nextDouble();

        SimpleCalc simpleCalc = new SimpleCalc();
        double cal = simpleCalc.simpCal(firstNum, operator, secondNum);
        System.out.println("Result: " + cal);

        
        scan.close();
    }

}