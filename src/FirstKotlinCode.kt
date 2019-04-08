// Kotlin의 main함수는 class 내부에 선언하지 않는다
fun main(args: Array<String>) {
    println("Hello Kotlin")

    val firstPractice = FirstPractice()
    val doubleResult = firstPractice.double(2)

    println("Double result is ${doubleResult}")

    firstPractice.printDouble(4)

    //firstPractice의 message함수 리턴이 null 허용이기 때문에
    //리턴값으로 String의 다른 함수를 사용하려 하면 컴파일 에러남
    println(firstPractice.message("message Test"))

    firstPractice.printNumList()

    firstPractice.printParamType("some")
    firstPractice.printParamType(1)
    firstPractice.printParamType(1.1)

    firstPractice.printStringList()
}
