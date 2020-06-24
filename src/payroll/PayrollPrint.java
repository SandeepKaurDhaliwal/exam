/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

import java.util.Scanner;

/**This class for
 * printing final salary including bonus
 * @author srinivsi
 */
public class PayrollPrint 
{
public static void main(String[] args) 
{
/* here assumed that 5 employee accounts can be created for the given bank */
Payroll ac[]=new Payroll[5];

 //add code to take input from user, If salary is less than or equal to 3000,calculate a new salary with bonus 10% of salary
 //and store in array then print 5 employee details
  
Scanner sc=new Scanner(System.in);
System.out.println("Please enter the employee name:");
 String name=sc.next();
System.out.println("Please enter the salary: salary <=3000");
  float salary=sc.nextFloat();
    float finalSalary = 0;

finalSalary=salary+(salary*10/100);
if (salary<=3000){
    System.out.println("you will not get any bnous");
    System.out.println("Salary is " +salary);
}
else{
    System.out.println("The final Salary including bonus is: " +finalSalary);         

}
}

}
