#!/usr/bin/env sh

set -e

exec su -c "java -jar SpringRestDocs-0.0.1-SNAPSHOT.jar" spring & nginx -g "daemon off;"
