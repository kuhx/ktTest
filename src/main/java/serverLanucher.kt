/**
 * Created by kuhx on 2017/9/17.
 */

import cloud.orbit.actors.Actor
import cloud.orbit.actors.Stage

fun main(args: Array<String>) {
    // Create and bind to an orbit stage
    val stage = Stage.Builder().clusterName("orbit-hello_world-cluster").build()
    stage.start().join()
    stage.bind()

    // Send a message to the actor
    val server = Actor.getReference(IServer::class.java, "hi")
    val response = server.sayHello("fuck!!!").join()
    println(response)

    // Shut down the stage
    stage.stop().join()
}