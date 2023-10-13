package com.ilya.designpattern.behavioral.observer;

import java.util.List;

public interface Observer {
    void handleEvent(List<String> newOrder);
}
