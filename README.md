# AirportMonitor - Sample App

Right now application is not been developed and plays role of sample to look at my coding style etc.

##### How to run it ?
There are two ways :

1. Invoke 'mvn clean install' in AirportMonitorWeb module and then run AirportMonitorWeb-0.1.jar via javac.
2. In AirportMonitorWeb module run mcn spring-boot:run.

##### What is that ?
SPA (Single Page Application) test piece of Spring Websockets. 

You can view all current flights and their arrivial time to selected airports. 
Also you can select only some flights to track, to test broadcasting to single user. 

Plane locations are generated in Quartz jobs.

##### Unfortunately 
It's an early stage of application, it's read only and core features are not implemented yet. 
By now you can see :
* Maven module structure and dependencies organisation
* Basic Spring Boot configuration and usage
* REST controllers and services for cities and airports - AirportMonitorWeb module
* Domain classes and data mocks for them - AirportMonitorCommons
* Use of Lombok and Null handling - AirportMonitorCommons
* Basic Quartz job configuration - AirTrafficBroadcaster
* Angular usage, SPA page navigation
* On frontend simple readonly UI for airports and cities is shown
 
###### Todos :
1. Jobs for changing planes location and developing AirTrafficBroadcaster module.
2. Application logs organisation.
3. New tab with flights and additional info with plane location recived by WebSockets.
4. User login with Spring Security.
5. Broadcasting data to single logged user
6. CRUD operations on airports, planes, cities, flights.
7. AirTrafficBroadcaster module as independent web application integrated with AirportMonitorWeb via REST.

