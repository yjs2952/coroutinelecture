package info.coroutine.section4

import kotlinx.coroutines.*
import kotlinx.coroutines.launch

fun main() = runBlocking<Unit> {
    val startTime = System.currentTimeMillis()
    val longJob: Job = launch(Dispatchers.Default) {
        repeat(10) { repeatTime ->
            delay(1000L) // 1000밀리초 대기
            println("[${getElapsedTime(startTime)}] 반복횟수 ${repeatTime}")
        }
    }
    delay(2500L) // 2500밀리초 대기
    longJob.cancel() // 취소
}
