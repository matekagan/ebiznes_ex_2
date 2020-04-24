package controllers.shop

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, ControllerComponents}

@Singleton
class ReturnController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

    def createReturnForm = Action {
    Ok("Create Return Form")
  }

  def createReturn(id: Int) = Action {
    Ok("created Return: " + id)
  }

  def updateReturnForm = Action {
    Ok("update Return form")
  }

  def updateReturn(id: Int) = Action {
    Ok("updated Return: " + id)
  }

  def deleteReturn(id: Int) = Action {
    Ok("deleted Return: " + id)
  }

  def listReturns = Action {
    Ok("list Return")
  }

  def getReturn(id: Int) = Action {
    Ok("retrieved Return: " + id)
  }
}
