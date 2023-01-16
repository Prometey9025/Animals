import Animals.Animal

class Veterinarian (
    val name : String
)
{
    fun heal(animal: Animal){
        println("I am Dr. ${name}. He got sick because he ate a lot of " +
                "${animal.food} in the ${animal.location}, but I will cure him")
    }
}