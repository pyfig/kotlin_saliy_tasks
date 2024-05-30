open class Song(val title: String, val artist: String, val year: Int, val playCount: Int) {
    val popular: Boolean
        get() = playCount >= 1000

    fun printDesc() {
        val popularity = if (popular) "популярна" else "не популярна"
        println("$title исполнителя $artist была выпущена в $year . Это песня $popularity")
    }
}

fun main(){
    val song = Song("Как достать соседа", "Овсянкин", 2017, 254354)
    song.printDesc()
}