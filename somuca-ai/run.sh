#!/bin/bash
set -e
./apache-tomcat-9.0.63/bin/startup.sh
exec $@