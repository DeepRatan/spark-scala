package com.cca175.main

object LearningScala1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  //Values are immutable constants
  val hello: String = "Ola !!"                    //> hello  : String = Ola !!
  
  //Variable are mutable constants
  var helloThere: String = hello                  //> helloThere  : String = Ola !!
  helloThere = hello + " There"
	println(helloThere)                       //> Ola !! There
	
	// Data Types in Scala
	val numberOne: Int = 1                    //> numberOne  : Int = 1
	val truth: Boolean = true                 //> truth  : Boolean = true
	val letterA: Char = 'a'                   //> letterA  : Char = a
	val pi: Double = 3.14159265               //> pi  : Double = 3.14159265
	val piSinglePrecision: Float = 3.14159265f//> piSinglePrecision  : Float = 3.1415927
	val bigNumber: Long = 123456789           //> bigNumber  : Long = 123456789
	val smallNumber: Byte = 127               //> smallNumber  : Byte = 127
	
	println(f"Pi is about $piSinglePrecision%.3f")
                                                  //> Pi is about 3.142
  println(f"Zero Padding on the left: $numberOne%05d")
                                                  //> Zero Padding on the left: 00001
                                                  
  val doublePi: Float = piSinglePrecision*2       //> doublePi  : Float = 6.2831855
  println(f"Printing the value of Double PI $doublePi%.3f")
                                                  //> Printing the value of Double PI 6.283
  
}