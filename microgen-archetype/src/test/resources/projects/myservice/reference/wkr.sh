#!/usr/bin/env bash

for USERS in 1 5; do
    echo "Running with $USERS users for 60 seconds"
    for RUN in {1..2}; do
        wrk --threads=$RUN --connections=$USERS --latency -d60s http://localhost:8080/todos
    done
done
