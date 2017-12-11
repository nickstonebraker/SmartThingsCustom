const http = require('http')
const port = 80

const requestHandler = (request, response) => {
  if(request.url.indexOf("/watch/bravo")>-1){
    watchBravo();
    console.log("request: " + request.url);
  }
}

const server = http.createServer(requestHandler)

server.listen(port, (err) => {
  if (err) {
    return console.log('something bad happened', err)
  }

  console.log(`server is listening on ${port}`)
})




function watchBravo(){
    var tvOn = "sendir,1:3,1,38000,1,1,172,172,22,64,22,64,22,64,22,21,22,21,22,21,22,21,22,21,22,64,22,64,22,64,22,21,22,21,22,21,22,21,22,21,22,64,22,21,22,21,22,64,22,64,22,21,22,21,22,64,22,21,22,64,22,64,22,21,22,21,22,64,22,64,22,21,22,1820";
    var inputFioptics = "sendir,1:3,1,38000,1,1,10,30,10,70,10,30,10,30,10,30,10,30,10,30,10,30,10,70,10,30,10,30,10,70,10,70,10,30,10,30,10,1657,10,30,10,70,10,30,10,30,10,30,10,70,10,70,10,70,10,30,10,70,10,70,10,30,10,30,10,70,10,70,10,1657";
    var avrOn = "sendir,1:3,1,38000,1,1,10,30,10,70,10,30,10,30,10,30,10,70,10,30,10,30,10,70,10,70,10,70,10,70,10,30,10,30,10,30,10,1657,10,30,10,70,10,30,10,30,10,30,10,30,10,70,10,70,10,30,10,30,10,30,10,30,10,70,10,70,10,70,10,1657";
    var bravo = "sendir,1:3,1,38000,1,1,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,28,6,28,6,16,6,22,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,16,6,16,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,22,6,22,6,16,6,28,6,10,6,10,6,16,6,16,6,3263,15,10,6,10,6,22,6,10,6,16,6,22,6,22,6,10,6,10,6,10,6,22,6,16,6,28,6,10,6,10,6,16,6,22,6,3263";
    var iTach = require('node-itach');
    var remote = new iTach({
        host: '192.168.200.70' // required: IP address of your iTach device 
    });

    remote.send({ir: avrOn}, function callback(err) {
        if (err) {
            throw new Error(err);
        } else {
             remote.send({ir: tvOn}, function callback(err) {
        if (err) {
            throw new Error(err);
        } else {
             remote.send({ir: inputFioptics}, function callback(err) {
        if (err) {
            throw new Error(err);
        } else {
             remote.send({ir: bravo}, function callback(err) {
        if (err) {
            throw new Error(err);
        } else {
             console.log("Done");
        }
    });
        }
    });
        }
    });
        }
    });
}