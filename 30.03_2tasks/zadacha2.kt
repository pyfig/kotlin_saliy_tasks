open class Song(val title: String, val artist: String, val year: Int, val playCount: Int) {
    val popular: Boolean
        // проверка на количество прослушиваний
        get() = playCount >= 1000
    // основная часть
    fun printDesc() {
        val popularity = if (popular) "ПОПУЛЯРНА" else "НЕ ПОПУЛЯРНА"
        println("$title В ИСПОЛНЕНИИ $artist БЫЛО ВЫПУЩЕНА в $year")
        // вариант с проверкой на популярность
        // println("$title В ИСПОЛНЕНИИ $artist БЫЛО ВЫПУЩЕНА в $year . ДАННАЯ КОМПОЗИЦИЯ $popularity")
    }
}


fun main() {
    val song = Song("Полиморфизм", "Научно-Технический рэп", 2019, 100500)
    song.printDesc()
}