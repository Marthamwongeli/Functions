fun main() {
    greet("Mary")
    modulus(56,15)
    add(87,57,98,145)
    myFunfact("I love drawing and painting")
}
fun greet(name:String){
    var result= "Hello $name"
    println(result)
}
fun modulus(num1:Int,num2:Int){
    var result=num1%num2
    println(result)
}
fun add(a:Int,b:Int,c:Int,d:Int){
    var result=a+b+c+d
    println(result)

}
fun myFunfact(text: String){
    var result=text
    println(result)
}