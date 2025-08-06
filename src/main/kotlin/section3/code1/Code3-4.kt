package info.coroutine.section3.code1

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit>(CoroutineName("runBlocking 코루틴")) {
    launch(Dispatchers.IO + CoroutineName("launch 부모 코루틴")) {
        launch(CoroutineName("launch 자식 코루틴 1")) {
            println("[${Thread.currentThread().name}] 작업1 실행")
        }
        launch(CoroutineName("launch 자식 코루틴 2")) {
            println("[${Thread.currentThread().name}] 작업2 실행")
        }
        launch(CoroutineName("launch 자식 코루틴 3")) {
            println("[${Thread.currentThread().name}] 작업3 실행")
        }
    }
}

