
pipelineJob('pr-rails-mysql-app') {
  definition {
    cpsScmFlowDefinition {
      scm {
        gitSCM {
          userRemoteConfigs {
            userRemoteConfig {
              credentialsId('github_repo_access')
              name('')
              refspec('+refs/pull/*:refs/remotes/origin/pr/*')
              url('git@github.com:shridharMe/rails-mysql-app.git')
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
