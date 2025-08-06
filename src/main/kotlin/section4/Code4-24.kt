package info.coroutine.section4

import kotlinx.coroutines.*
import kotlinx.coroutines.launch

// 코루틴 실행 중인 1초 동안 출력을 하기 때문에 코루틴 실행 중 상태
fun main() = runBlocking<Unit> {
    val job: Job = launch {
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
