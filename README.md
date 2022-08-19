# health-check-app
Spring Boot application created with Coupa Software during my Cloud Operations Engineering Internship.

During the internship I learned how to utilize Docker, Kubernetes, AWS ECR/KIAM/S3 Buckets, and their in-house Coupa Application Lifecycle Management platform that automated and streamlined the entire CI/CD pipeline. 

The app features code that adds functionality with:
- displaying an objects attributes to the browser as JSON
- AWS KIAM code that gives pods short-lived credentials to access AWS resources
- being able to read & write to AWS S3 Buckets through those AWS credentials
- implementing Coupa's CALM platform that automates the entire CI/CD process
