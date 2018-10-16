job("DSLJob02") {
  description("Job created through DSL")
  scm {
    git {
      remote {
        url("https://github.com/anupam-sy/MavenProject_01.git")
      }
      // branch("*/master")
    }
  }
}