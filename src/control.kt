fun main() {
println(isEven(23))
    println(isEven(40))

   var kiosk=Shop("mango",12.21,30.00,"grocery")
    var market=Shop("geisha",5.60,100.00,"hygiene")
  kiosk.checkProduct()
  market.checkProduct()

    println(names("matishoi"))

    println(kiosk(arrayOf("apple","kiwi","orange","pineapple","banana")))
}
fun isEven(number:Int):Boolean{
    if (number%2 == 0){
      return true
    }
    else{
        return false
    }
}
data class Shop (val name:String,val weight:Double,val price:Double,val category:String){
fun checkProduct(){
   var grocery:MutableList<String> = mutableListOf<String>()
    var hygiene:MutableList<String> = mutableListOf<String>()
    var other:MutableList<String> = mutableListOf<String>()
    when(category){
        "grocery" -> println(mutableListOf("$name","$category"))
       "hygiene" -> println(mutableListOf("$name", "$category"))
        else -> println("otherList")
    }

}
}
fun names(name:String):String {
    var letter = ""
    for (word in name) {
        if (name.indexOf(word) % 2 == 0) {
            letter += word
        }
    }
    return letter
}
fun kiosk (fruits:Array<String>):MutableList<String>{
    var longFruitList= mutableListOf<String>()
    for (fruit in fruits){
        if (fruit.length%2==0){
            longFruitList.add(fruit)
        }
    }
    return longFruitList
}
