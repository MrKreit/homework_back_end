package app.config;

import app.car.Auto;
import app.car.Driver;
import app.car.Engine;
import app.car.Radio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
@Bean
  public Driver driver() {
  return new Driver();
}
@Bean
  public Engine engine() {
  return new Engine();
}
@Bean
  public Radio radio() {
  return new Radio();
}
@Bean
  public Auto auto() {
  return new Auto();
}
}
