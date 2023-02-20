/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;


public class StringSplit{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     String id = "123,456,789";

        String[] output = id.split(",");

        System.out.println(output.length);  // 2

        String part1 = output[0]; 
        String part2 = output[1];
        String part3 = output[2];

        System.out.println(part1); 
        System.out.println(part2);
        System.out.println(part3);

    }

}
