package com.ilya.designpattern.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class AirportDispatcherStation implements DispatcherСommunication{
    RadioOperator operator;
    List<RadioOperator> pilots = new ArrayList<>();

    public void setOperator(RadioOperator operator) {
        this.operator = operator;
    }
    public void addPilotToList(RadioOperator pilots){
        this.pilots.add(pilots);
    }

    @Override
    public void sendMessage(String message, RadioOperator operatorss) {
                for (RadioOperator pilot: pilots){
                    if(pilot!=operatorss){
                        pilot.getMessage(message);
                    }
                }
                this.operator.getMessage(message);
    }
}
