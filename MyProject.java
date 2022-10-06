package practice;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class MyFirstProject {
    public static void main(String[] args) {
          /* - Type code to ask user to enter the int elements and add elements into the list
        - Ask user to enter the elements to remove, then remove that element from list.
        - Ask user to enter the element to update, then update it.

*/

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        int x = 0;

        while(true){
            System.out.println("Enter your " + (x+1) + ". element of you want to add to do list.Press Q button for stop"  );

            String s = input.next();
            if (s.equalsIgnoreCase("q")){
                break;
            }

            numbers.add(Integer.valueOf(s));
            x++;

        }
        System.out.println("Your list is :" + numbers);


        System.out.println("Do you want to remove or update any elements ? Yes:Y No:N");
        String choice = input.next();
        if (choice.equalsIgnoreCase("n")){
            System.out.println("Your list is : " + numbers);
        }else{
            System.out.println("Which one do you want Remove or Update ? Remove:R Update:U ");

            String choiceForRU = input.next();
            if (choiceForRU.equalsIgnoreCase("r")){
                System.out.println("Which element you want to remove ? ");
                String elementForRemove = input.next();
                numbers.remove(Integer.valueOf(elementForRemove));

            }else if (choiceForRU.equalsIgnoreCase("u")){
                System.out.println("Which number do you want to update");
                String updateNumber = input.next();
                int updatedNumberIndex =numbers.indexOf(Integer.valueOf(updateNumber));
                System.out.println("Enter your new number");
                String newNumber = input.next();
                numbers.set(updatedNumberIndex,Integer.valueOf(newNumber));

            }
            System.out.println("Your list is : " + numbers);



        }





















    }
}
