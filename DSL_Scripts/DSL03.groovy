job("DSLJob03") {
  description("Job created through DSL")
  scm {
    git{
      remote {
        url("https://github.com/anupam-sy/MavenProject_01.git")
      }
      // branch("*/master")
    }
  }
  steps {
    maven { 
      goals('clean')
      goals('compile')
      mavenInstallation('apache-maven-3.5.2')
    }
  }
}