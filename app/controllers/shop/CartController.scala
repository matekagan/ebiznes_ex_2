package controllers.shop

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, ControllerComponents}

@Singleton
class CartController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

    def addProductForm = Action {
    Ok("Create add product Form")
  }

  def addProduct(id: Int) = Action {
    Ok("added product")
  }

  def updateForm = Action {
    Ok("update cart form")
  }

  def handleUpdate(id: Int) = Action {
    Ok("updated cart")
  }

  def deleteProduct(id: Int) = Action {
    Ok("deleted product from cart")
  }

  def listProducts = Action {
    Ok("list cart products")
  }

  def getProduct(id: Int) = Action {
    Ok("retrieved product from cart")
  }
}
