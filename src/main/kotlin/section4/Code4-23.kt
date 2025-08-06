package info.coroutine.section4

import kotlinx.coroutines.*
import kotlinx.coroutines.launch

// 지연 코루틴이 실행 요청되기 전이므로 코루틴 상태는 생성 상태
fun main() = runBlocking<Unit> {
    val job: Job = launch(start = CoroutineStart.LAZY) {
        delay(1000L)
    }
    println(job)
    printJobState(job)
}

private fun printJobState(job: Job) {
  println(
    "Job State\n" +
        "isActive >> ${job.isActive}\n" +
        "isCancelled >> ${job.isCancelled}\n" +
        "isCompleted >> ${job.isCompleted} "
  )
}
