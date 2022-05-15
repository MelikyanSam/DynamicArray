package com.company.HomeWork.work11;



    public class Bycicle extends Byke {


        void get() {
            System.out.println("The wheels are " + wheels);
            System.out.println("The seats are " + seat);
            System.out.println("The speed is " + speed);
            System.out.println("The weight is " + weight);
            System.out.println("Does it automatic? " + automatic);
        }
        boolean setAutomatic(boolean a ){
            return automatic = a;
        }
        int setSeat(int a ){
            return seat = a;
        }
        int setWeight(int a ){
            return weight = a;
        }



        public String toString(){
            return "" + wheels;
        }

    }


