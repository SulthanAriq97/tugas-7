fun main() {
    //variabel
    val firstname1 = "Dinda"
    val lastname1 = "Wahyuning Wulan"
    val age1 = 20

    println(firstname1)
    println(lastname1)
    println(age1)

    // array
    val firstname = arrayListOf<String>()
    val lastname = arrayListOf<String>()
    val age = arrayListOf<Int>()

    firstname.add("Dinda")
    lastname.add("Wahyuning Wulan")
    age.add(20)

    firstname.add("Sulthan")
    lastname.add("Ariq")
    age.add(20)

    for (first in firstname) {
        println(first)
    }
    for (last in lastname) {
        println(last)
    }
    for (umur in age) {
        println(umur)
    }

    // array v2

    val dindaArray = arrayListOf<Any>()
    dindaArray.add("Dinda")
    dindaArray.add("Wahyuning Wulan")
    dindaArray.add(20)
    for ( dinda in dindaArray)
        println(dinda)

    val sulthanArray = arrayListOf<Any>()
    sulthanArray.add("Sulthan")
    sulthanArray.add("Ariq")
    sulthanArray.add(20)
    for ( sulthan in sulthanArray )
        println(sulthan)

    // array v3

    val namaArray = arrayListOf<ArrayList<Any>>()
    namaArray.add(dindaArray)
    namaArray.add(arrayListOf("Sulthan", "Ariq", 20))
for (item in namaArray) {
    for ( i in item) {
        println(i)
    }
}
    //data class
    val dinda = User("Dinda", "Wahyuning Wulan", 20)
    val Sulthan = User("Sulthan", "Ariq", 20)
    val abi = User()
    abi.age = 12
    abi.firstname = "Azzriel"

    println(dinda)
    println(Sulthan)
    println(abi)

    // data class array
    val mhsAmikom = arrayListOf<User>()
    mhsAmikom.add(dinda)
    mhsAmikom.add(Sulthan)
    mhsAmikom.add(abi)

    mhsAmikom.add(User("Ayu", "Fahira", 20))
    for (mhs in mhsAmikom)
        println(mhs)
}