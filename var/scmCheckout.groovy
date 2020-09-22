def call (Map stageParams) {
   checkout([
	$class: 'GitSCM'
	branches: [[name: stageParams.branch]]
	doGenerateSubModuleConfigurations: false
	userRemoteConfigs: [[
		url: stageParams.url
		credentialsId: stageParams.credentials
	]]
}
	
