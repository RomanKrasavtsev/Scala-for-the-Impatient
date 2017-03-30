#!/usr/bin/env scala

def signum(number: Integer) = {
  if (number == 0)
    0
  else if (number > 0)
    1
  else -1
}

println(signum(-1))
