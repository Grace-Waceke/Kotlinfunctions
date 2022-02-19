fun main() {
    salutation("dylan")
    var result = add (23,34,67,98)
    println(result)
    var  x = interesting("i am beautiful")
    println(x)


}
fun salutation(name:String){
    println ("Hello $name")
    var y =  theremainder (50,7)
    println(y)
}
fun add (a:Int,b:Int,c:Int,d:Int):Int {
    var sum = a+b+c+d
    return sum

}
fun interesting (fact:String):String {
    var funFact = ("$fact")
    return funFact


}
fun theremainder(no1:Int, no2:Int): Int {
        var modulus = no1 % no2
        return modulus

}




