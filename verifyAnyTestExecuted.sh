#!/usr/bin/env bash

if [[ `egrep -i 'Skipped: 2' output.txt` ]]; then
  echo "All tests are skipped!"
  exit 1
else
  exit 0
fi
