package info.coroutine.section4

import kotlinx.coroutines.*
import kotlinx.coroutines.launch

// 코루틴 블럭 내에 코루틴 취소 확인 시점이 있으므로 100ms 후에 작업이 취소됨
fun main() = runBlocking<Unit> {
    val whileJob: Job = launch(Dispatchers.Default) {
        while (true) {
            println("작업 중")
            delay(1L)   // 취소 확인이 되긴 하지만 while 문 돌때 마다 1ms 씩 계속 딜레이 되어 불필요한 지연이 생긴다
        }
    }
    delay(100L) // 100밀리초 대기
    whileJob.cancel() // 코루틴 취소
}
