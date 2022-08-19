/**
 * This package is the Health Controller.
 *
 * @since 1.0
 * @author brandonbergado
 * @version 4.2
 */
package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

   /**
   * This is the HealthController class constructor.
   * @return healthObject
   */
   @GetMapping("/health")
   public Health health() {
      return new Health("92c6748", "OK ALRIGHT", "1.0.4");
   }
}
