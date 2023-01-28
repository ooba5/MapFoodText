package MapText.readHelper
import scala.io.Source
import MapText.material.Setting
object ProcessSetting {

//  def trackSetting(line: String): Unit = {
//    return Unit
//  }
//
//  def trackFood(line: String): Unit = {
//    return Unit
//  }

  def readBook(fileLocation: String): Unit = {
    for(line <- Source.fromFile(fileLocation).getLines()){
//      println(line)
    }
//    var s = new Setting("London")
//    print(s)
  }

}
