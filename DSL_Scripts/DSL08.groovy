mavenJob("MVNJOB-CodeQuality") {
  description("Code Quality job through DSL")
  parameters {
    gitParam('Minor_Tag') {
      type('TAG')
      tagFilter("Minor*")
  	}
  }
  logRotator {
    numToKeep(5)
    daysToKeep(5)
    artifactNumToKeep(1)
    artifactDaysToKeep(1)
  }
  scm {
    git {
      remote {
        url("https://github.com/anupam-sy/MavenProject_01.git")
      }
      branch('${Minor_Tag}')
    }
  }
  mavenInstallation('default') // Select which installation of Maven to uses
  rootPOM('pom.xml')
  goals('pmd:pmd checkstyle:checkstyle -DskipTests')
  publishers {
    checkstyle('**/target/checkstyle-result.xml') // Publish the checkstyle report
  }
}