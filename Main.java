

import java.io.*;

public class Main {
    public static void main(String[] args) {

        MyLinkedList<Object> mylist = new MyLinkedList<>();

        mylist.add("banana");
        mylist.add("apple");
        mylist.add("cat");
        mylist.add("MONKE");
        mylist.add("cat");
        mylist.add("apple");
        mylist.add(new Object());
        mylist.add(new Object());
        mylist.add(new Object());
        mylist.add(new Object());

        /* try {
            Object something = mylist.get(8);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("I get an index out of bound exception");
            e.printStackTrace(System.out);
        }

         */

        //test
        mylist.listTraverse();
        System.out.println("List size: " + mylist.size());
        mylist.remove("cat");
        mylist.listTraverse();
        System.out.println("List size: " + mylist.size() + " ==> ");
        mylist.remove(4);
        mylist.listTraverse();
        System.out.println("List size: " + mylist.size() + " ==> ");


        mylist.add("car");
        mylist.listTraverse();
        System.out.print("List size: " + mylist.size() + " ==> ");
        System.out.println("one object added");
        System.out.println(mylist.contains("MONKE"));
        System.out.println(mylist.contains("Monkies in the car"));
        System.out.println(mylist.get(0));
        System.out.println(mylist.get(8));
        // System.out.println(mylist.get(20)); this gives us the exception NICE






       /* FileReader file = null;
        try {
            file = new FileReader("what/ever.txt");
            MyLinkedList<Object> mylist = null;
            mylist.get(5); //guaranteed null pointer
            System.out.println("Yes???");
        } catch (FileNotFoundException f) {
            System.out.println("my file is" + file.toString());
            System.out.println("Aohw..." + f.getMessage());
            System.out.println("   " + f.getClass().toString());
        } catch (IOException e) {
            System.out.println("Whoa..." + e.getMessage());
            System.out.println(e.getClass().toString());
        } catch (NullPointerException npe) {
            System.out.println("As Expacted");
        }

        */
    }
}