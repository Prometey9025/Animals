import Animals.Animal
import Animals.Cat
import Animals.Dog
import Animals.Horse
import java.util.*

fun main(args: Array<String>) {
    val animals = mutableListOf<Animal>(
        Cat(26,"KittyCat","House"),
        Cat(25,"Wiskas","Penthause"),
        Horse(632,"Hay", "Field"),
        Dog(4, "Steak", "Restaurant")
    )

    animals.forEach{it -> it.makeNoise()}
    animals.forEach{it -> it.sleep()}

    var aiyBolit = Veterinarian("AiyBolit")
    animals.forEach{it -> aiyBolit.heal(it)}
}

fun task2(){
    var userNumber : Int
    var randomNumber : Int
    while(true){
        println("Input your number")
        userNumber = readLine()!!.toInt()
        randomNumber = (1..9).random()
        if(userNumber == randomNumber) {
            println("Equals!")
            break
        }
        else
            println(userNumber.toString() + " not equal " + randomNumber.toString() + ". Try again!")
    }
}

fun task3(){
    var userNumber = readLine()!!.toInt()

    for(i in 1..userNumber)
        if(userNumber%i==0)
            print(i.toString()+ if(i!=userNumber) ", " else "")
}

fun task4(){
    var n = readLine()!!
    val arrOfInt= n.map {"$it".toInt()}

    var oddCount = 0
    var evenCount = 0
    for(i in arrOfInt){
        if(i % 2 == 0)
            evenCount++
        else
            oddCount++
    }

    println("Even: " + evenCount.toString() + ", odd: " + oddCount.toString())
}

fun task5(){
    var sum = 0
    for(i in 1..100)
        if(i%4==0)
            sum = sum + i

    println(sum)
}

fun task6(){
    var sum = 0
    var num = 4
    while(num <= 57){
        num = ++num
        if(num in intArrayOf(34, 46, 52)) continue
        sum = sum + num
    }
    println(sum)
}