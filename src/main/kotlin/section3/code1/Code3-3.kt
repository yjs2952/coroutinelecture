package info.coroutine.section3.code1

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit>(CoroutineName("runBlocking 코루틴")) {
    launch(Dispatchers.IO + CoroutineName("launch 코루틴 a")) {
        println("[${Thread.currentThread().name}] 작업1 실행")
    }
    launch(Dispatchers.IO + CoroutineName("launch 코루틴 b")) {
        println("[${Thread.currentThread().name}] 작업2 실행")
    }
    launch(Dispatchers.IO + CoroutineName("launch 코루틴 c")) {
        println("[${Thread.currentThread().name}] 작업3 실행")
    }
}

