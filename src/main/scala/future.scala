/**
  * Concurrencia utilizando futuros.
  * 
  * La concurrencia utilizando futuros evita que el flujo se bloqueé al momento
  * de realizar algun proceso que requiera esperar a algún otro recurso
  * 
  * Para resolver un future, se puede realizar utilizando Await.result o
  * utilizando <Future>.onComplete()
  */

import scala.io.Source
import scala.concurrent.{Future, Await, ExecutionContext}
import scala.concurrent.duration.Duration
import scala.util.Success
import scala.util.Failure

object future extends App {
    implicit val ec = ExecutionContext.global

    def futureMethod(): Future[String] = Future{
        Thread.sleep(3000)
        "This is a future method showing in 3 seconds using await"
    }

    val responseFuture = Await.result(futureMethod(), Duration.Inf)
    println(responseFuture)
    println("After this!")

    println("====================================================================")
    def fetchDataFrom(url: String, waitTime: Long = 0L): Future[String] = Future {
        Thread.sleep(waitTime)
        Source.fromURL(url).getLines().mkString
    }

    val response = fetchDataFrom("http://x.com").onComplete({
        case Success(_) => println("This line is executed when petition is finished")
        case Failure(_) => println("Some failed")
    })

    println("This line is executed first")
    
    Thread.sleep(1000)
}
