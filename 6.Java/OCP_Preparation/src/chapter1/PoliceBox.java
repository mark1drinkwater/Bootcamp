/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter1;

public class PoliceBox {
 String color;
 long age;
 public void PoliceBox() {
 color = "blue";
 age = 1200;
}
 public static void main(String []time) {
 var p = new PoliceBox();
 var q = new PoliceBox();
 p.color = "green";
 p.age = 1400;
 p = q;
 System.out.println("Q1="+q.color);
 System.out.println("Q2="+q.age);
 System.out.println("P1="+p.color);
 System.out.println("P2="+p.age);
} }