package com.company;

public class Main {
    public static void main(String[] args) {
   final Machine car=new Machine(new Motor(), new Rule(),new Pedal());
  car.go();
       }
}
