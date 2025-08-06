package info.coroutine.section4

import kotlinx.coroutines.*
import kotlinx.coroutines.launch

fun main() = runBlocking<Unit> {
    val longJob: Job = launch(Dispatchers.Default) {
        Thread.sleep(1000L) // sleep은 스레드를 블록킹하기 때문에 코루틴을 일시 중단하지 않음 아래 print 문 까지 실행 되고서야 중단됨
        println("longJob 코루틴의 동작")
    }
    longJob.cancelAndJoin() // longJob 취소 요청
    executeAfterJobCancelled() // 취소 후 실행돼야 하는 동작
}
