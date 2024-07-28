package app;

import app.car.Auto;
import app.car.Driver;
import app.car.Engine;
import app.car.Radio;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

  public static void main(String[] args) {

    //bez Spring

//    Auto auto = new Auto();
//    Engine engine = new Engine();
//    Radio radio = new Radio();
//
//    Driver driver = new Driver();
//    driver.setEngine(engine);
//    driver.setRadio(radio);
//    driver.setAuto(auto);
//
//    driver.pressStartButton();

    AbstractApplicationContext context = new AnnotationConfigApplicationContext("app.config");
    Driver driver = context.getBean(Driver.class);
    driver.pressStartButton();
  }

}
