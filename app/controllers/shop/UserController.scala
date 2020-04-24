package controllers.shop

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, ControllerComponents}

@Singleton
class UserController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def createUserForm = Action {
    Ok("Create User Form")
  }

  def createUser(id: Int) = Action {
    Ok("created User: " + id)
  }

  def updateUserForm = Action {
    Ok("update User form")
  }

  def updateUser(id: Int) = Action {
    Ok("updated User: " + id)
  }

  def deleteUser(id: Int) = Action {
    Ok("deleted User: " + id)
  }

  def listUsers = Action {
    Ok("list User")
  }

  def getUser(id: Int) = Action {
    Ok("retrieved User:" + id)
  }
}
