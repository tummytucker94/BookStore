package org.example;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*
        * Register:
        *
        * firstName, lastName, email, password
        * */
        Scanner scanner = new Scanner(System.in);

        //Register
       // System.out.println();

        System.out.println("1 - Register, 2 - Login");
        String option1 = scanner.nextLine();
        switch(option1){
            //issue: BookStore #1
            case "1":
                System.out.println("Enter Your FirstName");
                String firstNameRegister = scanner.nextLine();
                System.out.println("Enter Your LastName");
                String lastNameRegister = scanner.nextLine();
                System.out.println("Enter Your Email");
                String emailRegister = scanner.nextLine();
                System.out.println("Enter Your Password");
                String passwordRegister = scanner.nextLine();
                break;
            //issue: BookStore #2
            case "2":
                System.out.println("Enter Your Email");
                String emailLogin = scanner.nextLine();
                System.out.println("Enter Your Password");
                String passwordLogin = scanner.nextLine();
        }

        //BookStore #3
        Map<Integer, String> categories = new HashMap<>();
        categories.put(0,"fiction");
        categories.put(1,"nonfiction");

        System.out.println("Here is a list of categories that we have: " + categories.entrySet());

        //BookStore #4
        System.out.println("Which category of books do you want to explore?");
        String option2 = scanner.nextLine();
        switch(option2){
            //issue: BookStore #5
            case "0":
                System.out.println("A Tale of Two Cities by Jack London, 9780451530578");
                Book fictionBook1 = new Book("A Tale of Two Cities","Jack London","9780451530578", 9.99);
                break;
            case "1":
                System.out.println("7 Habits of Highly Effective People, 9780451530579");
                Book nonfictionBook1 = new Book("7 Habits of Highly Effective People","Stephen Covey","9780451530579", 9.99);
        }

        //Issue:BookStore#7
        System.out.println("1 - Buy, 2 - Cancel");
        String option3 = scanner.nextLine();
        List<Book> shoppingCart = new ArrayList<>();
        switch(option3){

            case "1":
               //add some code / BookStore #8
                if(option2 == "1"){
                    shoppingCart.add(new Book("7 Habits of Highly Effective People","Stephen Covey","9780451530579", 9.99));
                    System.out.println("Non fiction book added to shopping cart successfully");
                }else{
                    shoppingCart.add(new Book("A Tale of Two Cities","Jack London","9780451530578", 9.99));
                    System.out.println("Fiction book added to shopping cart successfully");
                }
                break;
            case "2":
                //add some code / BookStore #8
                System.out.println("Which category of books do you want to explore?");
                String option4 = scanner.nextLine();
                switch(option4){
                    case "0":
                        System.out.println("A Tale of Two Cities by Jack London, 9780451530578");
                        Book fictionBook1 = new Book("A Tale of Two Cities","Jack London","9780451530578", 9.99);
                        break;
                    case "1":
                        System.out.println("7 Habits of Highly Effective People, 9780451530579");
                        Book nonfictionBook1 = new Book("7 Habits of Highly Effective People","Stephen Covey","9780451530579", 9.99);
                }
        }







    }
}
