package com.tang.chap11.controlframework;

/**
 * @Classname GreenhouseController
 * @Description
 * @Date 2022/8/20 19:40
 * @Author by tangyao
 */
public class GreenhouseController {
    public static void main(String[] args) {
        GreenhouseControls gc = new GreenhouseControls();
        gc.addEvent(gc.new Bell(900));
        Event[] events = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new ThermostatDay(1400)};
        gc.addEvent(gc.new Restart(2000, events));
        gc.addEvent(new GreenhouseControls.Terminate(511000));
        gc.run();


    }
}
