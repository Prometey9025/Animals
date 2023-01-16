package Animals

abstract class Animal constructor(
    var food:String,
    var location:String)
{
    abstract fun makeNoise()
    abstract fun eat()
    fun sleep(){"Животное спит"}
}