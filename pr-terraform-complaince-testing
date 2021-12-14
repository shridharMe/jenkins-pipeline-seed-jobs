
pipelineJob('pr-terraform-complaince-testing') {
  definition {
    cpsScmFlowDefinition {
      scm {
        gitSCM {
          userRemoteConfigs {
            userRemoteConfig {
              credentialsId('github_repo_access')
              name('origin')
              refspec('+refs/pull/*:refs/remotes/origin/pr/*')
              url('git@github.com:shridharMe/terraform-compliance-test.git')
            }
          }
         branches {
            branchSpec {
              name('master')
            }
          }
          browser {
            gitWeb {
              repoUrl('https://github.com/shridharMe/terraform-compliance-test')
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
    githubProjectUrl("https://github.com/shridharMe/terraform-compliance-test/")
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
