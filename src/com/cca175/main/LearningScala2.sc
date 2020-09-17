package com.cca175.main

object LearningScala2 {
//Flow control

// if / else

if(1>3) println("Impossible") else println("It makes sense")
                                                  //> It makes sense
//Matching (like switch case)

val number = 3                                    //> number  : Int = 3

number match{
	case 1 => println("One")
	case 2 => println("Two")
	case 3 => println("Three")
	case _ => println("Something else")
}                                                 //> Three

for(x <- 1 to 4){
	val squar = x * x
	println(squar)
}                                                 //> 1
                                                  //| 4
                                                  //| 9
                                                  //| 16

var x = 3                                         //> x  : Int = 3
while(x>=1){
	println(x)
	x -=1
}                                                 //> 3
                                                  //| 2
                                                  //| 1
x = 0
do {println(x); x +=1} while (x<=3)               //> 0
                                                  //| 1
                                                  //| 2
                                                  //| 3

// Expressions

{val x=10; x + 20}                                //> res0: Int = 30

	var a = 0                                 //> a  : Int = 0
	var b = 1                                 //> b  : Int = 1
	var n = 0                                 //> n  : Int = 0
	print (a+" "+b+" ")                       //> 0 1 
	
	for(y <- 2 to 10){
		n = a+b
	  print(n +  " ")
		a=b;
		b=n;
	}

}