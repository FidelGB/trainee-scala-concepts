/**
  * Pattern Matching
  * 
  * Permite hacer una especie de switch como comunmente se le llama
  * en otros lenguajes de programación
  * 
  * 
  */


object patternMatching extends App {
    val number: Int = 5

    val numberStr = number match {
        case 1 => "One"
        case 2 => "Two"
        case 5 => "Five"
        case _ => "Another number"
    }
    

    println(numberStr)

    sealed trait Notification
    case class Email(sender: String, title: String, body: String = null) extends Notification
    case class SMS(caller: String, message: String) extends Notification
    case class PhoneCall(number: String, contactName: String) extends Notification

    def showNotificacion(notification: Notification): String = {
        notification match {
            case Email(sender, title, _) => s"Sending email to $sender, title: \"$title\""
            case SMS(caller, _) => s"Sending SMS to $caller"
            case PhoneCall(number, _) =>  s"Calling to $number"
        }
    }

    val someEmail = Email("jhon@doe.com", "Ordered completed!")
    val someSMS = SMS("1122334455", "Test SMS")
    val someCall = PhoneCall("22222222", "Jhon Doe")

    println(showNotificacion(someEmail))
    println(showNotificacion(someSMS))
    println(showNotificacion(someCall))
}