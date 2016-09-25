package org.courses.hillel;

public class OrderOfElements {
    public static void main(String[] args) {
        System.out.print("1 ");
        for(int i = 1; i < 55; i++){
            if(i%2 != 0){
                int result = i + 2;
                System.out.print(result + " ");
            }
        }
    }
}
