fun main() {
    val child = 5
    val adult = 28
    val senior = 87
    val isMonday = true
    println("Цена билета в кино для человека в возрасте $child - ${ticketPrice(child, isMonday)} рублей.")
    println ("Цена билета в кино для человека в возрасте $adult - ${ticketPrice(adult, isMonday)} рублей.")
    println ("Цена билета в кино для человека в возрасте $senior - ${ticketPrice(senior, isMonday)} рублей.")
    }
fun ticketPrice(age: Int,isMonday: Boolean): Int {
    return when(age) {
        in 0..12 -> 15
        in 13..60 -> if (isMonday) 25 else 30
        in 61..100 -> 20
        else -> -1
    }
}