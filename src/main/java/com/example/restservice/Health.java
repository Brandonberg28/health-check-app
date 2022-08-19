/**
* This package holds the Health class variables.
*
* @since 1.0
* @author brandonbergado
* @version 4.2
*/
package com.example.restservice;

public class Health {

   /**
   * This holds the revision number.
   */
   private final String revision;

   /**
   * This holds the health status.
   */
   private final String status;

   /**
   * This holds the number version.
   */
   private final String version;
   
   /**
   * This holds the KIAM Secret.
   */
   private final String secretViaKIAM;


   /**
   * This is the class constructor.
   * @param pRevision
   * @param pStatus
   * @param pVersion
   */
   public Health(final String pRevision, final String pStatus, final String pVersion) {
      this.revision = pRevision;
      this.status = pStatus;
      this.version = pVersion;
      this.secretViaKIAM = SecretAccessManager.getSecret();
      S3AccessManager.getBucketData("bbergadobucket", "HealthStatus.json");
      S3AccessManager.writeToBucket("bbergadobucket","PatientRecord.json");
   }
   /**
    * Getter for the revision variable.
    */
   public String getRevision() {
      return revision;
   }

   /**
    * Getter for the status variable.
    */
   public String getStatus() {
      return status;
   }

   /**
    * Getter for the version variable.
    */
   public String getVersion() {
      return version;
   }

   /**
    * Getter for the secretViaKIAM variable.
    */
   public String getSecret() { 
      return secretViaKIAM; 
   }
}
