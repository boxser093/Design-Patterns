package com.ilya.designpattern.behavioral.mediator;

public class Pilot implements RadioOperator{

    DispatcherСommunication dispatcherСommunication;
    private String namePilot;
    private int boardNumber;



    public String getNamePilot() {
        return namePilot;
    }

    public void setNamePilot(String namePilot) {
        this.namePilot = namePilot;
    }

    public Pilot(DispatcherСommunication dispatcherСommunication, String namePilot, int boardNumber) {
        this.dispatcherСommunication = dispatcherСommunication;
        this.boardNumber = boardNumber;
        this.namePilot = namePilot;
    }

    @Override
    public void sendMessage(String message) {
        dispatcherСommunication.sendMessage(message,this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.namePilot+" board "+this.boardNumber+  ": received message - "+ message+". ");
    }
}
