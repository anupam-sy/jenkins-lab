job("DSLJob04") {
  description("Job created through DSL")
  parameters {
    stringParam('myParameter', 'myDefaultValue', 'Testing the string parameter.')
  }
  steps {
    batchFile("echo %myParameter%")
	// shell("echo ${myParameter}")
  }
}