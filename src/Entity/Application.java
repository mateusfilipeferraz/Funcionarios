/*
  * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
  * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
  */
package Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
  *
  * @author Mateus Ferraz
  */
public class Application {

     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) {
         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);
         List<Employees> list = new ArrayList<>();

         System.out.print("How many employees will be registered?");
         int n = sc.nextInt();
         for (int i = 0; i < n; i++) {
             System.out.println("Employee#" + (i + 1) + ":");

             System.out.print("Id:");
             Integer id = sc.nextInt();
             while (hasId(list, id)) {
                 System.out.println("Id already exists! Try again:");
                  id = sc.nextInt();
             }
             System.out.print("Name:");
             sc.nextLine();
             String name = sc.nextLine();

             System.out.print("Salary:");
             Double salary = sc.nextDouble();
             System.out.println("");
             Employees funci = new Employees(id, name, salary);

             list.add(funci);
         }
         System.out.println("");
         System.out.println("Enter the id of the employee who will have a salary increase:");
         int idemployee = sc.nextInt();
         // Integer pos = position(list, employeeid);
         Employees funci = list.stream().filter(x -> x.getId() == idemployee).findFirst().orElse(null);
         // if (pos == null) {
         if (funci == null) {
             System.out.println("This id does not exist ");
         } else {

             System.out.print("Enter the percentage: ");
             double percentage = sc.nextDouble();
             funci.incrementsalary(percentage);
             // list.get(pos).incrementosalario(percentage);
         }
         System.out.println("");
         System.out.println("List employees:");
         for (Employees e : list) {
             System.out.println(e);
         }

         sc.close();
     }

     public static Integer position(List<Employees> list, int id) {
         for (int i = 0; i < list.size(); i++) {
             if (list.get(i).getId() == id) {
                 return i;
             }
         }
         return null;
     }

     public static boolean hasId(List<Employees> list, int id) {
       Employees func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
         return func != null;

     }
}