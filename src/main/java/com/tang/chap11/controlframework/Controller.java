package com.tang.chap11.controlframework;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Controller
 * @Description
 * @Date 2022/8/17 22:53
 * @Author by tangyao
 */
public class Controller {
    private List<Event> eventList = new ArrayList<>();

    public void addEvent(Event c) {
        eventList.add(c);
    }

    public void run() {
        while (eventList.size() > 0) {
            //创建一个副本，这样在选择列表中的元素时，就不会改动列表了
            for (Event event : new ArrayList<>(eventList)) {
                if (event.ready()) {
                    System.out.println(event);
                    event.action();
                    eventList.remove(event);
                }
            }
        }
    }
}
