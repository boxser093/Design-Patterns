package com.ilya.designpattern.generativepatterns.singleton;

public class SingletonRunner {
    public static void main(String[] args) {
       VkWall.getVkWall().addPost("Hello from 2008.");
       VkWall.getVkWall().addPost("D.Bilan winner Eurovision.");
       VkWall.getVkWall().showWall();
    }
}
