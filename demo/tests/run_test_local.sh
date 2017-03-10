#!/bin/bash
set -x
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
pushd $DIR > /dev/null
bash $1 start $DIR/docker/example.txt
bash simple_test.sh
bash $1 stop
popd> /dev/null
