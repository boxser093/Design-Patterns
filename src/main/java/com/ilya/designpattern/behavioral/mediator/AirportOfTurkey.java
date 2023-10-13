package com.ilya.designpattern.behavioral.mediator;

public class AirportOfTurkey {
    public static void main(String[] args) {
        AirportDispatcherStation radioStation = new AirportDispatcherStation();

        RadioOperator operatorStation = new AirPorDispatcher( "Binali Yildirim",radioStation);
        RadioOperator pilot = new Pilot(radioStation,"Mehmet Altunbay",347);
        RadioOperator pilot1 = new Pilot(radioStation,"Akın Öztürk",456);

        radioStation.setOperator(operatorStation);
        radioStation.addPilotToList(pilot);
        radioStation.addPilotToList(pilot1);

        pilot.sendMessage("Ankara is permission to land? This is 347");
        pilot1.sendMessage("Ankara is may I take off? This is 456");
        operatorStation.sendMessage("Board 347, landing is allowed!");
        operatorStation.sendMessage("Board 456, takeoff is allowed!");
    }
}
