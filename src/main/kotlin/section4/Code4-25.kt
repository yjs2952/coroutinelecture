package info.coroutine.section4

import kotlinx.coroutines.*
import kotlinx.coroutines.launch

// 코루틴이 실행 완료 후 출력 했기 때문에 코루틴 완료 상태
fun main() = runBlocking<Unit> {
    val job: Job = launch {
        delay(1000L)
    }
    job.join()
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
