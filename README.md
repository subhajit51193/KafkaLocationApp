
# LocationManagementApp with Kafka (Basic)

This is a basic application that uses kafka to demonstrate producer and consumer relationship and functionalities, how they work.
Location is being generated randomly from one service and being consumed by another service simultaneously.


## Features

- Random Location Producr
- Location details being consumed and updated to subscribers or consumers at real time

## Kafka Commands for windows used in this project via cmd after selecting kafka files that contains bin folder

Start Zookeeper server
```
bin\windows\zookeeper-server-start.bat config\zookeeper.properties
```
Start kafka server
```
bin\windows\kafka-server-start.bat config/server.properties
```
Create Topics
```
bin\windows\kafka-topics.sh --create --topic user-topic --bootstrap-server localhost:9092
```
Produce new Topics for testing
```
bin\windows\kafka-console-producer.bat --topic user-topic --bootstrap-server localhost:9092
>Testing Message
```
Consume created topics for testing
```
bin\windows\kafka-console-consumer.bat --topic user-topic --from-beginning --bootstrap-server localhost:9092
```

## Configurations for Consumer Service

Check following configurations Change DB details accordingly

```bash
#server
server.port=8081

#Consumer Config
spring.kafka.consumer.bootstrap-servers=localhost:9092
spring.kafka.consumer.group-id=group-1
spring.kafka.consumer.auto-offset-reset=earliest
spring.kafka.consumer.key-deserializer=org.apache.kafka.common.serialization.StringDeserializer
spring.kafka.consumer.value-deserializer=org.apache.kafka.common.serialization.StringDeserializer



```
    
## Run Locally Backend

Clone the project

```bash
  git clone https://github.com/subhajit51193/KafkaLocationApp.git
```

Go to the project directory

```bash
  cd KafkaLocationApp
```
```bash
  cd EdnUserApp
```

Install dependencies

```bash
  mvn clean install
```

Start the server

```bash
  mvn spring-boot:run
```
## Configurations for Producer Service

Check following configurations Change DB details accordingly

```bash
#Producer Config
spring.kafka.producer.bootstrap-servers=localhost:9092
spring.kafka.producer.key-serializer=org.apache.kafka.common.serialization.StringSerializer
spring.kafka.producer.value-serializer=org.apache.kafka.common.serialization.StringSerializer



```
    
## Run Locally Backend

Clone the project

```bash
  git clone https://github.com/subhajit51193/KafkaLocationApp.git
```

Go to the project directory

```bash
  cd KafkaLocationApp
```
```bash
  cd FoodDeliveryBoyApp
```

Install dependencies

```bash
  mvn clean install
```

Start the server

```bash
  mvn spring-boot:run
```


## Deployment

Not Deployed



## Tech Stack

**Client:** Java, SpringBoot, Kafka

**DataBase:** N/A

**Server:** Embedded Tomcat


## Authors

- [@Subhajit Saha](https://github.com/subhajit51193)


## Feedback

If you have any feedback, please reach out to us at nnorth87@gmail.com


## 🔗 Links
[![portfolio](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://subhajit51193.github.io/)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/subhajit-saha-103110185/)




