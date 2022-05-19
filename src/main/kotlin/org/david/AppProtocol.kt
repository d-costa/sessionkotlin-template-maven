package org.david

import com.github.d_costa.sessionkotlin.dsl.SKRole
import com.github.d_costa.sessionkotlin.dsl.globalProtocol


fun main() {
    val a = SKRole("Alice")
    val b = SKRole("Bob")

    globalProtocol("ExampleProtocol", callbacks = true) {
        send<Int>(a, b, "val1")
        send<Int>(b, a, "val2")
    }
}
