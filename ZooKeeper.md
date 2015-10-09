Thinking in Zookeeper
===
## Overview
An open-source, high performance coordination service for distributed application.


## Use cases
1. Configuration Management
2. Distributed Cluster Management
3. Naming service, eg. DNS
4. Distributed synchronization - locks, barriers, queues
5. Leader election in distributed environment.
6. centralized and high reliable data registry.

## Zookeeper concept
1. znode
2. leader
3. follower
4. event watch

### Znode type
1. Persistent node
2. Ephemeral node - exists as long as the session is active.
3. Sequence Node - append monotonically increasing number to the end of path

