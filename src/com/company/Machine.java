package com.company;

public class Machine {
    private Rule rule;
    private Motor motor;
    private Pedal pedal;
    public Machine(Motor motor, Rule rule, Pedal pedal){
      this.motor=motor;
      this.rule= rule;
      this.pedal=pedal;
    }
    public void  go () {
        motor.started();
        pedal.gaz();
           }
}


