# health-check-app
Spring Boot application created with Coupa Software during my Cloud Operations Engineering Internship.

During the internship I learned how to utilize Docker, Kubernetes, AWS ECR/KIAM/S3 Buckets, and their in-house Coupa Application Lifecycle Management platform that automated and streamlined the entire CI/CD pipeline. 

The app features code that adds functionality with:
- displaying an objects attributes to the browser as JSON
- AWS KIAM code that gives pods short-lived credentials to access AWS resources
- being able to read & write to AWS S3 Buckets through those AWS credentials
- implementing Coupa's CALM platform that automates the entire CI/CD process

# Error: [PLEASE FIX] 
- Sending build context to Docker daemon 182.8 kB
- Step 1/10 : FROM maven:3.8.6-jdk-11 as builder
  - Error parsing reference: "maven:3.8.6-jdk-11 as builder" is not a valid repository/tag: invalid reference format

