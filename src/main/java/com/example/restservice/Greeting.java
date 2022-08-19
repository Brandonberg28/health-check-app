/**
* This package holds the Greeting variables.
*
* @since 1.0
* @author brandonbergado
* @version 4.2
*/
package com.example.restservice;

public class Greeting {

   /**
   * This holds the id of the user.
   */
   private final long id;

   /**
   * This holds the message content.
   */
   private final String content;

   /**
   * This is the class constructor.
   * @param pId
   * @param pContent
   */
   public Greeting(final long pId, final String pContent) {
      this.id = pId;
      this.content = pContent;
   }
}
