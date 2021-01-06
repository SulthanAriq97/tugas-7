fun main() {

    val dinda: Human = Human("Dinda Wahyuning Wulan")
    val sulthan: Human = Human("Sulthan Ariq")

    dinda.email = "dinda@gmail.com"
    dinda.address = "Ngawi, Jawa Timur"

    sulthan.email = "sulthan@gmail.com"
    sulthan.address = "Pontianak, Kalimantan Barat"

    dinda.introduce()
    dinda.talk()
    println(dinda.verify("dinda@gmail.com"))

    sulthan.introduce()
    sulthan.talk()
    println(sulthan.verify("dinda@gmail.com"))

    println(MADA.name)

    val m : MADA = MADA
    println(m.nationality)

}