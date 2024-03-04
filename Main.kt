
fun main() {
//    var firstName = "Tomáš"
//    var lastName = "Zajíc"
//    println(firstName + " " + lastName)
//    println(firstName.plus(lastName))
//    println("$firstName $lastName")

//    for (nums in 5..15){
//        println(nums)
//    }

    //var myList = arrayOf(1..50)
    for (x in 1..50)
        if (x % 3 == 0 && x%5 == 0){
            println("Fizz Buzz")
        }else if (x%3 == 0) {
            println("Fizz")
        }else if (x%5 == 0) {
            println("Buzz")
        }else {
            println(x)
        }

}
