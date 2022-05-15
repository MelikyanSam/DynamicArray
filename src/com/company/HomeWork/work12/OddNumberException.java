package com.company.HomeWork.work12;

public class OddNumberException extends Exception{
    OddNumberException(String s) {
        System.out.println(s);
    }
    public static void oddNum(int e) throws OddNumberException {
        if(e%2 != 0)
            throw new OddNumberException("OddNumberException");
    }

    public static void main(String[] args) {
        int a = 7;
        try{

            oddNum(a);
            a -= 2 ;
//            throw new OddNumberException(a);
        }catch (OddNumberException e){
            System.out.println("The number was odd. ");
            a++;
        }
        System.out.println(a);
    }
}
