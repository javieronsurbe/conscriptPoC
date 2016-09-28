
package example

import xsbti.{AppConfiguration, AppMain, MainResult}

class HelloApp extends AppMain{
  override def run(appConfiguration: AppConfiguration): MainResult = {
    val scalaVersion = appConfiguration.provider.scalaProvider.version

    val arguments=appConfiguration.arguments.toList
    arguments.foreach {
      case (_) => println(_)
    }


    println("Hello World! Running Scala " + scalaVersion)

    new Exit(0)
  }
  class Exit(val code:Int) extends xsbti.Exit
}
