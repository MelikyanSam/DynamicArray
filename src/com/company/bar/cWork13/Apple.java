package com.company.bar.cWork13;

public enum Apple {
    JONATHAN, GOLDENDEL, REDDEL, WINESAP, CORTLAND;


}

class EnumDemo{
    static void swap( Integer a, Integer b) {
        int c = a;
        a = b;
        b = c;
//        System.out.println(" a : " + a + " b : " + b );
    }
    public static void main(String[] args) {
        Integer a = 8, b = 2;
        System.out.println("Before swap  a : " + a + " b : " + b );
        swap(a,b);
        System.out.println("After swap a : " + a +  " b : " + b);
//        Apple ap;
//
//        ap = Apple.REDDEL;
//
//        System.out.println("Value of ap: " + ap);
//        System.out.println();
//
//        ap = Apple.GOLDENDEL;
//
//        if(ap == Apple.GOLDENDEL)
//            System.out.println("ap contains GoldenDel.\n");
//
//        switch(ap){
//            case JONATHAN :
//                System.out.println("Jonathan is red");
//                break;
//            case GOLDENDEL:
//                System.out.println("GoldenDel is yellow");
//                break;
//            case REDDEL:
//                System.out.println("Red Deliciuse is red");
//                break;
//            case WINESAP:
//                System.out.println("WINESAP is red");
//                break;
//            case CORTLAND:
//                System.out.println("CORTLAND is red");
//                break;
//        }
    }
}
