
docker build -t eg_postgresql .

docker rm -f pg_test

docker volume create postgres_data

docker run -d \
  --restart unless-stopped \
  --name pg_test \
  -v postgres_data:/etc/postgresql/9.3/main/ \
  -p 5432:5432 \
  eg_postgresql