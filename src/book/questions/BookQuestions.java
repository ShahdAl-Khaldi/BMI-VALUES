
package book.questions;

import java.util.Scanner;

public class BookQuestions {

    public static void main(String[] args) {
        
       

        Scanner s=new Scanner(System.in);
        System.out.println(" Enter the two Number:");
        int x=s.nextInt();
        int y=s.nextInt();
        if(x>y)
            System.out.println("الرقم الأكبر هو"+x);
        else if(y>x)
              System.out.println("الرقم الأكبر هو"+y);
        else
              System.out.println(" لرقمين متساويي"+x+"="+y);

       
        System.out.println("************");
        int weight;
        int height;
        int bMI;
        System.out.print ("Enter Your Weight in Pounds: ");
        weight = s.nextInt();
        System.out.print ("Enter Your Height in Inches: ");
        height =s.nextInt();
        bMI = (weight * 703) / (height * height);
        System.out.printf ("Your Body Mass Index (BMI) is %d\n\n", bMI);
        System.out.println ("BMI VALUES");
        System.out.println ("Underweight: less than 18.5");
        System.out.println ("Normal:      between 18.5 and 24.9");
        System.out.println ("Overweight:  between 25 and 29.9");
        System.out.println ("Obese:       30 or greater");
        
        
        
        
        
        
        
        
            
    }
    
}
