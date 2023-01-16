package Animals

class Cat(
    var caughtMiceNumber : Int = 0,
    food : String, location : String)
    :Animal(food, location)
{
    override fun makeNoise() {
        println("Myau... I go back to $location")
    }

    override fun eat() {
        println("I ate $food! and $caughtMiceNumber mice")
    }

}