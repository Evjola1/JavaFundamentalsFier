Baza 1


public class HelloSDATeam{
   public static void main(String[]args){
     System.out.println("Hello SDA Team");
  }
}





Modeli i Variable:
public class Shembulli1{
    public static void main(String[] args)  
        int myGlobal = 5;
        int myGlobalVersion2 = 5;
        System.out.println("My global vaiable: "+ myGlobal);
        System.out.println("My global vaiable: "+ myGlobalVersion2);
    }
}  


Model operatoret e logjikes

public class Main {
    public static void main(String[] args){

        int var1 = 10;
        int var2 = 17;

        // System.out.println(var1 == var2);
        // System.out.println(var1 != var2);
        System.out.println(var1 > var2);
    }




s
Model operatori && (true ose false)
public class Main {
    public static void main(String[] args){

        boolean myVarBool1 = true;
        boolean myVarBool2 = true;
        System.out.println(myVarBool1 && myVarBool2);
    }
} 





import java.util.Scanner;

public class Ushtrimi2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendos input");
        float tempGradeCelcius = scanner.nextFloat();
        System.out.println("Rezultati");
        System.out.println(1.8 * tempGradeCelcius + 32.0);
    }
}









Perdorimi Conditional statement. (if)


public class Ushtrimi6 {
    public static void main(String[] args){
       float temperatura = 38.5f;
       if(temperatura > 36.6f) {
           System.out.println ("Ju keni temperature");
       }
        System.out.println("Programi mbaroi me sukes!");
       }
}







public class Ushtrimi6 {
    public static void main(String[] args){
    float temperature = 36.4f;
    temperature = 36.8f;
    if (temperature >= 37.0f) {
        System.out.println("You have a feaver/heatstate!");
    } else if (temperature >= 36.6f && temperature < 37.0f) {
        System.out.println("You're healthy/healthy!");
    } else{
        System.out.println("You are weakened!");
}
    }
}


Mund te perdoret 1 if me kushtin, disa else if dhe vetem 1 here perdoret else.




Perdorimi swich:

public class Ushtrimi6 {
    public static void main(String[] args){
    int myIntVar = 10;
    switch (myIntVar) {
        case 2:
            System.out.println("vlera e variablit eshte 2");
        case 5:
            System.out.println("vlera e variablit eshte 5");
        case 7:
            System.out.println("vlera e variablit eshte 7");
        case 10:
            System.out.println("vlera e variablit eshte 10");
            defautl:
            System.out.println("Vlera nuk perputhet me asnje nga rastet e mesiperme");
    }}}





Perdorimi break:

public class Ushtrimi6 {
    public static void main(String[] args){
    int myIntVar = 10;
    switch (myIntVar) {
        
        case 2:
            System.out.println("vlera e variablit eshte 2");
            break;
        case 5:
            System.out.println("vlera e variablit eshte 5");
            break;
        case 7:
            System.out.println("vlera e variablit eshte 7");
            System.out.println("vlera e variablit eshte 10");
            default:
            System.out.println("Vlera nuk perputhet me asnje nga rastet e mesiperme");
    }}}




Ternory


public class VleraPooseJo {
    public static void main(String[] args){
        int myVarInt = 7;
        System.out.println("My result " + (myVarInt ==6 ? "Po" : "Jo"));
    }
}





Cikli "For"
Ushtrim Counter



public class Test {
        public static void main(String[] args){
            for (int counter = 0; counter < 3 ; counter++){
                System.out.println("Counter " + counter);
            }
        }
}








Ushtrim perdorim fjalie.

public class Ushtrimi6 {
    public static void main(String[] args){
        String[] array = {"Alice" , "has", "a", "cat"};
        for(String element: array){
            System.out.print(element + ' ');
        }
    }
}






Shembull While Loop

public class whileshembull{
    public static void main(String[] args){
       int myVarInt = 0;
               while (myVarInt < 10){
                   System.out.println("Vlera e myVarInt:" + myVarInt);
                   ++myVarInt;
               }
        System.out.println("Sistemi u mbyll me sukses ");
    }
}




Enum (Size)

class FreshJuice {
   enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
   FreshJuiceSize size;
}

public class FreshJuiceTest {

   public static void main(String args[]) {
      FreshJuice juice = new FreshJuice();
      juice.size = FreshJuice.FreshJuiceSize.MEDIUM ;
      System.out.println("Size: " + juice.size);
   }
}





Skedar punonjesish.



import java.io.*;
public class Employee {

   String name;
   int age;
   String designation;
   double salary;

   // This is the constructor of the class Employee
   public Employee(String name) {
      this.name = name;
   }

   // Assign the age of the Employee  to the variable age.
   public void empAge(int empAge) {
      age = empAge;
   }

   /* Assign the designation to the variable designation.*/
   public void empDesignation(String empDesig) {
      designation = empDesig;
   }

   /* Assign the salary to the variable	salary.*/
   public void empSalary(double empSalary) {
      salary = empSalary;
   }

   /* Print the Employee details */
   public void printEmployee() {
      System.out.println("Name:"+ name );
      System.out.println("Age:" + age );
      System.out.println("Designation:" + designation );
      System.out.println("Salary:" + salary);
   }
}





public class HelloWorld{

     public static void main(String []args){
        String x = "Water"; 
        String y = "Kool-Aid";
        x=y;
        System.out.println("x: "+x);
        System.out.println("y: "+y);
     }
}






public static void main(String []args){
        String x = "Water"; 
        String y = "Kool-Aid";
        String temp;
        
        temp = x;
        x = y;
        y = temp;
        
        System.out.println("x: "+x);
        System.out.println("y: "+y);
     }
}











import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");

        String name = scanner.nextLine();


        System.out.println("Hello "+name);

    }
}









public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");

        String name = scanner.nextLine();
        System.out.println("How old are you? ");

        int age = scanner.nextInt();


        System.out.println("Hello "+name);
        System.out.println("You are : "+age+" years old");

    }
}





import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");

        String name = scanner.nextLine();
        System.out.println("How old are you? ");

        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your favorite food ? ");
        String food = scanner.nextLine();

        System.out.println("Hello "+name);
        System.out.println("You are : "+age+" years old");
        System.out.println("You like "+ food );
    }
}





public class Main {

    public static void main(String[] args) {

        int friends = 10;

        friends = friends + 2;


        System.out.println(friends);
       
    }
}





public class Main {

    public static void main(String[] args) {

        int friends = 10;

        friends --;


        System.out.println(friends);

    }
}






import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello "+ name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are "+ age + "years old");
        
    }
}








import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello "+ name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are "+ age + "years old");


        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your heigh"));
        JOptionPane.showMessageDialog(null, "You are "+ height +  "tall");

    }
}







Ushtrim , trekendshi.s

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));

        System.out.println("The hypotenuse is: "+ z);

        
    }
}







import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        //int x = random.nextInt(6)+1;
        //double y = random.nextDouble();

        boolean z = random.nextBoolean();

        System.out.println(z);


    }
}








public class HomeWork {

    public static void main(String[] args) {

        String text1 = "My name is ";
        String text2 = "John Doe";
        String finalText = text1 + text2;

        String text3 = "This is ";
        String text4 = "a test";
        String finalText2 = text3.concat(text4);

        System.out.println("Result1 "+ finalText);
        System.out.println("Result1 "+ finalText2);
    }

}




public class HomeWork {

    public static void main(String[] args) {

        boolean myString1 = true;

        System.out.printf("%s%n", myString1);
        System.out.printf("%S%n", myString1);
    }

}






public class HomeWork {

    public static void main(String[] args) {

        int[] myArray = new int[4];
        myArray[0] = 2;
        myArray[02] = 4;

        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
    }

}





public class HomeWork {

    public static void main(String[] args) {

        int[] myArray = new int[4];
        myArray[0] = 2;
        myArray[2] = 4;
        for(int i = 0; i < myArray.length; i++){

        System.out.println(myArray[i]);

    }

}
}



public class HomeWork {

    public static void main(String[] args) {
String[][] myStringArray = new String[2][];
        myStringArray[0] = new String[]{"Data 1", "Data 2", "Data 4"};
        myStringArray[0] = new String[]{"Data 5", "Data 6", "Data 7"};
        System.out.println(myStringArray[0][0]);
        System.out.println(myStringArray[0][1]);
    }

}





public class HomeWork {
    public static void main(String[] args) {
        String[][] myStringArray = new String[2][];
        myStringArray[0] = new String[]{"Data 1" , "Data 2" , "Data 3" , "Data 4"};
        myStringArray[1] = new String[]{"Data 5", "Data 6", "Data 7", "Data 8"};
        for(int i = 0 ; i < myStringArray.length; i++){
            for(int j = 0; j < myStringArray[i].length; j++){
                System.out.println(myStringArray[i][j]);
            }
        }

    }
}



REVERSE shembull.
import java.util.*;
public class HomeWork {
    public static void main(String[] args) {

        String real;
        String reversed ="";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jepni nje string: ");
        real = scanner.nextLine();

        for ( int i = real.length() - 1; i >= 0; i-- ){
            reversed = reversed + real.charAt(i);
        }

        System.out.println("Stringu i kthyer mbrapsht " + real +" eshte " + reversed);
    }
}


Shembulli CAR
public class Car1 {
    private String color;
    private int maxSpeed;
    private String brand;

    public void setColor(String color){
        this.color = color;
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void printCarParameters() {
        System.out.println("Color: " + this.color + "; Max Speed: " + this.maxSpeed + "; Brand: " + this.brand);
    }
}



Lidhje me klasen Main


public class Main {
    public static void main(String[] args) {
        Car1 car1 = new Car1();
        Car1 car2 = new Car1();
        car1.setBrand("Mercedez");
        car1.setColor("Black");
        car1.setMaxSpeed(250);
        
        car2.setBrand("Toyota");
        car2.setColor("Red");
        car2.setMaxSpeed(250);
        car1.printCarParameters();
        car2.printCarParameters();
    }
}







REVERSE shembull.
import java.util.Scanner;
public class HomeWork {
    public static void main(String[] args) {
        System.out.println("Vendos emrin: ");
        Scanner input = new Scanner(System.in);
        String emri = input.nextLine();
        String temp = "";
        temp += emri.charAt(0);
        for (int i = 1; i < emri.length(); i++) {
            char c1 = emri.charAt(i);
            if (c1 == ' ') {
                temp += emri.charAt(i + 1);
            }
        }
        System.out.print(temp.toUpperCase());
    }
}




REVERSE shembull.
import java.lang.*;
import java.io.*;
import java.util.*;

public class HomeWork {
    public static void main (String [] args){

        System.out.println( "Shkruaj nje string: ");
        Scanner scanner = new Scanner(System.in);

        String myString = scanner.nextLine();
        StringBuilder input1 = new StringBuilder();

        // Bashkangjit nje string tek  StringBuilder input1
        input1.append(myString);

        // Kthen stringun e anasjellte duke perdorur metoden e gatshme reverse
        input1.reverse();

        // Shfaq ne konsole stringun e anasjellte
        System.out.println(input1);
    }
}








Shembull BOOK

public class Book {
    private String title;
    private String author;
    private int numberOfPages;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNumberOfPages(int numberOfPages) {   // public method
        if (isNumberOfPagesIsCorrect(numberOfPages)) {
            this.numberOfPages = numberOfPages;
        } else {
            System.out.println("The provided number of pages is incorrect: " + numberOfPages);
        }
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    private boolean isNumberOfPagesIsCorrect(int numberOfPages) {   // private method
        return numberOfPages > 0;
    }

}



Main qe lidhet me shembullin BOOK
public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("My title");
        book.setAuthor("My Author");
        book.setNumberOfPages(250);
        System.out.println("Title:  " + book.getTitle());
        System.out.println("Book Author:  " + book.getAuthor());
        System.out.println("Number of pages: " + book.getNumberOfPages());
    }
}






RETURN

void returnExample(int number) {
    if (number % 2 == 0) {
        return;
    }
    System.out.println(number);
}


vazhdimi i Return

public class Main {
    public static void main (String[] args) {
 Math math = new  Math();
 math.returnExample(2);
        }
}









Tregon Germen e 1 te emrit dhe mbiemrit.


import java.util.Scanner;

public class HomeWork1 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            String[] names = new String[2];
            System.out.println("Vendos emrin");
            names[0] = scanner.nextLine();
            System.out.println("Vendos mbiemrin");
            names[1] = scanner.nextLine();
            for (String name: names) {
                char result = name.charAt(0);
                System.out.println(result);
            }

        }
    }


IMPORTIMI I NJE KLASE
(Mere me terheqje :)  )


package pl.sdaacademy.main;

import java.awt.print.Book;

public class Testing {
    public static void main(String[] args){
        Book book1 = new Book();
        System.out.println(book1.getNumberOfPages());
    }

    public static class book {
    }
}







Deklaratabreak
Deklarata përfundon deklaratën më të afërt të përcaktimit (që është, , , ose loop) ose deklaratën e ndërrimit.

Deklaratareturn
Deklarata i jep fund ekzekutimit të funksionit në të cilin shfaqet dhe kthen kontrollin dhe rezultatin e funksionit, nëse ka, tek telefonuesi.return


if

Një deklaratë me një pjesë zgjedh një nga dy deklaratat për të ekzekutuar në bazë të vlerës së një shprehjeJeshtrës, siç tregon shembulli i mëposhtëm:ifels

Një deklaratë pa pjesë e ekzekuton trupin e saj vetëm nëse një shprehje Ngasje e vlerëson , siç tregon shembulli i mëposhtëm:ifelsetrue

Ju mund të nest deklarata për të kontrolluar kushte të shumëfishta, siç tregon shembulli i mëposhtëm:if

Deklarataswitch
Deklarata zgjedh një listë deklaratash për të ekzekutuar bazuar në një model të përputhjes me një shprehje të ndeshjes, siç tregon shembulli i mëposhtëm:switch









Si gjendet Shuma:

    public static void main(String[] args) {

        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vendos nr.1: ");
        x = scanner.nextDouble();
        System.out.println("Vendos nr.2: ");
        y = scanner.nextDouble();

        z = x + y;

        System.out.println("Shuma eshte : " + z);
    }
}











Shembull Klasa:


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Shembull1 shembull1 = new Shembull1();



        int sum;
        sum = shembull1.shuma(9,8,7);

        System.out.println(sum);


    }
}


Klasa 2
public class Shembull1 {
    private int num1;
    private int num2;
    private int num3;


    public int shuma(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }



}








public class Testing {
public static void main(String[] args) {
    ArgsClass instance = new ArgsClass();
    instance.printNumber(1);
    instance.printNumber(1,2,7);
     }
    }

Lidhet me kete klase:
public class ArgsClass {
        public void printNumber(int ...numbers) {
                for(int i = 0; i < numbers.length; i++){
                        System.out.println(numbers[i]);
                }
        }
}


Ushtrim per Diametrin.

import java.util.Scanner;
public class Diametri {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendos perimetrin");
        double diameter = scanner.nextDouble();
        float pi = 3.14f;
        double piFromMath = (double) Math.PI;
        System.out.println(piFromMath*diameter);
    }
}






UShtrim per llogaritjen e BMI

import java.util.Scanner;
public class BMI {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendos peshen");
        double pesha = scanner.nextDouble();
        System.out.println("Vendos gjatesine");
        int gjatesia = scanner.nextInt();
        double gjatesiaMeter = (double) gjatesia/100;
        double BMI = (pesha / (gjatesiaMeter * gjatesiaMeter));
        double BMI2 = (pesha / Math.pow(gjatesia, 2));
        System.out.println(BMI);
        System.out.println(BMI2);
        if(BMI < 18.5 && BMI > 24.9) {
            System.out.println("BMI not optimal");
        }
        else {
            System.out.println("BMI optimal");
        }
    }
}


Ushtrim Ekuacioni kuadrik dhe llogaritja e deltes.

import java.util.Scanner;
public class EkuacioniKuadrik {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Vendos nr.1");
        a = scanner.nextInt();
        System.out.println("Vendos nr.2");
        b = scanner.nextInt();
        System.out.println("Vendos nr.3");
        c = scanner.nextInt();

        double delta = Math.pow(b, 2) - (4 * a * c);
        if(delta < 0){
            System.out.println(delta + "\nDelta negative");
            System.exit(0);
        }

        double x1, x2;

        x1 = ((-b) - (Math.sqrt(delta)) / (2 * a));
        x2 = ((-b) + (Math.sqrt(delta)) / (2 * a));

        System.out.println("X1: " + x1);
        System.out.println("X2: " + x2);


    }
}



ose menyra tjeter.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vendosni 3 koeficentet: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double dallori = Math.pow(b, 2) - (4 * a * c);
        if(dallori < 0) {
            System.out.println("Delta negative");
        } else if(dallori == 0) {
            double x = -b/(2*a);
            System.out.println("Koeficenti x: " + x);
        } else {
            double x1 = (-b - Math.sqrt(dallori))/(2*a);
            double x2 = (-b + Math.sqrt(dallori))/(2*a);
            System.out.println("Koeficenti x1: " + x1);
            System.out.println("Koeficenti x2: " + x2);
        }
    }
}



Ushtrimi 4 

Shkruani një aplikacion që merr një numër pozitiv nga përdoruesi (shkruani int) dhe i shkruan të gjitha
numrat nga 1 në numrin e dhënë, secili në rreshtin tjetër, me ndryshimet e mëposhtme:
● në vend të numrave të pjesëtueshëm me 3, në vend të një numri programi duhet të printojë "Fizz"
● në vend të numrave të pjesëtueshëm me 7, në vend të një numri programi duhet të shkruajë
"Buzz"
● nëse numri është i pjesëtueshëm me 3 dhe 7, programi duhet të printojë "Fizz buzz"





    import java.util.Scanner;
    public class FizzBuzz {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Vendosni numrin: ");
            int number = scanner.nextInt();
            while(number < 1) {
                System.out.println("Vendosni nje numer me te madh = 1");
                number = scanner.nextInt();
            }
            for(int i = 1; i <= number; i++) {
                if((i % 3 == 0) && (i % 7 == 0)) {
                    System.out.println("Fizz Buzz");
                } else if(i % 3 == 0) {
                    System.out.println("Fizz");
                } else if(i % 7 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
}}

Ushtrimi 6
shkruani një aplikacion që merr një numër n nga përdoruesi (shkruani int) dhe llogarit numrin
shuma e serive harmonike nga 1 në n, sipas formulës së mëposhtme: 


import java.util.Scanner;

public class CalculateSum {
    public static void main(String[] args) {
        int num;
        double shumaVargu= 0.0;
        System.out.print("Vendos nje numer: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        shumaVargu = llogaritShumaVargu(num);
        System.out.println("Shuma eshte: "+ shumaVargu);
    }

    public static double llogaritShumaVargu(int nrPerdoruesi) {
        double shuma = 0.0;
        while (nrPerdoruesi > 0){
            shuma = shuma + (double)1/nrPerdoruesi;
            nrPerdoruesi--;
        }
        return shuma;
    }
}







Ushtrimi 7

shkruani një aplikacion që do të marrë një numër pozitiv nga përdoruesi (shkruani int) dhe
llogaritni numrin Fibonacci në indeksin e treguar. Për shembull, nëse numri është i barabartë
5, programi juaj duhet të printojë numrin e pestë Fibonacci. Në sekuencën Fibonacci, secili
numri është shuma e dy paraardhësve. Për shembull, Fibonaccit e parë
numrat janë: 

public class Task7 {
    public static void main(String[] args) {
        int n = 7;
        int n2 = llogaritFib(n);
    }
    
    static int llogaritFib(int n) {
        if(n <= 1)
            return n;
        else return llogaritFib(n-1) + llogaritFib(n-2);
    }
}



Ushtrimi 8

500 / 5,000
Translation results
Shkruani një aplikacion që zbaton një kalkulator të thjeshtë. Aplikimi duhet:
a. lexo numrin e parë (lloji float)
b. lexoni një nga simbolet e mëposhtme: + - / *
c. lexo numrin e dytë (lloji float)
d. kthejnë një rezultat të një operacioni të caktuar matematikor
Nëse përdoruesi ofron një simbol të ndryshëm nga ai i mbështetur, aplikacioni duhet të printojë "I pavlefshëm
simboli". Nëse veprimi i futur nuk mund të zbatohet (d.m.th. nuk është në përputhje me
parimet e matematikës), aplikacioni duhet të printojë "Nuk mund të llogaritet". 


import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char veprimi = sc.next().charAt(0);
        System.out.print("Nr1: ");
        float nr1 = sc.nextFloat();
        System.out.println("Nr2: ");
        float nr2 = sc.nextFloat();

        while(Character.compare(veprimi, '/') == 0 && nr2 == 0) {
            System.out.println("Numri 2 nuk mund te jete 0: ");
            nr2 = sc.nextFloat();
        }
        float result = 0;

        switch (veprimi) {
            case '+':
                result = nr1 + nr2;
                break;
            case '-':
                result = nr1 - nr2;
                break;
            case '*':
                result = nr1 * nr2;
                break;
            case '/':
                result = nr1 / nr2;
                break;
            default:
                System.out.println("Invalid");
        }

        System.out.println("Resultati:" + result);

    }
}



Ushtrimi 9
Shkruaj një program që do të marrë një numër pozitiv nga përdoruesi (lloji int) dhe vizato një 
valë me gjatësi dhe lartësi të caktuar prej 4 rreshtash, sipas shembullit të mëposhtëm (mbush 
hapësira boshe me hapësira):


import java.util.Scanner;

    public class Task9 {
        public static void main(String[] args) {
            int lartesia = 4;
            System.out.println("Vendosni gjeresine: ");
            Scanner sc = new Scanner(System.in);
            int gjeresia = sc.nextInt();
            for (int i = 0; i < lartesia; i++) {
                String lineStr = prepareLine(i, lartesia, gjeresia);
                System.out.println(lineStr);
            }
        }

        //printimi i yjeve behet rresht me rresht sipas gjeresise
        //pra nese gjeresia eshte 2 do te printohet fillimisht rreshti i pare
        // *      **      * -> rreshti 1
        //  *    *  *    * -> rreshti 2
        //   *  *    *  *  -> rreshti 3
        //    **      **   -> rreshti 4
        private static String prepareLine(int line, int lartesia, int gjeresia) {
            String lineStr = "";
            for (int j = 1; j <= gjeresia; j++) {
                //ben te mundur printimin e hapesirave ne fillim
                int beforeSpaces = line;
                if (j > 1) {
                    beforeSpaces *= 2;
                }
                for (int k = beforeSpaces; k > 0; k--) {
                    lineStr += " ";
                }

                //printon yllin pas hapesirave fillestare
                lineStr += "*";

                //printon hapesiren mes dy yjeve
                int length = lartesia + lartesia - 2;
                int spaces = length - (2 * line); // llogarit spaces midis dy yjeve ne nje V
                for (int l = spaces; l > 0; l--) {
                    lineStr += " ";
                }
                //printon yllin pas hapesirave te mesit
                lineStr += "*";
            }
            return lineStr;
        }
    }


Console:

*      **       **       *
 *    *  *     *  *     *
  *  *    *   *    *   *
    *       *        *
  



Task  11

Shkruaj një program që do të lexojë tekste (variabla të llojit String) derisa përdoruesi të japë 
teksti "Mjaft!" dhe pastaj shkruan tekstet më të gjata të dhëna (pa përfshirë tekstin 
"Mjaft!"). Nëse përdoruesi nuk jep ndonjë tekst, shkruaj "Asnjë tekst i dhënë".


import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String userInput = scanner.nextLine();
        String maxString = "";
        while (!userInput.equals("enough")) {

            if(userInput.isBlank()){
                System.out.println("No text provided// Enter text: ");
                userInput = scanner.nextLine();
            }

            if(userInput.length() > maxString.length() && !userInput.equals("enough")){
                maxString = userInput;
            }
            System.out.print("Enter text: ");
            userInput = scanner.nextLine();
        }

        if(!maxString.isBlank()){
            System.out.println("Teksti me i gjate: " + maxString);
        }

    }
}
 


Ushtrimi 12

Shkruaj një program që lexon një tekst nga përdoruesi (tipi String) dhe numëron një përqindje 
të ndodhive të një karakteri hapësinor. (tregon nr e hapsirave dhe % qe zene hapsirat.)


import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String userInput = scanner.nextLine();
        char[] karakteret = userInput.toCharArray();
        int counter = 0;
        for (char c: karakteret ) {
            if(Character.isSpaceChar(c))
                counter++;
        }
        System.out.println("Nr i spaces " + counter);
        System.out.println(((double) counter/userInput.length()) * 100);
    }
}




import java.util.Scanner;

public class Task12MeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vendosni nje fjali: ");
        String fjalia = sc.nextLine();
        int counter = 0;
        char[] karakteret = fjalia.toCharArray();
        for(char k: karakteret) {
            if(Character.isSpaceChar(k))
                counter++;
        }
        
//        for(int i = 0; i < karakteret.length; i++) {
//            if(Character.isSpaceChar(karakteret[i])) {
//                counter++;
//            }
//        }         
        System.out.println("Numri i spaces: " + counter);
        System.out.println("Perqindja e karaktereve space eshte: " +
                ((double)counter/fjalia.length()) * 100);
    }
}



Task 13

Shkruaj një program që "belbëzon", që do të thotë, lexon tekstin e përdoruesit (tip String), dhe printon 
teksti i dhënë, në të cilin çdo fjalë shtypet dy herë.
Për shembull, për hyrjen: "Ky është testi im" aplikimi duhet të shtypë "Kjo është 
testin tim".



import java.util.Scanner;
public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String [] tokens = str.split(" ");
         for(int i = 0; i < tokens.length; i++) {
             System.out.print(tokens[i]+ " " + tokens[i]+ " ");
         }

    }
}


Task 14:

Shkruaj një program që lexon dy shkronja të alfabetit latin (lloji char) 
dhe llogarit sa karaktere ka në alfabetin midis shkronjave të dhëna. 
Hint - përdorni tabelën e kodit ASCII dhe trajtojini karakteret si numra int.

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vendosni k1: ");
        char k1 = sc.next().charAt(0);
        System.out.println("Vendosni k2: ");
        char k2 = sc.next().charAt(0);

        int a1 = k1;
        int a2 = k2;

        System.out.println("Karakteri " + k1 + " : " + a1);
        System.out.println("Karakteri " + k2 + " : " + a2);
        System.out.println(a2 - a1 - 1);
    }
}







Fatura per tu paguar:

    public static void main(String[] args) {
        {
            long units;
            Scanner sc = new Scanner (System.in);
            System.out.println("Enter number of units");
            units = sc.nextLong();
            double billpay = 0;
            if(units<100)
                billpay=units*1.20;

            else if(units<300)
                billpay=100*1.20+(units-100)*2;

            else if(units>300)
                billpay=100*1.20+200 *2+(units - 300) *3;
            System.out.println("Bill to pay: " + billpay);
        }
    }}

