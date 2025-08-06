package info.coroutine.section3.code1

import kotlinx.coroutines.*
import kotlinx.coroutines.launch

fun main() = runBlocking<Unit> {
    val imageProcessingDispatcher = Dispatchers.Default.limitedParallelism(2)
    repeat(50) {
        launch(imageProcessingDispatcher) {
            Thread.sleep(1000L) // 이미지 처리 작업
            println("[${Thread.currentThread().name}] 이미지 처리 완료")
        }
    }
}
