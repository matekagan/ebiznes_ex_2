package controllers.shop

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, ControllerComponents}

@Singleton
class PaymentController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

    def createPaymentForm = Action {
    Ok("Create Payment Form")
  }

  def createPayment(id: Int) = Action {
    Ok("created Payment:" + id)
  }

  def updatePaymentForm = Action {
    Ok("update Payment form")
  }

  def updatePayment(id: Int) = Action {
    Ok("updated Payment: "  + id)
  }

  def deletePayment(id: Int) = Action {
    Ok("deleted Payment: " + id)
  }

  def listPayments = Action {
    Ok("list Payment")
  }

  def getPayment(id: Int) = Action {
    Ok("retrieved Payment: " + id)
  }
}
