
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
              name('master')
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
            adminlist("shridharMe")
            whitelist ("shridharMe")
            orgslist("")
            cron("H/5 * * * *")
            onlyTriggerPhrase(false)
            useGitHubHooks(false)
            permitAll(false)
            autoCloseFailedPullRequests(false)
             displayBuildErrorsOnDownstreamBuilds(false)
            commentFilePath("")
            skipBuildPhrase("skip this build")
            blackListCommitAuthor("")
            allowMembersOfWhitelistedOrgsAsAdmin(true)
            msgSuccess("build passed")
            msgFailure("build failed")
            commitStatusContext("jenkins")
            gitHubAuthId("github_token")
            buildDescTemplate("")
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
