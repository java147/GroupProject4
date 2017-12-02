package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        setter.thesetter();
        ExecutiveVP evp=new ExecutiveVP("Test", "Test1", "", 0);
        evp.returnSalary();
        evp.hasBenefit();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Employee Level Number from 1 and 4: ");

        String employeeLevel = input.nextLine();

        System.out.println(employeeLevel);

        switch (employeeLevel)
        {
            case "1":
                System.out.println("Register = Low Clearance");
                break;

            case "2":
                System.out.println("Store Manager = Low Clearance");
                break;

            case "3":
                System.out.println("Branch Manager = Mid Clearance");
                break;

            case "4":
                System.out.println("Executive VP = High Clearance");
                break;

            default:
                System.out.println("Invalid Entry = No Clearance");
                System.exit(1);
        }


    }



}

