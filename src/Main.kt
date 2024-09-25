//fun main() {
//  printMyData()
//}
//var i = 0
//fun printMyData(){
//    i++
//    println("Hello")
//    if (i<5) {
//
//        printMyData()
//    }
//}


//fun main() {
//    println("Enter number1 : ")
//    val num1:Int = readLine()!!.toInt()
//    println("Enter number2 : ")
//    val num2:Int = readLine()!!.toInt()
//
//    val Sub:Int =  num1 - num2
//
//    val Addition:Int =  num1 + num2
//    println("Sub: $Sub \nAddition: $Addition")
//}

//fun main() {
//    print("for (i in 5 downTo 1) print(i) = ")
//    for (i in 5 downTo 1) print(i)
//
//    println()
//
//    print("for (i in 1..5 step 2) print(i) = ")
//    for (i in 1..5 step 2) print(i)
//
//    println()
//
//    print("for (i in 5 downTo 1 step 2) print(i) = ")
//    for (i in 5 downTo 1 step 2) print(i)
//
//}

//fun main() {
//
//    var language = arrayOf("Ruby", "Kotlin", "Python" ,"Java")
//    for (item in language.indices){
//        if (item%2 == 0)
//        println(" $language[i]")
//    }
//}

//fun main() {
//    var text = "Kotlin"
//    for (letter in text){
//        println(letter)
//    }
//}
//fun main() {
//    var text = "Kotlin"
//
//    for (item in text.indices){
//        println(text[item])
//    }
//}

//fun main() {
//    var i = 1
//    while (i<=5) {
//        println("Line $i")
//        i++
//    }
//}

//fun main() {
//    var sum = 0
//    var i = 100
//    while (i != 0){
//        sum += i
//        --i
//    }
//    println("Sum = $sum")
//}

//fun main() {
//    var sum =  0
//    var input:String
//
//    do {
//        println("Enter a integer: ")
//        input = readln()!!
//        sum += input.toInt()
//
//    }while (input != "0")
//    println("Sum = $sum")
//}
//fun main() {
//    println( "Enter your marks: ")
//    var marks = readln()!!.toInt()
//
//    when(marks){
//        in 80..100->
//            println("A+")
//        in 70..79 ->
//            println("A")
//        in 60..69 ->
//            println("A-")
//        in 50..59 ->
//            println("B")
//        in 40..49 ->
//            println("C")
//        in 33..49 ->
//            println("D")
//        else->
//            println("F")
//    }
//
//
//}
//
//fun main() {
//    println("Enter a number1")
//    val a = readln()!!.toInt()
//    println("Enter a number2")
//    val b = readln()!!.toInt()
//    println("Enter operator either +, -, * or /")
//    val operator = readLine()
//
//    when(operator){
//        "+" -> println("$a + $b = ${a + b}")
//        "-" -> println("$a + $b = ${a - b}")
//        "*" -> println("$a + $b = ${a * b}")
//        "/" -> println("$a + $b = ${a / b}")
//        else -> println("$operator is invalid")
//    }
//}

// Funcation

//fun main() {
//    var res = add()
//    println(res)
//    println("End of execution")
//
//}
//fun add():Int {
//    println("Enter number1: ")
//    val a = readln()!!.toInt()
//    println("Enter number1: ")
//    val b = readln()!!.toInt()
//    val result = a + b
//    return result
//
//}

//fun main() {
//    val res:Int = add(5,10)
//    println(res)
//}
//fun add(a:Int,b:Int):Int {
//   val c:Int = a + b
//    return c
//}


//fun main() {
//    myData()
//}
//var i = 0
//fun myData() {
//    println("Hello")
//    i++
//    if (i<5){
//        myData()
//    }
//
//
//}

//fun main() {
//    val myRes = recSum(5000,0)
//    println(myRes)
//
//}
//
//fun recSum(i:Long, j:Long):Long {
//    return if (i< 1){
//        j
//    }else{
//        recSum(i-1,i+j)
//    }
//
//
//}


//fun main() {
//    mytestingFuncation(myRoll = 10, myName = "Twake")
//}
//fun mytestingFuncation(myName:String= "", myRoll:Int = 0) {
//
//    println("Name: $myName, Roll: $myRoll")
//
//}


//fun main() {
//    val res1 = sumValues(4,7)
//    println(res1)
//
//    // lambda function
//    sumValues2(4,7){res->
//        println(res)
//    }
//    // lambda function
//    sumValues3(4, myOutput ={
//        println(it)
//    },7)
//
//    sumValues4(4, myOutput = {myRes, myMessage->
//        println("Result: $myRes, Message: $myMessage")
//    },7)
//
//    sumValues5(4, myOutput = {myRes,myMessage->
//        println("Result: $myRes, Message: $myMessage")
//        myRes+10
//    },7)
//
//}
////Normal function
//fun sumValues(i:Int, j:Int):Int {
//    return i + j
//}
//
//// Higher order function (lambda as a last parameter)
//fun sumValues2(i:Int,j:Int, myOutput:(Int)->Unit) {
//    val r = i + j
//    myOutput(r)
//
//}
//
//// Higher order function (lambda before last parameter)
//fun sumValues3(i:Int, myOutput: (Int) -> Unit, j:Int) {
//    var r = i + j
//    myOutput(r)
//
//}
//// Higher order function (lambda with multiple  parameter)
//fun sumValues4(i:Int, myOutput: (Int,String) -> Unit, j:Int) {
//    var r = i + j
//    myOutput(r, "Operation successful")
//
//}
//// Higher order function (lambda with non-Unit parameter)
//fun sumValues5(i:Int, myOutput: (Int,String) -> Int, j:Int) {
//    var r = i + j
//    val res = myOutput(r, "Operation successful")
//    println(res)
//
//}
// inline
// crossinline
// noinline
//fun main() {
//
//    sumValues(
//        3,
//        4,
//        myOuter = {
////            println(it)
////            if (it < 10){
////                return
////            }
//
//            println("Done")
//
//        },
//        myOuter2 = {
//            println(it)
//        }
//    )
//
//}
//
//inline fun sumValues(i:Int,
//              j:Int,
//              crossinline myOuter:(Int)->Unit,
//              noinline myOuter2: (Int) -> Unit)
//{
//
//    val r = i + j
//    myOuter(r)
//    myOuter2(r + 2)
//
//}


// প্রিডিকেট ফাংশন
//fun main() {
//
//    val numbers = listOf(1, 2, 3)
//    val filteredData: List<Int> = numbers.filter { getNumber(it) }
//    println(filteredData)
//
//}
//
//// প্রিডিকেট ফাংশন
//fun getNumber(x: Int): Boolean {
//    return x % 2 != 0
//}

// String

//fun main() {
//    val chArray:CharArray = charArrayOf('T','w','a','k','e')
//    val myString1:String = String(chArray)
//    println(myString1)
//
//    val myCountry: String = "Bangladesh"
//    println("$myCountry is our country.")
//    println("We need ${myCountry.length} letters to write the name of our country")
//
//
//    val myString2:String = """
//        Welcome to
//        Bnagladesh
//    """.trimIndent()
//    println(myString2)
//}

// String part 2

//fun main() {
//    val mySrt1:String = "Bangladesh"
//    val mySrt2:String = "Bangladesh"
//    val res:Boolean = mySrt1 == mySrt2
//    println(res)
//
//    //String property
//    val myLen:Int = mySrt1.length
//    val myInd:IntRange = mySrt2.indices
//    val myLastInd:Int = mySrt1.lastIndex
//    println(myLen)
//    println(myInd)
//    println(myLastInd)
//}

// String part 3
//
//fun main() {
//
//    val myCountry:String = "Bangladesh"
//
//    val myConties:Boolean = myCountry.contains("ban",true)
//    println(myConties)
//    val myCount:Int = myCountry.count()
//    println(myCount)
//
//    val mySubString:CharSequence = myCountry.subSequence(6,10)
//    println(mySubString)
//
//    val myChar:Char = myCountry.get(3)
//    println(myChar)
//    val myChar2:Char = myCountry.get(4)
//    println(myChar2)
//
//    val myPlus:String = myCountry.plus(123)
//    println(myPlus)
//
//    val myCompare:Int = myCountry.compareTo("bangladesh",true)
//    println(myCompare)
//
//
//
//}

//String part 4

//fun main() {
//    val myCountry:String = "Bangladesh"
////    val myDropString:String = myCountry.drop(3)
//    val myLastDropString:String = myCountry.dropLast(6)
////    println(myDropString)
//    println(myLastDropString)
//    val myElement:Char = myCountry.elementAt(5)
//    println(myElement)
//
//    val myIndOf:Int = myCountry.indexOf('n')
//    println(myIndOf)
//
//    val mySrtReplace:String = myCountry.replace("desh","country")
//    println(mySrtReplace)
//
//    val mySub1:String = myCountry.substring(3)
//    println(mySub1)
//    val mySub2:String = myCountry.substring(3,6)
//    println(mySub2)
//
//    val myStartWith:Boolean = myCountry.startsWith("bang",true)
//    println(myStartWith)
//    val myEndstWith:Boolean = myCountry.startsWith("desh",true)
//    println(myEndstWith)
//
//    val myName:String = "twake"
//    val myCapName:String = myName.capitalize()
//    println(myName)
//
//    val mySrt1:String ="Md. Mowahibur Rahman Twake"
//    val mySameSe:String = mySrt1.toLowerCase()
//    println(mySameSe)
//    val mySameSe2:String = mySrt1.decapitalize()
//    println(mySameSe2)
//
//
//}

// String part 5

//fun main() {
//    val myCountry:String = " "
//    val myCheck:Boolean = myCountry.isBlank() // Consider white space as blank
//    println(myCheck)
//
//    val myCheck2:Boolean = myCountry.isEmpty() // Consider white space as not empty
//    println(myCheck2)
//
//    val mySrt:String ="ae"
//    val myCheck3:Boolean = mySrt.isNullOrEmpty()
//    println(mySrt)
//
//    val myStr2: String = "abcdef"
//    val myRevStr: String = myStr2.reversed()
//    println(myRevStr)
//
//    val myValue: String = "%.2f".format(7.8749078484994)
//    println(myValue)
//
//
//
//}

// Exception Handling
// try
//catch
//finally
//throw
//fun main() {
//
//    val myArr: IntArray = intArrayOf(2,1,3,33)
//    val myNumber:Int = 7
//    try {
//        println(myArr[4])
//        val result:Int = myNumber / 2
//        println(result)
//    }catch (ex:ArithmeticException){
//        ex.printStackTrace()
//        println("Something Wrong ${ex.message}")
//    }
//
//    catch (e:ArithmeticException){
//        e.printStackTrace()
//        println("Arithmetic exception.... ${e.message}")
//    } catch (e: ArrayIndexOutOfBoundsException){
//        e.printStackTrace()
//        println("Array index exception... ${e.message}")
//    }finally {
//        println("Finally done!")
//    }
//
//    println("The end")
//
//}

//fun main() {
//
//    try {
//        sumData(2,8)
//    }catch (e: Exception){
//        e.printStackTrace()
//    }
//    println("End ---")
//}
//
//fun sumData(i:Int, j:Int) {
//
//    if (i<5){
//        throw MyNewException("Very small number!")
//    }
//
//
//    val r = i +j
//    println(r)
//}
//
//class MyNewException(a:String):Exception(a){
//
//}

//fun main() {
//    val myRange1:CharRange = 'c'..'h'
//    val myRange2:IntRange = 1..9
//    val myRange3:LongRange = 4L..8
//
//    myRange1.forEach{
//        println(it)
//    }
//    for (i in myRange2){
//        println(i)
//    }
//    myRange3.forEachIndexed { index, l ->
//        println(l)
//    }
//}


//fun main() {
//
//
////    for (j in 8 downTo 2){
////        println(j)
////    }
////    for (k in 1 until 5){
////        println(k)
////    }
//    for (i in 1..9 step 2){
//        println(i)
//    }
//    for (i in 9 downTo 1 step 2){
//        println(i)
//    }
//}

// kotlin rang iterator

//fun main() {
//    val mChar:CharRange = 'a'.. 'e'
//    val c:CharIterator = mChar.iterator()
//    while (c.hasNext()){
//        val i:Char = c.next()
//        println(i)
//    }
//}

//

//fun main() {
//    var myList:List<String> = listOf<String>("Apple", "Dell", "Apple", "Samsung", "Asus")
//    var myList2:List<String> = listOf<String>("Apple","Samsung","HP")
//    val myList3: List<String> = listOf<String>()
//
//
//    myList.forEach {
//        println(it)
//    }
//    println("_______________________________________________")
//
//    val a:Boolean = myList.contains("Dell")
//    println(a)
//    println("_______________________________________________")
//    val ca:Boolean = myList.containsAll(myList2)
//    println(ca)
//    println("_______________________________________________")
//    val abc:String = myList[2]
//    println(abc)
//    println("_______________________________________________")
//
//    val i:Int = myList.lastIndexOf("Apple")
//    println(i)
//    println("_______________________________________________")
//
//    val dc: Boolean = myList3.isEmpty()
//    println(dc)
//
//    println("-------------")
//
//    val myNewList: List<String> = myList.subList(2, 5)
//    myNewList.forEach {
//        println(it)
//    }
//}

//
//fun main() {
//    val myList: List<String> = listOf<String>("Apple", "Dell", "Apple", "Samsung", "Asus")
//    val nl:List<String> =myList.drop(2)
//    nl.forEach {
//        println(it)
//    }
//    println("---------------")
//
//    val nl2:List<String> = myList.dropLast(2)
//    nl2.forEach {
//        println(it)
//    }
//    println("---------------")
//
//    val mi = myList.iterator()
//    while (mi.hasNext()){
//        println(mi.next())
//    }
//    println("---------------")
//
//    val li = myList.listIterator(1)
//    while (li.hasNext()){
//        println(li.next())
//    }
//
//}

//fun main() {
//
//    val mySet: Set<Any> = setOf<Any>(1, 3, 5, "Apple", "Microsoft", "Dell", "Apple", "HP")
//    val mySet2: Set<Any> = setOf<String>("Apple", "Microsoft", "Dell")
//
//    for (i in mySet) {
//        println(i)
//    }
//
//    println("--------------1")
//
//    mySet.forEach {
//        println(it)
//    }
//
//    println("--------------2")
//
//    println(mySet.contains("Microsoft"))
//
//    println("--------------3")
//
//
//    println(mySet.containsAll(mySet2))
//
//    println(mySet.isEmpty())
//
//    println("--------------4")
//
//    val ite = mySet.iterator()
//    while (ite.hasNext()) {
//        println(ite.next())
//    }
//
//    println("--------------5")
//
//    val dro = mySet.drop(3)
//    dro.forEach {
//        println(it)
//    }
//    println("--------------6")
//
//    println(mySet.indexOf("Apple"))
//
//    println("--------------7")
//
//    val rev = mySet.reversed()
//    rev.forEach {
//        println(it)
//    }
//
//    println("--------------8")
//
//    mySet.forEachIndexed { index, any ->
//        println("Index: $index - Data: $any")
//    }
//
//
//}

fun main() {

    val mySet: MutableSet<Any> = mutableSetOf<Any>(1, 3, 5, "Apple", "Microsoft", "Dell", "Apple", "HP")
    val mySet1: MutableSet<Any> = mutableSetOf<Any>("Samsung", 99, 33)

    mySet.forEach {
        println(it)
    }
    println("------------------1")

    mySet.add("Asus")

    mySet.forEach {
        println(it)
    }

    println("------------------2")

    mySet.clear()

    mySet.addAll(mySet1)

    mySet.forEach {
        println(it)
    }

    println("------------------3")

    mySet.remove(99)
//    mySet.removeAll(mySet1)

    mySet.forEach {
        println(it)
    }

}







