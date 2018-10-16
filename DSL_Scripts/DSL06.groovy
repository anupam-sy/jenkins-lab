job("DSLJob01") {
  description("My first job through DSL")
  steps {
    shell('echo hello')
    }
  publishers {
    extendedEmail {
      recipientList('abc@gmail.com')
      defaultSubject('$DEFAULT_SUBJECT')
      defaultContent('$DEFAULT_CONTENT')
      contentType('text/html')
      triggers {
        beforeBuild()
        stillUnstable {
          subject('Subject')
          content('Body')
          sendTo {
            developers()
            requester()
            culprits()
          }
        }
      }
    }
  }
}