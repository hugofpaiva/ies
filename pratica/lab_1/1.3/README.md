# Docker

### Volumes e Containers

Volumes são extremamente importantes para containers onde é necessário persistir os dados do mesmo em caso de falha, reboots... Em casos como o deploy de uma base de dados em Docker, os volumes são utilizados devido ao referido em cima pois o Docker irá eliminar os dados quando o container é encerrado.

Volumes são totalmente gerenciados pelo Docker e são preferíveis a "bind mounts" devido aos últimos estarem dependentes da estrutura do SO da máquina, providenciando menos flexibilidade. Por outro lado, ao utilizar "bind mounts" existe a possibilidade de colocar o código do container num diretório da máquina local e modificar código "on the fly".

**Como criar um container com volumes**
1.  Adicionar os diretórios da imagem para serem guardados em volumes:
    
    ```bash
    VOLUME  ["/etc/postgresql", "/var/log/postgresql", "/var/lib/postgresql"]
    
    ```
    
2.  Criar volumes para guardar os diretórios:
    
    ```bash
    docker volume create postgres_data-postgresql
    docker volume create postgres_data-log
    docker volume create postgres_data-lib
    
    ```
    
3.  Ao fazer run da imagem, devemos associar os diretórios ao volume correspondente:
    
    ```bash
    docker run -d \\
      --restart unless-stopped \\
      --name pg_test \\
      **-v postgres_data-postgresql:/etc/postgresql \\
      -v postgres_data-log:/var/log/postgresql \\
      -v postgres_data-lib:/var/lib/postgresql \\**
      -p 5432:5432 \\
      eg_postgresql
    
    ```
    

### Dockerfile (comandos explicados)

```bash
FROM python:3.7-alpine ---- Build an image starting with the Python 3.7 image.
WORKDIR /code ---- Set the working directory to /code.
ENV FLASK_APP=app.py ---- Set environment variables used by the flask command.
ENV FLASK_RUN_HOST=0.0.0.0 ---- Set environment variables used by the flask command.
RUN apk add --no-cache gcc musl-dev linux-headers ---- Install gcc and other dependencies
COPY requirements.txt requirements.txt ---- Copy requirements.txt and install the Python dependencies.
RUN pip install -r requirements.txt ---- Copy requirements.txt and install the Python dependencies.
EXPOSE 5000 ---- Add metadata to the image to describe that the container is listening on port 5000
COPY . . ---- Copy the current directory . in the project to the workdir . in the image.
CMD ["flask", "run"] ---- Set the default command for the container to flask run

```

### Docker Compose

Este Compose file (docker-compose.yml) define dois serviços,  **web**  e  **redis**:

```bash
version: "3.8"
services:
  web:
    build: . ---- Usar uma image do Dockerfile desta directory
    ports:
      - "5000:5000" ---- Bind to port 5000 da machine
  redis:
    image: "redis:alpine" ---- Utiliza uma imagem pública

```

### Cheat Sheet

-   **docker-compose up →**  Inicia a aplicação do Docker Compose com base no docker-compose.yml. Usar a flag  **-d**inicia o container em "detached" mode que é o mesmo que ficar logo a correr em background
-   **docker image ls →**  Listar as imagens locais
-   **docker inspect <tag or id> →**  Ver propriedades e uma imagem
-   **docker-compose down →**  Ao correr isto no diretório do projeto, são parados os serviços e removidos os containers completamente. Com a flag  **—volumes**  remove também os volumes asociados.
-   **docker-compose ps →**  Lista os container que estão a correr. Usar a flag  **-a**  para mostrar também os que estão desligados.
-   **docker-compose run →**  Permite correr partes do serviço.  **docker-compose run web env**  permite ver as variáveis do serviço web.
-   **docker-compose stop →**  Para os serviços.
-   **docker run [image] →**  Dá inicio a um container baseado numa imagem
-   **docker rm [containername/id] →**  Elmina um container
-   **docker logs [containername/id] →**  Mostra os logs de um container em execução. Flag  **-f**  para ver on demand
-   **docker ps →**  Mostra os containers a serem executados. Flag  **-a**  para mostrar todos.

### Comandos pedidos

```bash
docker container ls -a                      
CONTAINER ID        IMAGE                   COMMAND                  CREATED             STATUS                      PORTS                                                                                                        NAMES
bd25af30396d        composetest_web         "env"                    14 minutes ago      Exited (0) 14 minutes ago                                                                                                                composetest_web_run_2dcb585beff6
6be90286554c        composetest_web         "flask run"              36 minutes ago      Up 36 minutes               0.0.0.0:5000->5000/tcp                                                                                       composetest_web_1
031624303f04        redis:alpine            "docker-entrypoint.s…"   36 minutes ago      Up 36 minutes               6379/tcp                                                                                                     composetest_redis_1
4e5f985d59e7        eg_postgresql           "/usr/lib/postgresql…"   About an hour ago   Up About an hour            0.0.0.0:5432->5432/tcp                                                                                       pg_test
9cc2001488e2        portainer/portainer     "/portainer"             5 days ago          Up 2 hours                  0.0.0.0:8000->8000/tcp, 0.0.0.0:9000->9000/tcp                                                               portainer
❯ docker container ls -all                    
CONTAINER ID        IMAGE               COMMAND             CREATED             STATUS                      PORTS               NAMES
bd25af30396d        composetest_web     "env"               14 minutes ago      Exited (0) 14 minutes ago                       composetest_web_run_2dcb585beff6

```