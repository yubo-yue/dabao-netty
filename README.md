Netty project for remote DATA transfer
===

## Things to concern
1. stable - the server would always be online
2. concurrency - use case show that many users may concurrent send data server at traffic summit period
3. persistence - data at last need to be persisted safely for further analysis(both offline and online)
4. protocol - maybe protobuf for protocol definition.
5. economy - zero-copy, less memory resource consumption

 Goal : Asynchronous, non-blocking, event-driven data transfer

## What may we utilize?
1. netty(5.x) - asynchorous, event-driven network application. concurrent, non-block 
2. levelDB
3. Kafka
4. Redis, MongoDB, MySQL etc. 
5. Flume???

## Netty concepts
1. Buffers
2. Codec
3. Pipelines and Handlers
4. Multiple protocol - Http, Websocket, protobuf, Binary; TCP&UDP

## Thread model
1. Tomcat - 1 thread = 1 request; fast for ~ 1000 clients, too much memory consumption
2. NodeJs - 1 thread = all request; super scalable and limited error handling.
3. Netty - 1 thread = many request; flexible model

## Examples
### HttpServer
1. Set up thread pool - boss pool for handling incoming connections; working pool for handling I/O
