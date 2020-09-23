
def call(Map stgParam) {
  checkout([
    $class: 'GitSCM',
    branches: [[ name: stgParam.branch ]],
    doGenerateSubmoduleConfigurations: false,
    extensions: [],
    submoduleCfg: [],
    userRemoteConfigs: [
      credentialsId: stgParam.credentials,
      url: 'https://github.com/ramarao05/poc-avx.git'
    ]
  ])
}
