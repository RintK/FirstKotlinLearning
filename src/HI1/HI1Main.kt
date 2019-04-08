package HI1/*
참고 사이트 : https://hybridcompiler.blogspot.com/2019/03/blog-post.html
참고 사이트에서 설명하는 C#으로 제작된 사칙연산 Interpreter를 Kotlin 버전으로 변환
console에서 입력을 기다리다가 간단한 사칙연산이 들어오면 결과를 출력
입력값이 없으면 종료
입력값이 양식에 맞지 않으면 종료
*/
fun main(args: Array<String>) {
    var text:String

    while (true) {
        text = input()
        if (text.isNullOrBlank()) {
            break
        } else {
            println(text)
        }

    }
}

private fun input(): String{
    print("> ")
    return readLine()!!
}