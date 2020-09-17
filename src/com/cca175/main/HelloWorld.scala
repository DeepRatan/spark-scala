package com.cca175.main

object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello World")
    println("Welcome to the World of Scala coding")
    
//    Printing Fibonacci Series
    var a=0
    var b=1
    var n=0
    print(a + " "+ b + " ")
    for(x <- 2 to 10){
      n = a+b
      print(n+" ")
      a=b
      b=n
    }
  }
  
//  Syntax of defining a function in scala
  def functionName(paramater: String) : Unit ={
    
  }
}