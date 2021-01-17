package ch.nicholas.spring_boot_react_ts_webpack.controller;

import ch.nicholas.spring_boot_react_ts_webpack.model.RequestCountDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

@RestController()
@RequestMapping("/api")
public class ApiController {

  private final AtomicInteger counter = new AtomicInteger(0);
  
  @GetMapping(value = "/count", produces = "application/json")
  public RequestCountDTO getBook() {
    return new RequestCountDTO(this.counter.incrementAndGet(), new Date());
  }

}
