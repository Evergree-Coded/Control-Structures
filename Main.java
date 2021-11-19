import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //int x = 8;
    /*if (x == 5){
      System.out.println("x == 5");
      System.out.println("correct!");
    } 
    else{
      System.out.println("x is not 5");
    }*/


    /*int age = 14;

    if(age > 20){
      System.out.println("You are old!");
    }
    else if(age < 10){
      System.out.println("Wow!");
    }
    else if(age == 16){
      System.out.println("You are 16!");
    }
    else{
      System.out.println("You are young!");
    }*/
    /*int x = 5;
    if(x != 3){
      System.out.println("true");
    }
    if(x > 2){
      System.out.println("big");
    }
    if(x < 3){
      System.out.println("small");
    }
    if(x <= 2){
      System.out.println("nice!");
    }
    if(x >= 2){
      System.out.println("cool!");
    }*/

    /*boolean found = false;

    //System.out.println(!found);
    int x = 0;
    if(x > 3 || x < 10){
      System.out.println("true");
    }*/
    

    //Task 1
    /*Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    if(number > 0){
      System.out.println("positive");
    }
    else if(number == 0){
      System.out.println("zero");
    }
    else{
      System.out.println("negative");
    }*/

    //Task 2

    /*int x = 11;
    if(x > 0 && x < 10){
      System.out.println("middle");
    }*/

    //Task 3
    String letter = "c";
    String str = "abcde";
    
    if(str.substring(0, 1).equals(letter)){
      System.out.println("The letter is a");
    }
    else if(str.substring(1, 2).equals(letter)){
      System.out.println("The letter is b");
    }
    else if(str.substring(2, 3).equals(letter)){
      System.out.println("The letter is c");
    }
    else if(str.substring(3, 4).equals(letter)){
      System.out.println("The letter is d");
    }
    else if(str.substring(4, 5).equals(letter)){
      System.out.println("The letter is e");
    }
    else{
      System.out.println("The letter is not found");
    }
    
  }
}