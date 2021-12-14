
pipelineJob('build-jenkins-pipeline-with-library') {
  definition {
    cpsScmFlowDefinition {
      scm {
        gitSCM {
          userRemoteConfigs {
            userRemoteConfig {
              credentialsId('github_repo_access')
              name('')
              refspec('')
              url('git@github.com:shridharMe/jenkins-pipeline-with-library.git')
            }
          }
          branches {
            branchSpec {
              name('*/master')
            }
          }
          browser {
            gitWeb {
              repoUrl('')
            }
          }
          gitTool('')
          doGenerateSubmoduleConfigurations(false)
        }
      }
      scriptPath('Jenkinsfile')
      lightweight(true)
    }
  }
}
