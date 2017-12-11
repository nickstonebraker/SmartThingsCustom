preferences {
    input("destIp", "text", title: "IP", description: "The device IP")
    input("destPort", "number", title: "Port", description: "The port you wish to connect", defaultValue: 80)
}
 

metadata {
    definition (name: "Watch Bravo Channel", namespace: "nickstonebraker", 
        author: "nstonebraker") {
                capability "Actuator"
                capability "Momentary"
                command "makeNetworkId", ["string","string"]
        }

    simulator {
        // TODO-: define status and reply messages here
    }
    tiles {
        standardTile("switch", "device.switch", width: 2, height: 2, canChangeIcon: true) {
            state "on", label: 'Push', action: "momentary.push", backgroundColor: "#53a7c0"
            state "off", label: 'Push', action: "momentary.push",  backgroundColor: "#ffffff", nextState: "on"
        }
        main "switch"
        details "switch"
    }
}



def parse(String description) {
    log.debug "Parsing '${description}'"
}


def push() {
    sendEvent(name: "switch", value: 'on')
    request('/watch/bravo')
}

def off() { 
    sendEvent(name: "switch", value: 'off')
}


def request(url) { 

    //def hosthex = convertIPtoHex(destIp)
    //def porthex = convertPortToHex(destPort)
    // device.deviceNetworkId = "$hosthex:$porthex" 

    // def hubAction = new physicalgraph.device.HubAction(
    //         'method': 'GET',
    //         'path': url,
    //         'headers': [ HOST: "C0A8C846:0050" ]
    //     ) 
              
    // hubAction

//  C0A8C8B5:0050

    def params = [
        uri: "http://192.168.200.181",
        path: url
    ]

    httpGet(params) { resp ->
        resp.headers.each {
           log.debug "${it.name} : ${it.value}"
        }
        log.debug "response contentType: ${resp.contentType}"
        log.debug "response data: ${resp.data}"
    }

}

//'headers': [ HOST: "$destIp:$destPort" ]


private String convertIPtoHex(ipAddress) { 
    String hex = ipAddress.tokenize( '.' ).collect {  String.format( '%02X', it.toInteger() ) }.join()
    return hex
}

private String convertPortToHex(port) {
    String hexport = port.toString().format( '%04X', port.toInteger() )
    return hexport
}

def makeNetworkId(ipaddr, port) { 
	String hexIp = ipaddr.tokenize('.').collect {String.format('%02X', it.toInteger()) }.join() 
	String hexPort = String.format('%04X', port.toInteger()) 
	log.debug "The target device is configured as: ${hexIp}:${hexPort}" 
	return "${hexIp}:${hexPort}" 
}