package HI1

enum class TokenType {
    Integer,

    // 사칙연산
    Plus,
    Minus,
    Mul,
    Div,

    // 토큰이 더 이상 없을 때 반환하는 타입
    EOF,
}

class Token(integer:Long?, type:TokenType) {
}