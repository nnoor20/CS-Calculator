/*
   Program name: Noora Noor
   Description: This program solves simple math equations and when finished gives you the number of problems the 
   calculator solved
   Author:Noora Noor
   Date: 11/09/21
   Version:01
   Vocabulary word: Bellicose- prone to agression.
   Inspirational quote:"Strong women know they don't need a knight in shining armor. 
   They can save themselves.- Catherine de'Medici(Reign)
   */

import java.util.Scanner;

public class Calculator2{ 

Scanner scan = new Scanner(System.in);
static String choice;
static boolean go;
int aNum = 0;
int sNum = 0;
int mNum = 0;
int dNum = 0;
int total = 0;

public void printIntro() {

System.out.println("This program helps you solve simple math problems.");
System.out.print("Would you like to continue? (press y to continue or press n to quit): ");
choice = scan.nextLine();
  
if(choice.equals("Y")||(choice.equals("y"))){
go= true;
}
else{
go = false;
}
}

public void calc(){
System.out.println("What kind of problem would you like to solve?\n" + 
"(A)dditon\n"+"(S)ubtraction\n" + "(M)ultiplication\n" + "(D)ivison\n");

do{
System.out.println();
System.out.print("select A,S,M,or D:");
String choice = scan.nextLine();

if(choice.equals("A")||(choice.equals("a"))){
System.out.println();
System.out.println("You chose Addition. " + "Enter a number:");
int a = scan.nextInt();
System.out.print("Enter a second number:");
int b = scan.nextInt();
scan.nextLine();


int c = a + b;
System.out.print("The answer is: " + c);
aNum++;
}

else if(choice.equals("S")||(choice.equals("s"))){
System.out.println();
System.out.println("You chose Subtraction. " +"Enter a number:");
int a = scan.nextInt();
System.out.print("Enter a second number:");
int b = scan.nextInt();
scan.nextLine();

int c = a -b ;
System.out.print("The answer is: " + c);
sNum++;
}

else if(choice.equals("M")||(choice.equals("m"))){
System.out.println();
System.out.print("You chose Multiplication. " + "Enter a number:");
int a = scan.nextInt();
System.out.print("Enter a second Number:");
int b = scan.nextInt();
scan.nextLine();

int c = a * b;
System.out.print("The answer is: " + c);
mNum++;
}

else if(choice.equals("D")||(choice.equals("d"))){
System.out.println();
System.out.print("You chose Divison. " + "Enter a number:");
int a = scan.nextInt();
System.out.print("Enter a second number:");
int b = scan.nextInt();
scan.nextLine();

int c = a / b;
System.out.print("The answer is: " + c);
dNum++;
}

System.out.println();
System.out.print("would you like to solve any other problems?(Press Y for yes and N to quit):");
choice = scan.nextLine();

if(choice.equals("N")||(choice.equals("n"))){
go = false;
}
else{
go = true;
}


}while(go);
}
public void Total(){

total = aNum + sNum + mNum + dNum;

System.out.println();
System.out.println("These are the amounts of problems the calculator solved");
System.out.println("Addition Problems:"+ aNum);
System.out.println("Subtraction Problems:" + sNum);
System.out.println("Multiplication Problems:" + mNum);
System.out.println("Division Problems:" + dNum);
System.out.println("Total Problems:" + total);
}



public static void main (String args[]) {

Calculator2 f = new Calculator2();
f.printIntro();
if(f.go){
f.calc();
}
f.Total();
}
}



