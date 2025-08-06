package info.coroutine.section4

import kotlinx.coroutines.*
import kotlinx.coroutines.launch

fun main() = runBlocking<Unit> {
    val job: Job = launch {
        println("[${Thread.currentThread().name}] 실행")
    }
}
