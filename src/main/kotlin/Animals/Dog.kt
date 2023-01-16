package Animals

class Dog(
    var voicePower: Int,
    food : String, location : String)
    :Animal(food, location)
{
    override fun makeNoise() {
        println("Gav!".repeat(voicePower))
    }

    override fun eat() {
        println("I am a dog in $location and i am eat $food!")
    }
}