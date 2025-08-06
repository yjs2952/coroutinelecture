package info.coroutine.section4

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// 생성 상태의 코루틴을 만들기 위해 지연 코루틴 생성
// 지연 코루틴이 start 되지 않았기 때문에 코루틴 상태는 생성 상태
fun main() = runBlocking<Unit> {
    val job: Job = launch(start = CoroutineStart.LAZY) {
        delay(1000L)
    }
    println(job)
}
