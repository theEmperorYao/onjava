package com.tang.chap11.controlframework;

import java.util.Arrays;

/**
 * @Classname GreenhouseControls
 * @Description
 * @Date 2022/8/17 23:05
 * @Author by tangyao
 */
public class GreenhouseControls extends Controller {
    private boolean light = false;

    public class LightOn extends Event {

        public LightOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            // 将硬件控制代码放在这里，
            // 实际上打开灯
            light = true;
        }

        @Override
        public String toString() {
            return "Light is on";
        }
    }

    public class LightOff extends Event {

        public LightOff(long millisecondDelay) {
            super(millisecondDelay);
        }

        @Override
        public void action() {
            light = false;
        }

        @Override
        public String toString() {
            return "Light is off";
        }
    }

    private boolean water = false;

    public class WaterOn extends Event {
        public WaterOn(long millisecondDelay) {
            super(millisecondDelay);
        }

        @Override
        public void action() {
            water = true;
        }

        @Override
        public String toString() {
            return "Greenhouse water is on";
        }
    }

    public class WaterOff extends Event {
        public WaterOff(long millisecondDelay) {
            super(millisecondDelay);
        }

        @Override
        public void action() {
            water = false;
        }

        @Override
        public String toString() {
            return "Greenhouse water is off";
        }
    }

    private String thermostat = "Day";

    public class ThermostatNight extends Event {


        public ThermostatNight(long millisecondDelay) {
            super(millisecondDelay);
        }

        @Override
        public void action() {
            thermostat = "Night";
        }

        @Override
        public String toString() {
            return "Thermostat on night setting";
        }
    }

    public class ThermostatDay extends Event {

        public ThermostatDay(long millisecondDelay) {
            super(millisecondDelay);
        }

        @Override
        public void action() {
            thermostat = "Day";
        }

        @Override
        public String toString() {
            return "Thermostat on day setting";
        }
    }

    @Override
    public String toString() {
        return "Thermostat on night setting";
    }

    public class Bell extends Event {
        public Bell(long millisecondDelay) {
            super(millisecondDelay);
        }

        @Override
        public void action() {
            addEvent(new Bell(delayTime.toMillis()));
        }

        @Override
        public String toString() {
            return "Bing!";
        }
    }

    public class Restart extends Event {

        private Event[] eventList;

        public Restart(long millisecondDelay, Event[] eventList) {
            super(millisecondDelay);
            this.eventList = eventList;
            for (Event event : eventList) {
                addEvent(event);
            }
        }

        @Override
        public void action() {
            for (Event event : eventList) {
                // 重新运行每个事件
                event.start();
                addEvent(event);
            }
            // 重新运行该事件
            start();
            addEvent(this);
        }

        @Override
        public String toString() {
            return "Restarting system";
        }
    }

    public static class Terminate extends Event {

        public Terminate(long millisecondDelay) {
            super(millisecondDelay);
        }

        @Override
        public void action() {
            System.exit(0);
        }

        @Override
        public String toString() {
            return "Terminating";
        }
    }




}
