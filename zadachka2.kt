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
    
}