package com.intel.formosa

import com.sun.xml.internal.bind.v2.TODO

class MapperController {

    static allowedMethods = [create:'POST', destory:['DELETE']]

    def index() { }

    def create () {

        def jsonObejct = request.JSON

        //TODO: call mapper

        render "" + jsonObejct[0].id
    }

    def destory () {
        render "delete!"
    }

}
