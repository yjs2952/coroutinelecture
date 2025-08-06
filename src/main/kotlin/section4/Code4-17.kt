package info.coroutine.section4

import kotlinx.coroutines.*
import kotlinx.coroutines.launch

// yield()를 사용하여 코루틴 취소 확인
fun main() = runBlocking<Unit> {
    val whileJob: Job = launch(Dispatchers.Default) {
        while (isActive) {
            println("작업 중")
        }
    }
    delay(100L) // 100밀리초 대기
    whileJob.cancel() // 코루틴 취소
}
