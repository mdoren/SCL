import kotlin.system.exitProcess

fun main(){
    var character = ""
    while (character != "13") {
        println("Super Smash Bros.")
        println("Choose your character!")
        println("1. Mario")
        println("2. Donkey Kong")
        println("3. Link")
        println("4. Samus")
        println("5. Yoshi")
        println("6. Kirby")
        println("7. Fox")
        println("8. Pikachu")
        println("9. Luigi")
        println("10. Captain Falcon")
        println("11. Ness")
        println("12. Jigglypuff")
        println("13. Exit")
        character = readLine().toString()

        if (character == "1") {
            print("Mario!")
        } else if (character == "2") {
            println("Donkey Kong!")
        } else if (character == "3") {
            println("Link!")
        } else if (character == "4") {
            println("Samus!")
        } else if (character == "5") {
            println("Yoshi")
        } else if (character == "6") {
            println("Kirby!")
        } else if (character == "7") {
            println("Fox!")
        } else if (character == "8") {
            println("Pikachu!")
        } else if (character == "9") {
            println("Luigi!")
        } else if (character == "10") {
            println("Captain Falcon!")
        } else if (character == "11") {
            println("Ness!")
        } else if (character == "12") {
            println("Jigglypuff!")
        } else if (character == "13") {
        } else println("Invalid entry, try again.")
    }
}