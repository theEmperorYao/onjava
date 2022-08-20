package com.tang.chap11.controlframework;

import java.time.Duration;
import java.time.Instant;

/**
 * @Classname Event
 * @Description
 * @Date 2022/8/17 22:48
 * @Author by tangyao
 */
public abstract class Event {
    private Instant eventTime;
    protected final Duration delayTime;

    public Event(long millisecondDelay) {
        delayTime = Duration.ofMillis(millisecondDelay);
        start();
    }

    public void start() {
        eventTime = Instant.now().plus(delayTime);
    }

    public boolean ready() {
        return Instant.now().isAfter(eventTime);
    }

    public abstract void action();

    public static void main(String[] args) {
        Instant now = Instant.now();
        Duration duration = Duration.ofMillis(100L);
        System.out.println("duration = " + duration);
        Instant plus = now.plus(duration);
        System.out.println("plus = " + plus);
        System.out.println("now = " + now);
    }
}
