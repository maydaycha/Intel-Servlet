class UrlMappings {

	static mappings = {


        "/Mappers"(resources: "Mappers")
        "/RuleEngines"(resources: "RuleEngines")



        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
        "/"(view:"/index")
        "500"(view:'/error')
	}
}
