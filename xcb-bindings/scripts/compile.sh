#!/usr/bin/env bash
set -e

CMAKE_DIR=target/cmake

cmake -S . -B ${CMAKE_DIR}
make --directory=${CMAKE_DIR}
cp -f ${CMAKE_DIR}/libXcbBindings.so target/classes/
