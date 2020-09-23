
def call () {
  checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'ramarao05', url: 'https://github.com/ramarao05/poc-avx.git']]])
}
