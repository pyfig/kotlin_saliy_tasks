fun main() {
    val morningNotification = 51
    val eveningNotification = 135
    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
    }
    fun printNotificationSummary(numberOfMessages: Int) {
        when(numberOfMessages){
            in 0..100 -> println("You have $numberOfMessages")
            in 100..99999 -> println("Your phone is blowing up! You have 99+ notifications")
        }
        
    }
    