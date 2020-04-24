package controllers.shop

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, ControllerComponents}

@Singleton
class ProductController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

    def createProductForm = Action {
    Ok("Create Product Form")
  }

  def createProduct(id: Int) = Action {
    Ok("created Product: " + id)
  }

  def updateProductForm = Action {
    Ok("update Product form")
  }

  def updateProduct(id: Int) = Action {
    Ok("updated Product: " + id)
  }

  def deleteProduct(id: Int) = Action {
    Ok("deleted Product: " + id)
  }

  def listProducts = Action {
    Ok("list Product")
  }

  def getProduct(id: Int) = Action {
    Ok("retrieved Product:" + id)
  }
}
