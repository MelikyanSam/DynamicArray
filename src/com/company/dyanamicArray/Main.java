package com.company.dyanamicArray;

public class Main {
    public static void main(String[] args) {
        DynamicArray one = new DynamicArray(0);

        DynamicArray two = new DynamicArray(one.getArr());

        one.add(12);
        one.add(102);
        one.add(62);
        one.add(1082);

//        two.add(12);
//        two.add(102);
//        two.add(62);
//        two.add(1082);

//        one.add(12);
//        one.add(102);
//        one.add(62);
//        one.add(1082);

//        two.add(451);
//        two.add(202);
//        two.add(30);

//        one.add(2, 98);
//        one.add(8, 898);

//        one.add(two);
//        one.add(two);

//        one.add(1,two);
//        one.add(9,two.getArr());

//        one.add(two);

//        one.add(two.getArr());

//        one.removeByIndex(0);
//        one.removeByValue(92);

//        System.out.println(one.indexOf(98) + " *");
//        System.out.println(one.lastIndexOf(62) + " *");

        one.sort(true);
//        one.sort(1);
//        System.out.println(one.contains(two, 0, 1));
//        one.removeByValue(102);
        one.show();
        System.out.println("-------------------------");
        System.out.println(one.getCapacity());
        System.out.println(one.len);

//        System.out.println(one.contains(200));
    }
}
