package controllers.shop

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, ControllerComponents}

@Singleton
class DiscountController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

    def createDiscountForm = Action {
    Ok("Create Discount Form")
  }

  def createDiscount(id: Int) = Action {
    Ok("created Discount: "+ id)
  }

  def updateDiscountForm = Action {
    Ok("update Discount form")
  }

  def updateDiscount(id: Int) = Action {
    Ok("updated Discount: "+ id)
  }

  def deleteDiscount(id: Int) = Action {
    Ok("deleted Discount: " + id)
  }

  def listDiscounts = Action {
    Ok("list Discount")
  }

  def getDiscount(id: Int) = Action {
    Ok("retrieved Discount: " + id)
  }
}
