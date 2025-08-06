package info.coroutine.section3.code1

import kotlinx.coroutines.*
import kotlinx.coroutines.launch

fun main() = runBlocking<Unit> {
    val dedicatedDispatcher = Dispatchers.IO.limitedParallelism(2)
    repeat(100) {
        launch(dedicatedDispatcher) {
            println("[${Thread.currentThread().name}] 중요 작업 실행")
        }
    }
}
