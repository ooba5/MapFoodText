package MapText.material


abstract class ObjectOfInterest(name: String){

  var lineNums: List[Int] = List()

  override def toString: String = {
    return name
  }
}
class Food(name:String) extends ObjectOfInterest(name) {

}

class Setting(name:String) extends ObjectOfInterest(name) {

}
