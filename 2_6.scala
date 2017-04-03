#!/usr/bin/env scala

val word = "Hello"
var product: Long = 1

for (char <- word){
  product *= char.toInt
}

println(product)

