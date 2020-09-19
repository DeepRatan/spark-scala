package com.cca175.main

object LearningScala4 {
  //Data Structures
  
  //Tuples
  val cars = ("Benz","Audi","BMW")                //> cars  : (String, String, String) = (Benz,Audi,BMW)
  println(cars)                                   //> (Benz,Audi,BMW)
  //accessing values in a tuple
  println(cars._1)                                //> Benz
  println(cars._2)                                //> Audi
  println(cars._3)                                //> BMW
  
  val carModels = "Benz" -> "C-Class"             //> carModels  : (String, String) = (Benz,C-Class)
  println(carModels._2)                           //> C-Class
  
 // Tuple can hold values of mix data type
 	val mixTuple =("Benz", 3000, true)        //> mixTuple  : (String, Int, Boolean) = (Benz,3000,true)
 	
}