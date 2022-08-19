/**
 * This package is the Greeting Controller.
 *
 * @since 1.0
 * @author brandonbergado
 * @version 4.2
 */
package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

   /**
   * This holds the greeting message template.
   */
   private static final String template = "Hello %s";

   /**
   * This holds the counter variable.
   */
   private final AtomicLong counter = new AtomicLong();

   /**
   * This is the GreetingController class constructor.
   * @param name
   * @return greetingObject
   */
   @GetMapping("/greeting")
   public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
      return new Greeting(counter.incrementAndGet(), String.format(template, name));
   }
}
