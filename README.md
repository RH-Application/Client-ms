# Microservice Client
- [Microservice Client](#microservice-client)
  - [Introduction](#introduction)
  - [Technologies used](#technologies-used)
    - [Eureka Server](#eureka-server)
    - [Eureka Client](#eureka-client)
    - [mysql database](#mysqldb:5.7)
    - [Eureka Zuul gateway](#eureka-zuul-gateway)
    - [***Api requests***](#api-requests)
      - [**client Model**](#client-model)
      - [**List client**](#list-client)
      - [**Create client**](#create-client)
      - [**Update client**](#update-client)
      - [**Delete client**](#delete-client)


## Introduction
this is the client micro service of this app,it registers client informations. I made this micro service for our class project while learning micro services and how to configure a eureka server and the micro services that will register into it.


## Technologies used
### Eureka Server
The Eureka server is in this [repository](https://github.com/RH-Application/EurekaServer) we used a spring boot project with spring cloud and [Netflix eureka](https://github.com/Netflix/eureka) as dependencies
### Eureka Client
This micro service is a Spring app that registers in the eureka server with the [spring-cloud-starter-netflix-eureka-client](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-netflix-eureka-client) dependecy 
### Eureka Zuul gateway
The gateway is in the [zuul-api-gateway repository](https://github.com/RH-Application/zuul-api-gateway)
like the server we created the gateway with spring boot and netflix zuul as dependencies


### ***Api requests***
#### **prof Model**
    client : {
    "adresse_user":"address"	,
    "joinDate":"2021-10-21",
    "firstName":"eya",
    "lastName":"eya",
    "mail_user":"eya@eya.com"	,
    "sexe_user":"m",
    "designation":"2eme dame"
    "tel_user":"2556586",
    "designation":"aaa",
    "webSite": "http://aaaaa.com.ctn",
    "company": "company"


}

#### **List client**
<hr>
to list all the client you need to:
<ul>
    <li>use the <strong>GET</strong>  method</li>
    <li>use this path: /retrieve-all-clients</li>
    
</ul>

#### **Create client**
<hr>  
to create a new course you need to:
<ul>
    <li>use the <strong>POST</strong>  method</li>
    <li>use this path: /add-client</li> 
    <li>add a json in the request body with the added client</li>
</ul>

#### **Update client**
<hr>
to update a client yout need to:
<ul>
    <li>use the <strong>PUT</strong> method</li>
    <li>use this path:/update-client/:id (":id" = the Id of the old client)</li>
    <li>add a json in the request body with the new client</li>
</ul>

#### **Delete client**
<hr>
to delete a client   you need to: 
<ul>
    <li>use the <strong>DELETE</strong>  method</li>
    <li>use this path: /delete-client/:id (":id" = the Id of the client to delete)</li>
    
</ul>
