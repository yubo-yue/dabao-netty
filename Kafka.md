Thinking in Kafka
===
## Concept
1. Consumer 
2. Producer
3. Kafka cluster (broker)
4. Partition

### Consumer
1. queue
2. publish subscribe

## Guarantee
1. same product, M1 before M2, then M1 has lower offset than M2
2. consumer see Message in the order they saved in the log
3. FOr a topic with replication factor N, will tolerate up to N-1 failure.

## Reference
1. http://kafka.apache.org
2. http://www.infoq.com/cn/articles/apache-kafka
