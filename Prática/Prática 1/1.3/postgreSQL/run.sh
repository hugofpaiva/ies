
docker build -t eg_postgresql .

docker rm -f pg_test

docker volume create postgres_data-postgresql
docker volume create postgres_data-log
docker volume create postgres_data-lib

docker run -d \
  --restart unless-stopped \
  --name pg_test \
  -v postgres_data-postgresql:/etc/postgresql \
  -v postgres_data-log:/var/log/postgresql \
  -v postgres_data-lib:/var/lib/postgresql \
  -p 5432:5432 \
  eg_postgresql