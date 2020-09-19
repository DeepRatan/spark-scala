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
 	
 	//Lists
 	// Must be of same type
 	
 	val bikeBrands = List("Ducati","KTM","Kawasaki","Honda","Harley")
                                                  //> bikeBrands  : List[String] = List(Ducati, KTM, Kawasaki, Honda, Harley)
 	println(bikeBrands(1))                    //> KTM
 	
	for(bike <- bikeBrands) println(bike)     //> Ducati
                                                  //| KTM
                                                  //| Kawasaki
                                                  //| Honda
                                                  //| Harley
// map() funciton
	val reversBikeBrands = bikeBrands.map((bike: String) => {bike.reverse})
                                                  //> reversBikeBrands  : List[String] = List(itacuD, MTK, ikasawaK, adnoH, yelraH
                                                  //| )
	for(bike <- reversBikeBrands) println(bike)
                                                  //> itacuD
                                                  //| MTK
                                                  //| ikasawaK
                                                  //| adnoH
                                                  //| yelraH
                                                  
// reduce() to combine together all the items in a collection using a function

  val numList = List(1,2,3,4,5)                   //> numList  : List[Int] = List(1, 2, 3, 4, 5)
  val sum = numList.reduce((x: Int, y: Int) => (x+y))
                                                  //> sum  : Int = 15
  println(sum)                                    //> 15
  
  //filter() removes stuff
  val removeEvenNum = numList.filter((x: Int) => (x%2!=0))
                                                  //> removeEvenNum  : List[Int] = List(1, 3, 5)
  //Short hand of using filters
  val removeThree = numList.filter(_ !=3)         //> removeThree  : List[Int] = List(1, 2, 4, 5)
 	
 	//concatenate List
 	val moreNumbers = List(6,7,8,9)           //> moreNumbers  : List[Int] = List(6, 7, 8, 9)
 	val lotsOfNumbers = numList ++ moreNumbers//> lotsOfNumbers  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

	val revNumbers = lotsOfNumbers.reverse    //> revNumbers  : List[Int] = List(9, 8, 7, 6, 5, 4, 3, 2, 1)

	val contains7 = lotsOfNumbers.contains(7) //> contains7  : Boolean = true
	
	val duplicates = numList ++ numList       //> duplicates  : List[Int] = List(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
	
	val removeDuplicates = duplicates.distinct//> removeDuplicates  : List[Int] = List(1, 2, 3, 4, 5)

	val sumOfNumbersInList = removeDuplicates.sum
                                                  //> sumOfNumbersInList  : Int = 15
	val maxValues = removeDuplicates.max      //> maxValues  : Int = 5

	// MAPS
	val bikesMap = Map("Ducati"->"Diavel", "Honda"->"CBR 1000", "Yamaha" -> "R1")
                                                  //> bikesMap  : scala.collection.immutable.Map[String,String] = Map(Ducati -> D
                                                  //| iavel, Honda -> CBR 1000, Yamaha -> R1)
	println(bikesMap("Ducati"))               //> Diavel
	
	val ktmBike = util.Try(bikesMap("KTM")) getOrElse "Unknown"
                                                  //> ktmBike  : String = Unknown
	println(ktmBike)                          //> Unknown
	
	val numList2 = List (1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
                                                  //> numList2  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,
                                                  //|  15, 16, 17, 18, 19, 20)
	
	for(x <- numList2){
		if(x%3==0) println(x)             //> 3
                                                  //| 6
                                                  //| 9
                                                  //| 12
                                                  //| 15
                                                  //| 18
	}
	
	val finalList2 = numList2.filter((x: Int) => (x%3==0))
                                                  //> finalList2  : List[Int] = List(3, 6, 9, 12, 15, 18)
	
}