package info.coroutine.section4

import kotlinx.coroutines.*
import kotlinx.coroutines.launch

// 실행 요청되는 부분이 없어 아무것도 안함
fun main() = runBlocking<Unit> {
    val startTime = System.currentTimeMillis()
    val lazyJob: Job = launch(start = CoroutineStart.LAZY) {
        println("[${getElapsedTime(startTime)}] launch 코루틴 실행")
    }
    delay(3000)
    lazyJob.join() // 코루틴을 시작합니다.
}
