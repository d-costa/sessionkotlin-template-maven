package org.david

import com.github.d_costa.sessionkotlin.dsl.SKRole
import com.github.d_costa.sessionkotlin.dsl.globalProtocol


fun main() {
    val a = SKRole("Alice")
    val b = SKRole("Bob")

    globalProtocol("ExampleProtocol", callbacks = true) {
        send<Int>(a, b, "Val1")
        send<Int>(b, a, "Val2")
    }
}
