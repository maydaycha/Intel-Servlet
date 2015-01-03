package com.intel.formosa

import com.intel.core.Mapper
import grails.converters.JSON

class MappersController {

    def index() { }

    def create () {

        def jsonObject = request.JSON

        //TODO: call mapper

        render jsonObject as JSON
    }


    def save () {
        def jsonObject = request.JSON

        //TODO: call mapper

//        Mapper mapper = new Mapper();
//        jsonObject = mapper.run();

        render jsonObject as JSON
    }

    def delete () {
        render params as JSON
    }
}

