package info.coroutine.section1.code2

class ExampleThread : Thread() {
    override fun run() {
        println("[${Thread.currentThread().name}] 시작")
        Thread.sleep(2000)
        println("[${Thread.currentThread().name}] 종료")
    }
}

fun main() {
    println("[${Thread.currentThread().name}] 시작")
    val thread = ExampleThread()
    Thread.sleep(1000)
    println("[${Thread.currentThread().name}] 종료")
}
