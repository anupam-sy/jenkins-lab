# Jenkins Job Execution
Jenkins jobs can be build with / without parameters. To trigger jenkins job from shell script, you have to create a token, called Crumb for a particular user (which will initiate the build) to avoid CSRF attacks.

## CSRF (Cross-Site Request Forgery)
Cross-Site Request Forgery (CSRF or XSRF) is a type of security vulnerability in web applications. Without protection from CSRF, a Jenkins user or administrator visiting some other web site would allow the operator of that site to perform actions in Jenkins as the victim.

CSRF protection uses a token (called crumb in Jenkins) that is created by Jenkins and sent to the user. Any form submissions or similar action resulting in modifications, like triggering builds or changing configuration, requires that the crumb be provided. The crumb contains information identifying the user it was created for, so submissions with another user’s token would be rejected. All of this happens in the background

## Trigger Jenkins Jobs

### Trigger Job without Parameters

```
crumb=$(curl -u "jenkins-user:jenkins-pwd" -s 'http://jenkins-ip:8080/crumbIssuer/api/xml?xpath=concat(//crumbRequestField,":",//crumb)')
curl -u "jenkins-user:jenkins-pwd" -H "$crumb" -X POST http://jenkins-ip:8080/job/jenkins-job01/build?delay=0sec
```

### Trigger Job with Parameters

```
crumb=$(curl -u "jenkins-user:jenkins-pwd" -s 'http://jenkins-ip:8080/crumbIssuer/api/xml?xpath=concat(//crumbRequestField,":",//crumb)')
curl -u "jenkins-user:jenkins-pwd" -H "$crumb" -X POST  http://jenkins-ip:8080/job/jenkins-job02/buildWithParameters?parameter01=value01&parameter02=value02
```