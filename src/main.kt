fun main(){
   val classes = listOf("AnitaB","lisalab","Lovelace")
    println(classes)
    classes.forEach{x ->
        println(x)


        var nums = listOf(19,18,20,18,19,21,22,23,23,22,21,21)
        println(nums.count())
        println(nums.size)
        println(nums.sum())
        println(nums.minOrNull())
        println(nums.maxOrNull())
        println(nums.average())
        println(nums[0])
        println(nums[11])
        println(nums.first())
        println(nums.get(3))
        println(nums.indexOf(21))
        println(nums.lastIndexOf(21))

        var numsSorted = nums.sortedDescending()
        println(numsSorted)

        nums.forEach{x->
            println(x)
        }
       // println(nums.forEachIndexed())
    }

    var colors = mutableListOf("Red","Blue","Green")
    colors.add("Yellow")
    colors.remove("Red")
    println(colors)




    //write a function that prints oout the squares of the elements at odd indices given a list of integers
    //hint:forEachIndexed

    var numbs = listOf(12,34,18,11,10,17,26,15)
     numbs.forEachIndexed{index,x->
         if (index%2!=0)
           //  println(numbs
             for (x in numbs)
                 println(x)

         var index=0
         println("index:$index -element$x")

     }
//  var toyota =Car("Toyota","corolla")
//    var ford =Car("Ford","Fiesta")
//    var audi =Car("Audi","A6")
//
//    var myCars = listOf(toyota,ford,audi)
//    println(myCars)
//
//
//    //print out ONLY THE MODELS OF THE CARS FROM YOUR LIST OF CAR
//    myCars.forEach{car ->
//        println(car.model)

//       var sortedCars= myCars.sortedBy { car -> car.make }
//        println(sortedCars)
//
//        var sortedCars= myCars.sortedBy { car -> car.model }
//        println(sortedCars)
//
//        var sortedCars= myCars.sortedByDescending{ car -> car.model }
//        println(sortedCars)
//
//    }
    //var opel =Car ("Opel","Astra")

        //create a function  that takes in a list of cars and returns a list of the models that begin with vowels
    var models = mutableListOf< String>()
    var vowels = listOf('a','e','i','o','u')
////    cars.forEach{->
////        if (vowels.contains(car.model.lowercase().first())){
////
//        }
//
//    }

    var fruits = mutableListOf<String>()
    fruits.add("Banana")
    fruits.add("Apple")
    fruits.add("Mango")
    fruits.add("Avocado")
    println(fruits)

    fruits.remove("Apple")
    println(fruits)

    fruits.add(0,"Grapes")
    println(fruits)

    fruits.removeAt(3)
    println(fruits)

    fruits[1]="Pear"
    println(fruits)

    var longNames = fruits.filter { fruit-> fruit.length>5 }
    println(longNames)

    var shortNames = fruits.filter { fruit->fruit.length<5 }
    println(shortNames)

    var x =Person("Ruth",20)
    var y  =Person("Jane",12)
    var z  =Person("Japheth",27)
    var t =Person("Zack",17)

    var people = listOf(x,y,z,t)
    var adults = people.filter { person -> person.age>=18 }
    println(adults)

}
data class Car(var make:String,var model:String){

}
data class Person(var name: String,var age: Int)

