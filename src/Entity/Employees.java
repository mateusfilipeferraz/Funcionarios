/*
  * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
  * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
  */
package Entity;

/**
  *
  * @author Mateus Ferraz
  */
public class Employees {
    
     private Integer id;
     private String name;
     private Double salary;

     public Employees() {
     }

     public Employees(int id, String name, double salary) {
         this.id = id;
         this.name = name;
         this.salary = salary;
     }

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public double getSalary() {
         return salary;
     }

     public void setSalary(double salary) {
         this.salary = salary;
     }
    
     public void incrementsalary(double percentage){
         salary+=salary*percentage/100;
        
        
     }

     @Override
public String toString() {
return id + ", " + name+ ", " + String.format("%.2f", salary);
}
}