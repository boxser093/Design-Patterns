package com.ilya.designpattern.behavioral.memento;

public class Gothic2NB {
    public static void main(String[] args) {

        GameSave save = new GameSave();
        SaveFolder folder = new SaveFolder();

        System.out.println("Creating 1 save");
        save.setVersionAndDate("autosave 01");
        System.out.println(save);
        System.out.println("Saving....");
        folder.setSaver(save.save());
        save.setVersionAndDate("autosave 02");
        System.out.println(save);
        System.out.println("Saving....");
        folder.setSaver(save.save());
        save=null;
        System.out.println(save);
        save= new GameSave();
        System.out.println(save);
        save.load(folder.getSaver());
        System.out.println(save);
    }
}
