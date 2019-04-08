package HI1

class Lexer(val text: String){
    var currentPos: Int = 0
    var currentChar:Char = initChar()

    fun initChar() :Char {
        if (text.length > currentPos) {
            return text[currentPos]
        } else {
            return 0.toChar()
        }
    }

    
}

