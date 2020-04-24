package controllers.shop

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, ControllerComponents}

@Singleton
class CategoriesController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

    def createCategoryForm = Action {
    Ok("Create Category Form")
  }

  def createCategory(id: Int) = Action {
    Ok("created Category: " + id)
  }

  def updateCategoryForm = Action {
    Ok("update Category form")
  }

  def updateCategory(id: Int) = Action {
    Ok("updated Category ")
  }

  def deleteCategory(id: Int) = Action {
    Ok("deleted Category: ")
  }

  def listCategories = Action {
    Ok("list Categories")
  }

  def getCategory(id: Int) = Action {
    Ok("retrieved Category: " + id)
  }
}
