package info.coroutine.section4

import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// 코루틴이 완료될 때 까지 대기 후 출력 했기 때문에 완료 상태
// join 함수를 사용하면 runBlocking 코루틴이 launch 코루틴이 완료될 때 까지 일시 중단된다
fun main() = runBlocking<Unit> {
    val job: Job = launch {
        delay(1000L)
    }
    job.join()
    println(job)
}
