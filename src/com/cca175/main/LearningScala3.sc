package com.cca175.main

object LearningScala3 {
// Function body
// def functionName(parameterName:type....) : returnType = {}

def squareIt(x:Int) : Int ={
	x*x
	}                                         //> squareIt: (x: Int)Int

def cubeIt(x:Int) : Int = {x*x*x}                 //> cubeIt: (x: Int)Int

println(squareIt(2))                              //> 4
println(cubeIt(3))                                //> 27

def transformInt(x:Int, f:Int => Int) : Int ={
		f(x)
	}                                         //> transformInt: (x: Int, f: Int => Int)Int

 transformInt(5, squareIt)                        //> res0: Int = 25
 transformInt(2, cubeIt)                          //> res1: Int = 8

// Lamda functions
	transformInt(3, x => x*x*x)               //> res2: Int = 27
	transformInt(27, x=>x/3)                  //> res3: Int = 9
	transformInt(5, x=>{val y=x*2; y*8})      //> res4: Int = 80
	
	def convertToUpper(s:String) : String ={
		s.toUpperCase()
	}                                         //> convertToUpper: (s: String)String
	
	def transformString(s:String, f:String => String) : String ={
		f(s)
	}                                         //> transformString: (s: String, f: String => String)String
	
	transformString("deep", convertToUpper)   //> res5: String = DEEP
	
	transformString("lamda", x=>{x.toUpperCase})
                                                  //> res6: String = LAMDA
}