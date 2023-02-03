// Seed job to create pipeline type job.

pipelineJob("MavenProject-CI") {
    displayName("MavenProject-CI")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url("https://github.com/anupam-sy/MavenProject_02.git")
                        branch("*/master")
                    }
                    extensions {
                        localBranch("master")
                    }
                }
            }
            scriptPath("Jenkinsfile")
        }
    }
}