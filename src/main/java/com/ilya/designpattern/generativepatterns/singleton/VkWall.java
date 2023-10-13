package com.ilya.designpattern.generativepatterns.singleton;

public class VkWall {
    private static VkWall vkWall;
    private static String posts = "This my wall. \n\n";

    public synchronized static VkWall getVkWall(){
        if(vkWall ==null){
            vkWall = new VkWall();
        }

        return vkWall;
    }
    private VkWall(){

    }

    public void addPost(String post){
        posts += post +"\n";
    }
    public void showWall(){
        System.out.println(posts);
    }
}
