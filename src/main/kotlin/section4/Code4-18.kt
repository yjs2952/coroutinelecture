package info.coroutine.section4

import kotlinx.coroutines.*
import kotlinx.coroutines.launch

// 코루틴 상태가 실행 중
fun main() = runBlocking<Unit> {
    val job: Job = launch {
        delay(1000L)
    }
    println(job)
}
