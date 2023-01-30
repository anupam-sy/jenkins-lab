job("DSLJob01") {
  description("Job created through DSL")
    steps {
      batchFile("echo Hello World!")
    }
}