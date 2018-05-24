package JavaScript

import JavaScript.buildTypes.*
import JavaScript.vcsRoots.*
import JavaScript.vcsRoots.JavaScript_HttpsGithubComLchantJavascriptSettingsGit
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "37831a28-a98b-4664-82a7-ddfe2995cad7"
    id = "JavaScript"
    parentId = "_Root"
    name = "JavaScript"

    vcsRoot(JavaScript_HttpsGithubComLchantJavascriptSettingsGit)
    vcsRoot(JavaScript_HttpsGithubComG0t4teamcityCourseCards)

    buildType(JavaScript_03DeployToStaging)
    buildType(JavaScript_02Chrome)
    buildType(JavaScript_02Firefox)
    buildType(JavaScript_01FastTests)

    template(JavaScript_Template)

    features {
        versionedSettings {
            id = "PROJECT_EXT_2"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = JavaScript_HttpsGithubComLchantJavascriptSettingsGit.id
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
