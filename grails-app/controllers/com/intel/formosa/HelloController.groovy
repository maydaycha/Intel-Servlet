package com.intel.formosa

class HelloController {

    def index() {
        render "Hello: " + grailsApplication.metadata['app.name']
    }
}
