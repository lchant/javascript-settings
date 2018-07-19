package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

object JavaScript_03DeployToStaging : BuildType({
    uuid = "1627edf8-2bb9-4bc2-b84f-fed5c9e777d7"
    id = "JavaScript_03DeployToStaging"
    name = "03. Deploy To Staging"

    vcs {
        root(JavaScript.vcsRoots.JavaScript_HttpsGithubComG0t4teamcityCourseCards)

    }

    steps {
        script {
            name = "IIS Deploy"
            id = "RUNNER_6"
            scriptContent = """
            rmdir /S /Q \inetpub\wwwroot
            xcopy /S /I /Y app \inetpub\wwwroot\
            """
        }
    }

    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_02Chrome) {
            snapshot {
            }
        }
        dependency(JavaScript.buildTypes.JavaScript_02Firefox) {
            snapshot {
            }
        }
    }

    triggers {
        vcs {
            id = "vcsTrigger"
            branchFilter = ""
        }
    }
})
