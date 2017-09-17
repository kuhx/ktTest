import cloud.orbit.actors.Actor
import cloud.orbit.concurrent.Task

interface IServer : Actor {
    fun sayHello(greeting: String): Task<String>
}