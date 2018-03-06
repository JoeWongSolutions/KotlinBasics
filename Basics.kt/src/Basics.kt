fun main(args: Array<String>) {
    val sample1: Short = 0x3A //using short instead of Byte because Kotlin/java does not support unsigned types
    var sample2: Short = 58
    var heartRate: Int = 85
    var deposits: Double = 135002796.0
    val acceleration = 9.800f
    var mass = 14.6f
    var distance: Double = 129.763001
    var lost = true
    var expensive = true
    var choice = 2
    val integral = '\u222B'
    val greeting = "Hello"
    var name = "Karen"

    if (sample1 == sample2) println("The samples are equal") else println("The samples are not equal")

    if (heartRate >= 40 && heartRate <= 80) println("Heart rate is normal") else println("Heart rate is not normal")

    if (deposits >= 100000000) println("You are exceedingly wealthy") else println("You are so poor")

    var force = mass * acceleration
    println("Force = " + force)

    println("$distance is the distance")

    if (lost){
        if(expensive)
            println("I am really sorry, I will get the manager")
        else
            println("Here is a coupon for 10% off")
    }

    when (choice) {
        1, 2, 3 -> println("You chose $choice")
        else -> println("You made an unknown choice")
    }

    println(integral + " is an integral")

    for (i in 5..10){
        println("i=$i")
    }

    var age = 0
    while (age < 6){
        println("age = " + age++)
    }

    println(greeting + " " + name)
}