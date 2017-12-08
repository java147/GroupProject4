package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
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

        public void setter() {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your first name: ");
            String firstname = input.next();
            System.out.print("Enter your last name: ");
            String lastname = input.next();
            System.out.print("Enter your gender: ");
            String gender = input.next();
            gender = gender.toLowerCase();
            if (!gender.equals("male") && !gender.equals("female")) {
                do {
                    System.out.println("Invalid, enter either male or female: ");
                    gender = input.next();
                } while (!gender.equals("male") && !gender.equals("female"));
            }

            byte count = 1;
            new employee(firstname, lastname, gender, count);
            String[] position = new String[]{"Store Manager", "Branch Manager", "Executive VP", "Register"};
            int index = (new Random()).nextInt(position.length);
            System.out.println(position[index]);
            String job = position[index];
            int salary;


        }



}

