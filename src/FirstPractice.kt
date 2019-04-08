class FirstPractice {
    // 기본 function
    fun double(number: Int): Int {
        return number * 2
    }

    // Unit리턴타입은 Java의 Void와 동일함
    fun printDouble(number: Int): Unit {
        println("PrintDouble result is ${number *2}")
    }

    // null을 사용하려면 타입에 ?를 붙여야함(Parameter타입, return타입 둘 다. 안붙이면 컴파일에러)
    // return이 null이 가능한 경우 return 받아서 사용할 때 null체크 안하면 컴파일 에러
    fun message(message: String): String? {
        if (message.length < 15) {
            return message
        }
        return null
    }

    // is로 타입이 확인되면 알아서 그 타입에 맞게 처리해준
    fun getStringLength(obj: Any): Int {
        if (obj is String) {
            return obj.length
        }
        return 0
    }

    fun printNumList() {
        val numbers = listOf(1, 2, 3, 4, 5)

        // 기본 반복문
        for (number in numbers) {
            print("$number ")
        }
        println()

        // 배열 위치를 사용하고 싶을 경우
        for (i in numbers.indices) {
            print("${numbers[i]} ")
        }
        println()
    }

    fun printParamType(obj: Any) {
        when (obj) {
            is Int -> println("Param is Int")
            is Long -> println("Param is Long")
            is String -> println("Param is String")
            else -> println("Param is something else")
        }
    }

    // 내용 변경 가능한 List를 생성하려면 mutableListOf를 사용해야함
    fun printStringList() {
        val mutableList = mutableListOf("apple", "banana", "strawberry")

        mutableList
                .filter { str -> mutableList.indexOf(str) < 2 }
                .map { str -> "${mutableList.indexOf(str)+1} : $str" }
                .forEach { str -> println(str) }
    }
}