package app.car;

import org.springframework.beans.factory.annotation.Autowired;

public class Driver {
@Autowired
private Auto auto;
@Autowired
private Engine engine;
@Autowired
private Radio radio;

public void setAuto(Auto auto) {
  this.auto = auto;
}

public void setEngine(Engine engine) {
  this.engine = engine;
}

public void setRadio(Radio radio) {
  this.radio = radio;
}

public void pressStartButton() {
  engine.work();
  radio.play();
  auto.go();
}
}
