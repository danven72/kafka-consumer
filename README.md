# kafka-consumer
Spring boot project example of Kafka Consumer

This project expose two REST API's for publishing to two differents Kafka topics

GET: http://localhost:8081/kafka/publish/{message to publish} --> publish simple message to Topic "springboot-kafka"

POST: curl -v -H "Content-type: application/json" -d '{"name":"Jim", "surname": "Morrison", "age": 27}' http://localhost:8081/kafka/publish/user/ --> publish a User to Topic "springboot-kafka-json2"


## Instruction ##
**step 1**: install kafka and start it --> Follow steps 1, 2 of this <a href="https://kafka.apache.org/quickstart">link</a>  
**step 2**: create the topics "springboot-kafka" and "springboot-kafka-json2" --> View step 3 of the previous link
**step 3**: startup the springboot project. Use step 5 of the previous link to see consume your messages published. Eventually, you can use the kafka-consumer application too


