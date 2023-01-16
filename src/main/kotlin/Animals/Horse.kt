package Animals

class Horse(
    var workedDays : Int = 0,
    food : String, location : String)
    :Animal(food, location)
{
    override fun makeNoise() {
        println("I am tired, i worked $workedDays days")
    }

    override fun eat() {
        println("I in $location and i am eat $food and i love sugar")
    }

}