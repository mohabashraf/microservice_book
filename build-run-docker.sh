#!/bin/bash

set -eu

mvn clean package

sudo sudo docker build -t book:1 .

sudo docker run --rm -p 9080:9080 book:1
