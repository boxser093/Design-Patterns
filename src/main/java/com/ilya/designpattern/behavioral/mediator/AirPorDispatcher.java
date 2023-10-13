package com.ilya.designpattern.behavioral.mediator;

public class AirPorDispatcher implements RadioOperator{

    private String name;
    DispatcherСommunication dispatcherСommunication;
    public AirPorDispatcher(String name, DispatcherСommunication dispatcherСommunication) {
        this.name = name;

        this.dispatcherСommunication = dispatcherСommunication;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        dispatcherСommunication.sendMessage(message,this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.name+ ": receiving message: "+ message + ".");
    }
}
