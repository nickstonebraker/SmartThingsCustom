/**
 *  Copyright 2015 SmartThings
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 */

//C0A8C846:1386

metadata {
	definition (name: "iTach", namespace: "nickstonebraker", author: "NickStonebraker") {
	capability "Switch"
	capability "Music Player"
	command "avrOn"
	command "avrOff"
	command "avrVolUp"
	command "avrVolDown"
	command "avrVolPresetLoud"
	command "avrVolPresetQuiet"
	command "avrInputFioptics"
	command "avrInputRoku"
	command "avrInputPC"
	command "avrInputBluetooth"
	command "avrInputTVOut"
	command "avrInputPandora"
	command "avrInputNetRadio"
	command "audioAuto"
	command "audioStereo"
	command "audioMatrix"
	command "audioVirtual"
	command "audioDtsNeo6Music"
	command "audioDtsNeo6Cinema"
	command "audioPLIIMusic"
	command "audioPLIICinema"
	command "tvOn"
	command "tvOff"
	command "dvrPowerToggle"
	command "bravo"
	command "mtv"
	command "syfy"
	command "showtime"
	command "nick"
	command "tnt"
	command "usa"
	command "natgeo"
	command "cartoon"
	command "disney"
	command "tlc"
	command "vh1"
	command "e"
	command "lifetime"
	command "disneyjr"
	command "tbs"
	command "fx"
	command "ae"
	command "discovery"
	command "history"
	command "tmc"
	command "dvrPause"
	command "dvrPlay"
	command "dvrRecord"
	command "makeNetworkId", ["string","string"]
}

simulator {
		// TODO: define status and reply messages here
}

tiles {
	standardTile("switch", "device.switch", width: 1, height: 1, canChangeIcon: true) {
        	state "on", label: '${name}', action: "switch.off", icon: "st.switches.switch.on", backgroundColor: "#79b821"
        	state "off", label: '${name}', action: "switch.on", icon: "st.switches.switch.off", backgroundColor: "#ffffff"
   	}

    	standardTile("avrOn", "device.switch", decoration: "flat") {
    		state "avrOn", label:"AVR On", action:"avrOn", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("avrOff", "device.switch", decoration: "flat") {
    		state "avrOff", label:"AVR Off", action:"avrOff", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("avrVolUp", "device.switch", decoration: "flat") {
    		state "avrVolUp", label:"Vol Up", action:"avrVolUp", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("avrVolDown", "device.switch", decoration: "flat") {
    		state "avrVolDown", label:"Vol Down", action:"avrVolDown", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("avrVolPresetLoud", "device.switch", decoration: "flat") {
    		state "avrVolPresetLoud", label:"Vol Preset Loud", action:"avrVolPresetLoud", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("avrVolPresetQuiet", "device.switch", decoration: "flat") {
    		state "avrVolPresetQuiet", label:"Vol Preset Quiet", action:"avrVolPresetQuiet", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("avrInputFioptics", "device.switch", decoration: "flat") {
    		state "avrInputFioptics", label:"Input Fioptics", action:"avrInputFioptics", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("avrInputRoku", "device.switch", decoration: "flat") {
    		state "avrInputRoku", label:"Input Roku", action:"avrInputRoku", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("avrInputPC", "device.switch", decoration: "flat") {
    		state "avrInputPC", label:"Input PC", action:"avrInputPC", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("avrInputBluetooth", "device.switch", decoration: "flat") {
    		state "avrInputBluetooth", label:"Input Bluetooth", action:"avrInputBluetooth", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("avrInputTVOut", "device.switch", decoration: "flat") {
    		state "avrInputTVOut", label:"Input TV Out", action:"avrInputTVOut", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("avrInputPandora", "device.switch", decoration: "flat") {
    		state "avrInputPandora", label:"Input Pandora", action:"avrInputPandora", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("avrInputNetRadio", "device.switch", decoration: "flat") {
    		state "avrInputNetRadio", label:"Input NetRadio", action:"avrInputNetRadio", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("audioAuto", "device.switch", decoration: "flat") {
    		state "audioAuto", label:"Audio Auto", action:"audioAuto", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("audioStereo", "device.switch", decoration: "flat") {
    		state "audioStereo", label:"Audio Stereo", action:"audioStereo", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("audioMatrix", "device.switch", decoration: "flat") {
    		state "audioMatrix", label:"Audio Matrix", action:"audioMatrix", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("audioVirtual", "device.switch", decoration: "flat") {
    		state "audioVirtual", label:"Audio Virtual", action:"audioVirtual", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("audioDtsNeo6Music", "device.switch", decoration: "flat") {
    		state "audioDtsNeo6Music", label:"DtsNeo6Music", action:"audioDtsNeo6Music", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("audioDtsNeo6Cinema", "device.switch", decoration: "flat") {
    		state "audioDtsNeo6Cinema", label:"DtsNeo6Cinema", action:"audioDtsNeo6Cinema", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("audioPLIIMusic", "device.switch", decoration: "flat") {
    		state "audioPLIIMusic", label:"PLII Music", action:"audioPLIIMusic", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("audioPLIICinema", "device.switch", decoration: "flat") {
    		state "audioPLIICinema", label:"PLII Cinema", action:"audioPLIICinema", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("tvOn", "device.switch", decoration: "flat") {
    		state "tvOn", label:"TV On", action:"tvOn", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("tvOff", "device.switch", decoration: "flat") {
    		state "tvOff", label:"TV Off", action:"tvOff", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("dvrPowerToggle", "device.switch", decoration: "flat") {
    		state "dvrPowerToggle", label:"DVR Power Toggle", action:"dvrPowerToggle", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("bravo", "device.switch", decoration: "flat") {
    		state "bravo", label:"Bravo", action:"bravo", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("mtv", "device.switch", decoration: "flat") {
    		state "mtv", label:"Mtv", action:"mtv", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("syfy", "device.switch", decoration: "flat") {
    		state "syfy", label:"Syfy", action:"syfy", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("showtime", "device.switch", decoration: "flat") {
    		state "showtime", label:"Showtime", action:"showtime", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("nick", "device.switch", decoration: "flat") {
    		state "nick", label:"Nickelodeon", action:"nick", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("tnt", "device.switch", decoration: "flat") {
    		state "tnt", label:"Tnt", action:"tnt", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("usa", "device.switch", decoration: "flat") {
    		state "usa", label:"Usa", action:"usa", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("natgeo", "device.switch", decoration: "flat") {
    		state "natgeo", label:"NatGeo", action:"natgeo", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("cartoon", "device.switch", decoration: "flat") {
    		state "cartoon", label:"Cartoon", action:"cartoon", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("disney", "device.switch", decoration: "flat") {
    		state "disney", label:"Disney", action:"disney", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("tlc", "device.switch", decoration: "flat") {
    		state "tlc", label:"TLC", action:"tlc", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("vh1", "device.switch", decoration: "flat") {
    		state "vh1", label:"VH1", action:"vh1", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("e", "device.switch", decoration: "flat") {
    		state "e", label:"E!", action:"e", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("lifetime", "device.switch", decoration: "flat") {
    		state "lifetime", label:"Lifetime", action:"lifetime", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("disneyjr", "device.switch", decoration: "flat") {
    		state "disneyjr", label:"Disneyjr", action:"disneyjr", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("tbs", "device.switch", decoration: "flat") {
    		state "tbs", label:"Tbs", action:"tbs", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("fx", "device.switch", decoration: "flat") {
    		state "fx", label:"FX", action:"fx", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("ae", "device.switch", decoration: "flat") {
    		state "ae", label:"AE", action:"ae", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("discovery", "device.switch", decoration: "flat") {
    		state "discovery", label:"Discovery", action:"discovery", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("history", "device.switch", decoration: "flat") {
    		state "history", label:"History", action:"history", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("tmc", "device.switch", decoration: "flat") {
    		state "tmc", label:"TMC", action:"tmc", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("dvrPause", "device.switch", decoration: "flat") {
    		state "dvrPause", label:"DVR Pause", action:"dvrPause", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("dvrPlay", "device.switch", decoration: "flat") {
    		state "dvrPlay", label:"DVR Play", action:"dvrPlay", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }

    	standardTile("dvrRecord", "device.switch", decoration: "flat") {
    		state "dvrRecord", label:"DVR Record", action:"dvrRecord", icon:"st.Electronics.electronics15", backgroundColor:"#ffffff"
    }
    }
    main "switch"
    details(["switch","avrOn","avrOff","avrVolUp","avrVolDown","avrVolPresetLoud","avrVolPresetQuiet","avrInputFioptics","avrInputRoku","avrInputPC","avrInputBluetooth","avrInputTVOut","avrInputPandora","avrInputNetRadio","audioAuto","audioStereo","audioMatrix","audioVirtual","audioDtsNeo6Music","audioDtsNeo6Cinema","audioPLIIMusic","audioPLIICinema","tvOn","tvOff","dvrPowerToggle","bravo","mtv","syfy","showtime","nick","tnt","usa","natgeo","cartoon","disney","tlc","vh1","e","lifetime","disneyjr","tbs","fx","ae","discovery","history","tmc","dvrPause","dvrPlay","dvrRecord"])
}

// parse events into attributes
def parse(description) {
    def msg = parseLanMessage(description)
    def headersAsString = msg.header // => headers as a string
    def headerMap = msg.headers      // => headers as a Map
    def body = msg.body              // => request body as a string
    def status = msg.status          // => http status code of the response
    def json = msg.json              // => any JSON included in response body, as a data structure of lists and maps
    def xml = msg.xml                // => any XML included in response body, as a document tree structure
    def data = msg.data              // => either JSON or XML in response body (whichever is specified by content-type header in response)
}
//device.deviceNetworkId should be writeable now..., and its not...
def makeNetworkId(ipaddr, port) { 
	String hexIp = ipaddr.tokenize('.').collect {String.format('%02X', it.toInteger()) }.join() 
	String hexPort = String.format('%04X', port.toInteger()) 
	log.debug "The target device is configured as: ${hexIp}:${hexPort}" 
	return "${hexIp}:${hexPort}" 
}
def updated() {
	//device.deviceNetworkId = makeNetworkId(settings.deviceIP,settings.devicePort)	
}


def on() {
	log.debug "Powering on everything"
	sendEvent(name: "switch", value: "on")
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,1,1,10,30,10,70,10,30,10,30,10,30,10,70,10,30,10,30,10,70,10,70,10,70,10,70,10,30,10,30,10,30,10,1657,10,30,10,70,10,30,10,30,10,30,10,30,10,70,10,70,10,30,10,30,10,30,10,30,10,70,10,70,10,70,10,1657\r",physicalgraph.device.Protocol.LAN)
	return ha
}

def off() {
	log.debug "Powering off everything"
	sendEvent(name: "switch", value: "off")
	//def msg = getEiscpMessage("PWR00")
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,1,1,10,30,10,70,10,30,10,30,10,30,10,30,10,70,10,30,10,70,10,70,10,70,10,70,10,30,10,30,10,30,10,1657,10,30,10,70,10,30,10,30,10,30,10,70,10,30,10,70,10,30,10,30,10,30,10,30,10,70,10,70,10,70,10,1657\r",physicalgraph.device.Protocol.LAN)
	return ha
}
def avrOn() {
	log.debug "AVR on"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,1,1,10,30,10,70,10,30,10,30,10,30,10,70,10,30,10,30,10,70,10,70,10,70,10,70,10,30,10,30,10,30,10,1657,10,30,10,70,10,30,10,30,10,30,10,30,10,70,10,70,10,30,10,30,10,30,10,30,10,70,10,70,10,70,10,1657\r",physicalgraph.device.Protocol.LAN)
	return ha
}
def avrOff() {
	log.debug "AVR off"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,1,1,10,30,10,70,10,30,10,30,10,30,10,30,10,70,10,30,10,70,10,70,10,70,10,70,10,30,10,30,10,30,10,1657,10,30,10,70,10,30,10,30,10,30,10,70,10,30,10,70,10,30,10,30,10,30,10,30,10,70,10,70,10,70,10,1657\r",physicalgraph.device.Protocol.LAN)
	return ha
}
def avrVolUp() {
	log.debug "AVR vol up"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,3,1,10,30,10,70,10,30,10,30,10,30,10,70,10,30,10,30,10,30,10,70,10,70,10,70,10,70,10,30,10,30,10,1657,10,30,10,70,10,30,10,30,10,30,10,30,10,70,10,70,10,70,10,30,10,30,10,30,10,30,10,70,10,70,10,1657\r",physicalgraph.device.Protocol.LAN)
	return ha
}
def avrVolDown() {
	log.debug "AVR vol down"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,3,1,10,30,10,70,10,30,10,30,10,30,10,30,10,70,10,30,10,30,10,70,10,70,10,70,10,70,10,30,10,30,10,1657,10,30,10,70,10,30,10,30,10,30,10,70,10,30,10,70,10,70,10,30,10,30,10,30,10,30,10,70,10,70,10,1657\r",physicalgraph.device.Protocol.LAN)
	return ha
}
def avrVolPresetLoud() {
	log.debug "AVR vol loud"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,1,1,10,30,10,30,10,70,10,70,10,30,10,70,10,30,10,70,10,30,10,30,10,30,10,30,10,70,10,30,10,30,10,1657,10,30,10,30,10,70,10,70,10,30,10,30,10,70,10,30,10,70,10,70,10,70,10,70,10,30,10,70,10,70,10,1657\r",physicalgraph.device.Protocol.LAN)
	return ha
}
def avrVolPresetQuiet() {
	log.debug "AVR vol quiet"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,1,1,10,30,10,30,10,70,10,70,10,30,10,30,10,70,10,70,10,30,10,30,10,30,10,30,10,70,10,30,10,30,10,1657,10,30,10,30,10,70,10,70,10,30,10,70,10,30,10,30,10,70,10,70,10,70,10,70,10,30,10,70,10,70,10,1657\r",physicalgraph.device.Protocol.LAN)
	return ha
}
def avrInputFioptics() {
	log.debug "AVR input TV"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,1,1,10,30,10,70,10,30,10,30,10,30,10,30,10,30,10,30,10,70,10,30,10,30,10,70,10,70,10,30,10,30,10,1657,10,30,10,70,10,30,10,30,10,30,10,70,10,70,10,70,10,30,10,70,10,70,10,30,10,30,10,70,10,70,10,1657\r",physicalgraph.device.Protocol.LAN)
	return ha
}
def avrInputRoku() {
	log.debug "AVR input Roku"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,1,1,10,30,10,70,10,30,10,30,10,30,10,70,10,70,10,30,10,30,10,30,10,70,10,70,10,70,10,30,10,30,10,1657,10,30,10,70,10,30,10,30,10,30,10,30,10,30,10,70,10,70,10,70,10,30,10,30,10,30,10,70,10,70,10,1657\r",physicalgraph.device.Protocol.LAN)
	return ha
}
def avrInputPC() {
	log.debug "AVR input PC"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,37000,1,1,128,64,16,16,16,16,16,48,16,16,16,48,16,16,16,48,16,16,16,16,16,48,16,16,16,16,16,48,16,48,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,48,16,16,16,48,16,16,16,16,16,16,16,48,16,48,16,48,16,48,16,48,16,16,16,48,16,48,16,16,16,48,16,16,16,16,16,16,16,16,16,48,16,48,16,48,16,16,16,16,16,48,16,2766\r",physicalgraph.device.Protocol.LAN)
	return ha
}
def avrInputBluetooth() {
	log.debug "AVR input bluetooth"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,37000,1,1,128,64,16,16,16,16,16,48,16,16,16,48,16,16,16,48,16,16,16,16,16,48,16,16,16,16,16,48,16,48,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,48,16,16,16,48,16,16,16,16,16,16,16,48,16,48,16,48,16,48,16,16,16,48,16,48,16,48,16,16,16,48,16,16,16,16,16,48,16,48,16,48,16,48,16,48,16,16,16,16,16,48,16,2765\r",physicalgraph.device.Protocol.LAN)
	return ha
}
def avrInputTVOut() {
	log.debug "AVR input TV out"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,1,1,10,30,10,70,10,30,10,30,10,30,10,70,10,30,10,30,10,70,10,30,10,30,10,70,10,70,10,30,10,30,10,1657,10,30,10,70,10,30,10,30,10,30,10,30,10,70,10,70,10,30,10,70,10,70,10,30,10,30,10,70,10,70,10,1657\r",physicalgraph.device.Protocol.LAN)
	return ha
}
def avrInputPandora() {
	log.debug "AVR input Pandora"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,37000,1,1,128,64,16,16,16,16,16,48,16,16,16,48,16,16,16,48,16,16,16,16,16,48,16,16,16,16,16,48,16,48,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,48,16,16,16,48,16,16,16,16,16,16,16,48,16,16,16,48,16,48,16,48,16,48,16,48,16,48,16,16,16,48,16,16,16,16,16,16,16,48,16,48,16,48,16,48,16,48,16,16,16,48,16,2766\r",physicalgraph.device.Protocol.LAN)
	return ha
}
def avrInputNetRadio() {
	log.debug "AVR input Internet Radio"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,37000,1,1,128,64,16,16,16,16,16,48,16,16,16,48,16,16,16,48,16,16,16,16,16,48,16,16,16,16,16,48,16,48,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,48,16,16,16,48,16,16,16,16,16,16,16,16,16,16,16,48,16,48,16,16,16,16,16,48,16,48,16,16,16,48,16,16,16,16,16,48,16,16,16,48,16,48,16,16,16,48,16,16,16,48,16,2766\r",physicalgraph.device.Protocol.LAN)
	return ha
}
def audioAuto() { 
	log.debug "Enabling Audio auto"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,1,1,10,30,10,30,10,70,10,30,10,30,10,70,10,70,10,30,10,30,10,70,10,70,10,30,10,70,10,30,10,30,10,1657,10,30,10,30,10,70,10,30,10,30,10,30,10,30,10,70,10,70,10,30,10,30,10,70,10,30,10,70,10,70,10,1657\r",physicalgraph.device.Protocol.LAN)
	return ha
}
def audioStereo() { 
	log.debug "Enabling Audio: Stereo"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,1,1,10,30,10,30,10,70,10,70,10,30,10,70,10,30,10,70,10,70,10,70,10,30,10,30,10,70,10,30,10,30,10,1657,10,30,10,30,10,70,10,70,10,30,10,30,10,70,10,30,10,30,10,30,10,70,10,70,10,30,10,70,10,70,10,1657\r",physicalgraph.device.Protocol.LAN)
	return ha
}    
def audioMatrix() { 
	log.debug "Enabling Audio: Matrix"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,1,1,10,30,10,30,10,70,10,30,10,30,10,70,10,70,10,30,10,30,10,70,10,30,10,30,10,70,10,30,10,30,10,1657,10,30,10,30,10,70,10,30,10,30,10,30,10,30,10,70,10,70,10,30,10,70,10,70,10,30,10,70,10,70,10,1657\r",physicalgraph.device.Protocol.LAN)
	return ha
}     
def audioVirtual() { 
	log.debug "Enabling Audio: Matrix"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,1,1,10,30,10,30,10,70,10,30,10,30,10,70,10,30,10,30,10,70,10,30,10,30,10,30,10,70,10,30,10,30,10,1657,10,30,10,30,10,70,10,30,10,30,10,30,10,70,10,70,10,30,10,70,10,70,10,70,10,30,10,70,10,70,10,1657\r",physicalgraph.device.Protocol.LAN)
	return ha
}   
def audioDtsNeo6Music() {
 	log.debug "Enabling Dts NEO 6 Music"
 	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,1,1,10,30,10,30,10,70,10,30,10,30,10,30,10,70,10,70,10,70,10,30,10,30,10,30,10,70,10,30,10,30,10,1657,10,30,10,30,10,70,10,30,10,30,10,70,10,30,10,30,10,30,10,70,10,70,10,70,10,30,10,70,10,70,10,1657\r",physicalgraph.device.Protocol.LAN)
 	return ha
 }
def audioDtsNeo6Cinema() {
 	log.debug "Enabling Dts NEO 6 Cinema"
 	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,1,1,10,30,10,30,10,70,10,30,10,30,10,30,10,70,10,70,10,70,10,30,10,30,10,30,10,70,10,30,10,30,10,1657,10,30,10,30,10,70,10,30,10,30,10,70,10,30,10,30,10,30,10,70,10,70,10,70,10,30,10,70,10,70,10,1657\r",physicalgraph.device.Protocol.LAN)
 	return ha
 }
def audioPLIIMusic() {
 	log.debug "Enabling PLII Music"
 	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,1,1,10,30,10,30,10,70,10,30,10,30,10,30,10,30,10,30,10,30,10,70,10,30,10,30,10,70,10,30,10,30,10,1657,10,30,10,30,10,70,10,30,10,30,10,70,10,70,10,70,10,70,10,30,10,70,10,70,10,30,10,70,10,70,10,1657\r",physicalgraph.device.Protocol.LAN)
 	return ha
 }
def audioPLIICinema() {
 	log.debug "Enabling PLII Cinema"
 	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,1,1,10,30,10,30,10,70,10,30,10,30,10,70,10,70,10,70,10,70,10,30,10,30,10,30,10,70,10,30,10,30,10,1657,10,30,10,30,10,70,10,30,10,30,10,30,10,30,10,30,10,30,10,70,10,70,10,70,10,30,10,70,10,70,10,1657\r",physicalgraph.device.Protocol.LAN)
 	return ha
 }
def tvOn() {
	log.debug "TV on"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,1,1,172,172,22,64,22,64,22,64,22,21,22,21,22,21,22,21,22,21,22,64,22,64,22,64,22,21,22,21,22,21,22,21,22,21,22,64,22,21,22,21,22,64,22,64,22,21,22,21,22,64,22,21,22,64,22,64,22,21,22,21,22,64,22,64,22,21,22,1820\r",physicalgraph.device.Protocol.LAN)
	return ha
}
def tvOff() {
	log.debug "TV off"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,1,1,173,173,21,65,21,65,21,65,21,21,21,21,21,21,21,21,21,21,21,65,21,65,21,65,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,65,21,65,21,21,21,21,21,65,21,65,21,65,21,65,21,21,21,21,21,65,21,65,21,21,21,1832\r",physicalgraph.device.Protocol.LAN)
	return ha
}
def dvrPowerToggle() {
	log.debug "DVR Power Toggle"
	def ha = new physicalgraph.device.HubAction("Sendir,1:3,1,36000,1,1,15,11,5,11,6,23,6,11,6,17,5,23,6,23,6,11,6,11,5,23,6,23,6,17,6,29,6,11,5,11,6,29,6,11,5,3803\r",physicalgraph.device.Protocol.LAN)
	return ha
}
def bravo() { //556
	log.debug "Changing channel to Bravo"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,1,1,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,16,6,16,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,10,6,10,6,16,6,16,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,16,6,22,6,3263\r",physicalgraph.device.Protocol.LAN)
	return ha
}
def mtv() { //571
	log.debug "Changing channel to MTV"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,1,1,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,16,6,16,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,10,6,10,6,16,6,28,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,10,6,16,6,3263\r",physicalgraph.device.Protocol.LAN)
	return ha
}
def syfy() { //538
	log.debug "Changing channel to SYFY"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,1,1,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,16,6,16,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,10,6,10,6,10,6,28,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,22,6,10,6,3263\r",physicalgraph.device.Protocol.LAN)
	return ha
}
def showtime() { //435
	log.debug "Changing channel to Showtime"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,1,1,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,16,6,10,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,10,6,10,6,10,6,28,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,16,6,16,6,3263\r",physicalgraph.device.Protocol.LAN)
	return ha
}
def nick() { //435
	log.debug "Changing channel to Nickelodeon"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,1,1,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,16,6,16,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,10,6,10,6,16,6,10,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,16,6,16,6,3263\r",physicalgraph.device.Protocol.LAN)
	return ha
}   
def tnt() { //540
	log.debug "Changing channel to TNT"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,1,1,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,16,6,16,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,10,6,10,6,16,6,10,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,10,6,10,6,3263\r",physicalgraph.device.Protocol.LAN)
	return ha
} 
def usa() { //542
	log.debug "Changing channel to USA"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,1,1,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,16,6,16,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,10,6,10,6,16,6,10,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,10,6,22,6,3263\r",physicalgraph.device.Protocol.LAN)
	return ha
} 
def natgeo() { //543
	log.debug "Changing channel to NatGEO"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,1,1,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,16,6,16,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,10,6,10,6,16,6,10,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,10,6,28,6,3263\r",physicalgraph.device.Protocol.LAN)
	return ha
} 
def cartoon() { //546
	log.debug "Changing channel to Cartoon Network"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,1,1,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,16,6,16,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,10,6,10,6,16,6,10,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,16,6,22,6,3263\r",physicalgraph.device.Protocol.LAN)
	return ha
} 
def disney() { //549
	log.debug "Changing channel to Disney"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,1,1,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,16,6,16,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,10,6,10,6,16,6,10,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,22,6,16,6,3263\r",physicalgraph.device.Protocol.LAN)
	return ha
}
def tlc() { //557
	log.debug "Changing channel to TLC"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,1,1,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,16,6,16,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,10,6,10,6,16,6,16,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,16,6,28,6,3263\r",physicalgraph.device.Protocol.LAN)
	return ha
}
def vh1() { //573
	log.debug "Changing channel to VH1"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,1,1,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,16,6,16,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,10,6,10,6,16,6,28,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,10,6,28,6,3263\r",physicalgraph.device.Protocol.LAN)
	return ha
}
def e() { //558
	log.debug "Changing channel to E!"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,1,1,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,16,6,16,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,10,6,10,6,16,6,16,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,22,6,10,6,3263\r",physicalgraph.device.Protocol.LAN)
	return ha
}
def lifetime() { //552
	log.debug "Changing channel to Lifetime"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,1,1,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,16,6,16,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,10,6,10,6,16,6,16,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,10,6,22,6,3263\r",physicalgraph.device.Protocol.LAN)
	return ha
}
def disneyjr() { //550
	log.debug "Changing channel to Disney JR"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,1,1,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,16,6,16,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,10,6,10,6,16,6,16,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,10,6,10,6,3263\r",physicalgraph.device.Protocol.LAN)
	return ha
}
def tbs() { //541
	log.debug "Changing channel to TBS"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,1,1,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,16,6,16,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,10,6,10,6,16,6,10,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,10,6,16,6,3263\r",physicalgraph.device.Protocol.LAN)
	return ha
}
def fx() { //537
	log.debug "Changing channel to FX"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,1,1,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,16,6,16,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,10,6,10,6,10,6,28,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,16,6,28,6,3263\r",physicalgraph.device.Protocol.LAN)
	return ha
}
def ae() { //536
	log.debug "Changing channel to AE"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,1,1,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,16,6,16,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,10,6,10,6,10,6,28,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,16,6,22,6,3263\r",physicalgraph.device.Protocol.LAN)
	return ha
}
def discovery() { //532
	log.debug "Changing channel to Discovery"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,1,1,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,16,6,16,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,10,6,10,6,10,6,28,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,10,6,22,6,3263\r",physicalgraph.device.Protocol.LAN)
	return ha
}
def history() { //531
	log.debug "Changing channel to History"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,1,1,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,16,6,16,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,10,6,10,6,10,6,28,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,10,6,16,6,3263\r",physicalgraph.device.Protocol.LAN)
	return ha
}
def tmc() { //453
	log.debug "Changing channel to TheMovieChannel"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,38000,1,1,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,16,6,10,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,10,6,10,6,16,6,16,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,10,6,28,6,3263\r",physicalgraph.device.Protocol.LAN)
	return ha
}
def dvrPause() { 
	log.debug "DVR Pause"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,36000,1,1,15,10,6,11,5,23,6,10,6,16,6,23,6,23,5,10,6,10,6,10,5,23,6,16,6,29,6,10,6,28,6,11,6,10,6,3770\r",physicalgraph.device.Protocol.LAN)
	return ha
}
def dvrPlay() { 
	log.debug "DVR Play"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,36000,1,1,15,10,6,11,5,23,6,11,6,17,6,23,5,23,6,10,6,11,6,11,5,23,6,17,6,29,6,11,5,23,6,29,6,11,6,3781\r",physicalgraph.device.Protocol.LAN)
	return ha
}  
def dvrRecord() { 
	log.debug "DVR Play"
	def ha = new physicalgraph.device.HubAction("sendir,1:3,1,36000,1,1,14,11,6,10,6,23,6,11,5,17,6,23,6,23,6,10,6,10,6,11,6,23,6,16,6,29,5,10,6,29,6,16,6,29,5,3774\r",physicalgraph.device.Protocol.LAN)
	return ha
} 


// def setLevel(vol){
// 	log.debug "Setting volume level $vol"
// 	if (vol < 0) vol = 0
// 	else if( vol > 70) vol = 70
// 	else {
// 		sendEvent(name:"setLevel", value: vol)
// 		String volhex = vol.bytes.encodeHex()
// 		// Strip the first six zeroes of the hex encoded value because we send volume as 2 digit hex
// 		volhex = volhex.replaceFirst("\\u0030{6}","")
// 		log.debug "Converted volume $vol into hex: $volhex"
// 		def msg = getEiscpMessage("MVL${volhex}")
// 		log.debug "Setting volume to MVL${volhex}"
// 		def ha = new physicalgraph.device.HubAction(msg,physicalgraph.device.Protocol.LAN )
// 		return ha
// 	}
// }
