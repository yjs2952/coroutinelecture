package info.coroutine.section4

import kotlinx.coroutines.*
import kotlinx.coroutines.launch

// 코루틴 취소가 완료될 때 까지 대기 후 출력 - 취소 완료상태
fun main() = runBlocking<Unit> {
    val whileJob: Job = launch(Dispatchers.IO) {
        while (true) {
            yield() // 스레드 양보(일시 중단)
        }
    }
    whileJob.cancelAndJoin() // 코루틴 취소 완료 될 때 까지 대기
    println(whileJob)
}
