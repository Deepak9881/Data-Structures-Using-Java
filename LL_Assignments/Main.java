package LL_Assignments;

public class Main {

    public static void main(String[] args) {
        SinglyLLOpe o = new SinglyLLOpe();
//
//        o.insertFirst(20);
//        o.insertFirst(40);
//        o.insertFirst(30);
//        o.insertFirst(40);
//        o.insertFirst(40);
//        o.insertFirst(30);
//        o.insertFirst(30);





        o.insertFirst(30);
        o.insertFirst(20);
        o.insertLast(40);
        o.insertLast(20);
        o.insertLast(60);
//        o.display();
        o.insertAt(90,5);
        o.insertAt(20,5);
        o.insertLast(30);
        o.insertLast(80);

        o.display();
        System.out.println("\n"+(o.size()));
        o.checkdupli();
        o.display();
    }
}
