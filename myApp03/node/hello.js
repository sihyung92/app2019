var http = require('http');

var hostname = '127.0.0.1';
var port = 5000;

var server = http.createServer((req, res) => {
  res.statusCode = 200;
  res.setHeader('Content-Type', 'text/html');
  res.end('<h1>Hello World\n<h1>');
});

server.listen(port, hostname, myService);

function myService(){
  console.log(`Server running at http://${hostname}:${port}/`);
}