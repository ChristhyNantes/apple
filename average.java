package Nantes;

import Nantes.Grade;
import java.util.Scanner;


public class Grade {

  public static void main(String[] args){
      
   Scanner Scan = new Scanner(System.in);
   double HCI,OOP,Science,History,Filipino,GenMath,Average;
   
   System.out.println("Enter Prelim Grade in HCI: ");
   HCI = Scan.nextDouble();
   System.out.println("Enter Prelim Grade in OOP: ");
   OOP = Scan.nextDouble();
   System.out.println("Enter Prelim Grade in Science: ");
   Science = Scan.nextDouble();
   System.out.println("Enter Prelim Grade in History: ");
   History = Scan.nextDouble();
   System.out.println("Enter Prelim Grade in Filipino: ");
   Filipino = Scan.nextDouble();
   System.out.println("Enter Prelim Grade in GenMath: ");
   GenMath = Scan.nextDouble();
   
   Average = (HCI + OOP + Science + History + Filipino + GenMath)/6;
       
   System.out.println("Average: " + Average);
   
   if (Average>75) 
      System.out.println("Passed" );
   else if (Average<75)
      System.out.println("Failed");        
  }
}