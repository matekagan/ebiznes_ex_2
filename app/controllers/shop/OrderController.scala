package controllers.shop

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, ControllerComponents}

@Singleton
class OrderController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

    def createOrderForm = Action {
    Ok("Create Order Form")
  }

  def createOrder(id: Int) = Action {
    Ok("created Order: " + id)
  }

  def updateOrderForm = Action {
    Ok("update Order form")
  }

  def updateOrder(id: Int) = Action {
    Ok("updated Order: " + id)
  }

  def deleteOrder(id: Int) = Action {
    Ok("deleted Order: " + id)
  }

  def listOrders = Action {
    Ok("list Order")
  }

  def getOrder(id: Int) = Action {
    Ok("retrieved Order: " + id)
  }
}
