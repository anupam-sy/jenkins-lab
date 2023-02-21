# Java Programming Language
Java is one of the most popular programming languages for application development. Java is originally developed by Sun Microsystems, but acquired by Oracle.

There are four Java platforms available:
- Java Standard Edition (Java SE)
- Java Micro Editions (Java ME)
- Java Enterprise Edition (Java EE)
- JavaFX

## JDK vs JRE
Java Development Kit (JDK) is for developing and programming with Java.
Java Runtime Environment (JRE) is for running Java-based applications.

**Note:**
- Oracle strongly recommends using the term JDK to refer to the Java SE (Standard Edition) Development Kit.
- When you install Java JDK, JRE is also packed in the installation and there is no need to seperately install JRE.

## Open Source (Open JDK/JRE) vs Closed Source (Oracle JDK/JRE)
The biggest difference between OpenJDK and Oracle JDK is licensing. OpenJDK is completely open source Java with a GNU General Public License. Oracle JDK is closed source and requires a commercial license under Oracle Binary Code License Agreement. There are many other differences within support and cost, too.

## Installation
1. To install the latest version of Open JDK on Ubuntu OS, use the below commands - 
```
    sudo apt update
    sudo apt install -y default-jdk
    java –version # Verify the version of java installed with this command
```

2. To install the latest version of Open JRE on Ubuntu OS, use the below commands - 
```
    sudo apt update
    sudo apt install -y default-jre
    java –version # Verify the version of java installed with this command
```

3. To install the specific version of Open JDK (say - Open JDK 8) on Ubuntu OS, use the below commands - 
```
    sudo apt update
    sudo apt install openjdk-8-jdk
    java –version # Verify the version of java installed with this command
```

4. To install the specific version of Open JRE (say - Open JRE 11) on Ubuntu OS, use the below commands - 
```
    sudo apt update
    sudo apt install -y openjdk-11-jre
    java –version # Verify the version of java installed with this command
```

## Environment Variable
Configuring JAVA_HOME isn’t absolutely required, but many enterprise Java applications such as Tomcat or Kafka query the JAVA_HOME directory when they startup and use that information at runtime, so it’s prudent to configure it.
The JAVA_HOME environment variable determines the location of your Java installation. The variable helps other applications access Java’s installation path easily.

You can have multiple Java installations on one server. You can configure which version is the default for use on the command line by using the update-alternatives command. Copy the path from the output and open `/etc/environment` file and add below line in end of this file. Make sure to not include the bin/ portion of the path.

```
    JAVA_HOME="/usr/lib/jvm/java-11-openjdk-amd64"
    source /etc/environment # To reload this file to apply the changes to your current session
```

**Note:** Update the respective files to set the environment variable, globally (/etc/environment, /etc/profile) or user-specific (~/.profile, ~/.bashrc).

## References
- https://www.digitalocean.com/community/tutorials/how-to-install-java-with-apt-on-ubuntu-22-04