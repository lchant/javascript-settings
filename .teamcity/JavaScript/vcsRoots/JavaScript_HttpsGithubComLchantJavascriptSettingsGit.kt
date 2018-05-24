package JavaScript.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object JavaScript_HttpsGithubComLchantJavascriptSettingsGit : GitVcsRoot({
    uuid = "0a6af7b3-2fbb-404d-a73b-67e8576bbf7b"
    id = "JavaScript_HttpsGithubComLchantJavascriptSettingsGit"
    name = "https://github.com/lchant/javascript-settings.git"
    url = "https://github.com/lchant/javascript-settings.git"
    authMethod = password {
        userName = "lchant"
        password = "credentialsJSON:60966e24-02ef-4db1-b683-835c95de6993"
    }
})
