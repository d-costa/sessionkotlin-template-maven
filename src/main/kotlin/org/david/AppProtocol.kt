package org.david

import com.github.sessionkotlin.lib.dsl.SKRole
import com.github.sessionkotlin.lib.dsl.globalProtocol


fun main() {
    val a = SKRole("Alice")
    val b = SKRole("Bob")

    globalProtocol("ExampleProtocol", callbacks = true) {
        send<Int>(a, b, "Val1")
        send<Int>(b, a, "Val2")
    }
}
