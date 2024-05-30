open class Phone(var isScreenLightOn: Boolean = false) {
    open fun switchOn() {
        isScreenLightOn = true
    }

    open fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(isScreenLightOn: Boolean = false, var isFolded: Boolean = false) : Phone(isScreenLightOn) {

    override fun switchOn() {
        if (!isFolded) {
            super.switchOn()
        }
    }

    override fun switchOff() {
        super.switchOff()
    }

    fun fold() {
        isFolded = true
        switchOff() 

    fun unfold() {
        isFolded = false
    }

    fun checkFoldablePhoneStatus() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        val phoneFoldStatus = if (isFolded) "folded" else "unfolded"
        println("The phone screen's light is $phoneScreenLight and the phone is $phoneFoldStatus.")
    }
}

fun main() {
    val myPhone = FoldablePhone()

    // Проверяем начальное состояние
    myPhone.checkPhoneScreenLight() // Должно быть "The phone screen's light is off."

    // Включаем экран (телефон сложен)
    myPhone.switchOn()
    myPhone.checkPhoneScreenLight() // Должно быть "The phone screen's light is off."

    // Раскладываем телефон
    myPhone.unfold()

    // Включаем экран (телефон раскрыт)
    myPhone.switchOn()
    myPhone.checkPhoneScreenLight() // Должно быть "The phone screen's light is on."

    // Снова складываем телефон
    myPhone.fold()

    // Проверяем состояние после складывания
    myPhone.checkPhoneScreenLight() // Должно быть "The phone screen's light is off."
}
