package com.ilya.designpattern.behavioral.state;

import com.ilya.designpattern.behavioral.chainofresponsibility.Level;

public class Dog {
    Activity activity;
    public void setActivity(Activity activity){
        this.activity = activity;
    }
    public void changeActivity(){
        if(activity instanceof Eat){
            setActivity(new Walk());
        } else if(activity instanceof Sleep){
            setActivity(new Eat());
        } else if(activity instanceof Walk){
            setActivity(new Love());
        } else if(activity instanceof Love){
            setActivity(new Sleep());
        }
    }

    public void doIt(){
        activity.doIt();
    }
}
