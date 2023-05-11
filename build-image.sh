#!/bin/sh

mvn clean install -DskipTests=true assembly:single
docker build -f ./Dockerfile --tag=lecture2-sample:1 .
