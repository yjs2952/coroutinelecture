package info.coroutine.section4

import kotlinx.coroutines.*
import kotlinx.coroutines.launch

// 취소 완료 요청 후 취소 완료될 때 까지 대기 출력하므로 코루틴 취소 완료 상태
// isCancelled 상태가 true 가 된다
// isCompleted 상태가 true 가 된다
fun main() = runBlocking<Unit> {
    val whileJob: Job = launch(Dispatchers.IO) {
        while (true) {
            yield()
        }
    }
    whileJob.cancelAndJoin() // 코루틴 취소 요청
    println(whileJob)
    printJobState(whileJob)
}

private fun printJobState(job: Job) {
    println(
        "Job State\n" +
                "isActive >> ${job.isActive}\n" +
                "isCancelled >> ${job.isCancelled}\n" +
                "isCompleted >> ${job.isCompleted} "
    )
}

