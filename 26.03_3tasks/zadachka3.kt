fun main() {
    val people = 6
payingPeople(people)
}
fun payingPeople(countPeople: Int) {
    when(countPeople){
        in 1..5 -> println("Стоимость аренды на $countPeople = ${countPeople * 1000} рублей")
        in 5..7 -> println("Стоимость аренды на $countPeople = ${countPeople * 800} рублей")
        in 7..1000 -> println ("Стоимость аренды на $countPeople = ${countPeople * 500} рублей")
    }
}