## Um microservice para envio de email usando SpringBoot

### Dependencias:

##### Spring Web
##### Spring Data Jpa
##### PostgreSql
##### Validation
##### Lombok
##### Java Mail Sender
##### Spring Boot DEvTools

### No arquivo application.properties:
##### server.port=8080
##### spring.datasource.url= jdbc:postgresql://localhost:5432/nome_banco
##### spring.datasource.username=postgres
##### spring.datasource.password="senha de acesso ao banco"
##### spring.jpa.hibernate.ddl-auto=update

##### spring.mail.host=smtp.gmail.com
##### spring.mail.port=587
##### spring.mail.username="nome de usuario para o email"
##### spring.mail.password="senha de 16 caracteres criada na aba segurança na conta do google"

### Criando senha de acesso no google
##### 1 - Acesse sua conta Google
##### 2 - Vá ate a aba segurança
##### 3 - Vá ate senhas de app
##### 4 - Digite um nome para o app e escolha um dispositivo

###Usando RabbitMq no serviço
#### 1 - Acesse https://api.cloudamqp.com/ e crie uma conta free
#### 2 - Crie uma instancia do serviço
#### 3 pegue os dados de Host(no caso a Url)
#### 4 dentro do application.properties faça:

##### spring.rabbitmq.adresses="url do host de serviço"
##### spring.rabbitmq.queue = ms.email

