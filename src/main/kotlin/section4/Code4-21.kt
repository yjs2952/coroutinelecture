package info.coroutine.section4

import kotlinx.coroutines.*
import kotlinx.coroutines.launch

// 취소 요청은 했지만 취소 요청 확인 시점이 없어 취소 요청 중 상태로 남아있다
fun main() = runBlocking<Unit> {
    val whileJob: Job = launch(Dispatchers.IO) {
        while (true) {
            // 작업 실행
        }
    }
    whileJob.cancel() // 코루틴 취소 요청
    println(whileJob)
}
