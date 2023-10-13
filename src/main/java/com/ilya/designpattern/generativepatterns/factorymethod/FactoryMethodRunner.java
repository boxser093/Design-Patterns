package com.ilya.designpattern.generativepatterns.factorymethod;

public class FactoryMethodRunner {
    public static void main(String[] args) {
        DoctorFactory doctorFactory = createDoctorBySpecialty("surgeon");
        Doctor doctor = doctorFactory.createDoctor();
        doctor.heal();
    }

    static DoctorFactory createDoctorBySpecialty(String specialty){
        if(specialty.equalsIgnoreCase("pediatrician")){
            return new  PediatricianFactory();
        } else if(specialty.equalsIgnoreCase("surgeon")){
            return new SurgeonFactory();
        } else if(specialty.equalsIgnoreCase("traumatolog")){
            return new TraumatologistFactory();
        } else {
            throw new RuntimeException(specialty + " is unknown specialty");
        }
    }

}
