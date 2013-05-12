class RequiredParametersGrailsPlugin {
    
    def version = "1.0.0-SNAPSHOT"
    def grailsVersion = "2.0 > *"
    def dependsOn = [:]
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    def title = "Grails Required Parameters Plugin"
    def author = "Matthias Wenz"
    def authorEmail = "mat@bowstreet.de"
    def description = '''\
Plugin that enables required parameters for controller actions using simple annotations.
'''

    def documentation = "https://github.com/bowstreet/grails-required-parameters/"
    def license = "APACHE"
    def organization = [ name: "Bowstreet", url: "http://www.bowstreet.de/" ]
    def scm = [ url: "https://github.com/bowstreet/grails-required-parameters/" ]

    def doWithWebDescriptor = { xml ->
    }

    def doWithSpring = {
    }

    def doWithDynamicMethods = { ctx ->
    }

    def doWithApplicationContext = { applicationContext ->
    }

    def onChange = { event ->
    }

    def onConfigChange = { event ->
    }

    def onShutdown = { event ->
    }
}
