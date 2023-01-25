package day01_variables;

import java.util.Scanner;

public class questions {
    public static void main(String[] args) {
        //4.question
        Scanner scan=new Scanner(System.in);
        System.out.print("1.people age : ");
        int onePeople= scan.nextInt();
        System.out.print("2.people age : ");
        int twoPeople= scan.nextInt();
        System.out.print("3.people age: ");
        int threePeople= scan.nextInt();

        if(onePeople>twoPeople && twoPeople>threePeople){
            System.out.println("Eldest : onePeople, yongest : threePeople");
        }else if(onePeople>threePeople && threePeople>twoPeople){
            System.out.println("Eldest : onePeople, yongest : twoPeople");
        }else if(twoPeople>onePeople && onePeople>threePeople){
            System.out.println("Eldest : twoPeople, yongest : threePeople");
        }else if(twoPeople>threePeople && threePeople>onePeople){
            System.out.println("Eldest : twoPeople, yongest : onePeople");

        }else if(threePeople>twoPeople && twoPeople>onePeople){
            System.out.println("Eldest : threePeople, yongest : onePeople");
        }else if(threePeople>onePeople && onePeople>twoPeople){
            System.out.println("Eldest : threePeople, yongest : twoPeople");
        }else{
            System.out.println("erorr");
        }
        //




    }
}
