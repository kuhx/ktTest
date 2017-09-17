import cloud.orbit.actors.runtime.AbstractActor
import cloud.orbit.concurrent.Task

class Server() : AbstractActor<Any>(), IServer {
    override fun sayHello(greeting: String): Task<String> {
        println("Here: " + greeting)
        return Task.fromValue("You said: $greeting, I say: Hello from ${System.identityHashCode(this)}!")
    }

    init {
        println("为什么就构造了呢？")
    }
}