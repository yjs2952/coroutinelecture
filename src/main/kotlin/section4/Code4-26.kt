package info.coroutine.section4

import kotlinx.coroutines.*
import kotlinx.coroutines.launch

// 취소 요청은 했지만 취소 요청 확인 시점이 없어 취소 요청 중 상태로 남아있다
// isCancelled 상태가 true 가 된다
fun main() = runBlocking<Unit> {
    val whileJob: Job = launch(Dispatchers.IO) {
        while (true) {
            // 작업 실행
        }
    }
    whileJob.cancel() // 코루틴 취소 요청
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

