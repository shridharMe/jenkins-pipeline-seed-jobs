
pipelineJob('pr-jenkins-pipeline-with-library') {
  definition {
    cpsScmFlowDefinition {
      scm {
        gitSCM {
          userRemoteConfigs {
            userRemoteConfig {
              credentialsId('guthub_repo_access')
              name('')
              refspec('+refs/pull/*:refs/remotes/origin/pr/*')
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
  properties {
    pipelineTriggers {
      triggers {
        ghprbTrigger {
            adminlist()
            orgslist()
            cron()
            onlyTriggerPhrase(true)
            useGitHubHooks(true)
            permitAll(false)
            autoCloseFailedPullRequests(false)
            allowMembersOfWhitelistedOrgsAsAdmin(true)
            msgSuccess("build passed")
            msgFailure("build failed")
            commitStatusContext("jenkins")
            gitHubAuthId("github_token")
            buildDescTemplate("Jenkins job")
            blackListLabels("")
            whiteListLabels("")
            includedRegions("")
            excludedRegions("")
            triggerPhrase('restest this please')
            

            extensions {
               ghprbCancelBuildsOnUpdate {
                overrideGlobal(true)
                }
            }
        }
      }
    }
  }
}
