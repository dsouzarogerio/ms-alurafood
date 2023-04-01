# Projeto Microsserviço de pagamentos do Alura Food

Projeto desenvolvido no curso da Alura de ***"Microsserviços na prática: implementando com Java e Spring"***

### Neste projeto:
- Arquitetamos um microsserviços de pagamentos; 
- Construimos a API; 
- Inserimos um banco de dados isolado; 
- Utilizamos boas práticas separando os pacotes por camadas de responsabilidade
- Utilizamos migrations para a criação do SQL e versionamento do banco de dados; 
- Trabalhamos com o Service Discovery e com o Service Registry, registrando os microsserviços para serem descobertos através dos seus nomes;
- Fizemos o balanceamento de cargas e a inclusão do Gateway na aplicação; 
- Elaboramos a comunicação síncrona entre os serviços de pedidos e pagamentos.
- Tratamos o comportamento de falhas com o serviço de pedidos fora do ar; 
- Utilizamos o Eureka
- E testamos os microsserviços executando as solicitações com o Postman. 

### Tecnologias utilizadas:
[<img src=https://user-images.githubusercontent.com/63685559/229297819-cbe7ec1c-eb9e-4ee9-8da5-2a498a788611.png width="46" heigth="46">](https://spring.io/) 
[<img src=https://maven.apache.org/images/maven-logo-black-on-white.png width="46" heigth="40">](https://maven.apache.org/guides/)
[<img src=https://s.glbimg.com/jo/g1/f/original/2011/08/22/22-java-300.jpg width="46" heigth="46" >](https://docs.oracle.com/en/java/javase/17/)

- JDK - 17.0.6
- MVN - 3.8.5
- IDE STS4
- Spring Boot - 2.6.7
  - Spring Data JPA
  - Spring Validation
  - Spring Web
  - DevTools
  - AOP
- Driver MySQL - 8.0.28
- FlyWay - 8.0.5
- Spring Cloud - 2021.0.6
  - OpenFeign
  - Eureka Client
  - Eureka Server
  - Gateway
- Lombok - 1.18.24
- ModelMapper - 3.1.0
- Resilience4J - 1.7.0

### Documentações e Referências
- [JDK 17 Documentation](https://docs.oracle.com/en/java/javase/17/)
- [MAVEN Documentation](https://maven.apache.org/guides/)
- [Sprign Boot Reference Documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/)
- [Spring Cloud 2021.0.6](https://docs.spring.io/spring-cloud/docs/2021.0.6/reference/html/)
- [Spring Cloud Circuit Breaker](https://docs.spring.io/spring-cloud-circuitbreaker/docs/2.1.6/reference/html/)
- [Spring Cloud Netflix](https://docs.spring.io/spring-cloud-netflix/docs/3.1.5/reference/html/)
- [Spring Cloud OpenFeign](https://docs.spring.io/spring-cloud-openfeign/docs/3.1.6/reference/html/)
- [Spring Cloud Gateway](https://docs.spring.io/spring-cloud-gateway/docs/3.1.6/reference/html/)
