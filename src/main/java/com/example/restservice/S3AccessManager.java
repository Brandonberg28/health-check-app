/**
 * This package is the S3 Bucket Object Downloader.
 *
 * @since 1.0
 * @author brandonbergado
 * @version 4.2
 */
package com.example.restservice;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class S3AccessManager {

    /**
     * This method is an AmazonS3 client that downloads an object from S3 and saves its contents to a file.
     * (using the same name as the object's key)
     */
    public static void getBucketData(String bucketName, String keyName) {

        String bucket_name = bucketName; //name of bucket we are accessing in AWS S3
        String key_name = keyName;       //name of bucket object we want to grab data from
        final AmazonS3 s3 = AmazonS3ClientBuilder.standard().withRegion("us-east-1").build();

        try
        {
            S3Object o = s3.getObject(bucket_name, key_name);
            S3ObjectInputStream s3is = o.getObjectContent();  //retrieves the content of an object
            FileOutputStream fos = new FileOutputStream(new File(key_name)); 
            byte[] read_buf = new byte[1024]; //Array buffer of 1024 bytes
            int read_len = 0;

            while ((read_len = s3is.read(read_buf)) > 0) //while we are still reading in data, keep looping
            {
                fos.write(read_buf, 0, read_len); 
            }
            s3is.close();
            fos.close();
        }
        catch (AmazonServiceException e) {
            System.err.println(e.getErrorMessage());
            System.exit(1);
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        } catch (IOException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }

    }


    /**
     * This method uploads an object to an S3 bucket.
     * (must supply a bucket name, key name, & file to upload)
     */
    public static void writeToBucket(String bucketName, String keyName) {

        String bucket_name = bucketName;   //name of bucket we are accessing in AWS S3
        String key_name = keyName;  //this is what the file is named when created in bbergadobucket
        String file_path = "./src/main/java/com/example/restservice/PatientRecord.json"; //path of file we want to upload, starting from the main directory

        final AmazonS3 s3 = AmazonS3ClientBuilder.standard().withRegion("us-east-1").build();
        try {
            s3.putObject(bucket_name, key_name, new File(file_path));
        } catch (AmazonServiceException e) {
            System.err.println(e.getErrorMessage());
            System.exit(1);
        }
    }
}
