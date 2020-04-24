package controllers.shop

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, ControllerComponents}

@Singleton
class EmployeeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

    def addEmployeeForm = Action {
    Ok("Create Employee Form")
  }

  def addEmployee(id: Int) = Action {
    Ok("created Employee: " + id)
  }

  def updateEmployeeForm = Action {
    Ok("update Employee form")
  }

  def updateEmployee(id: Int) = Action {
    Ok("updated Employee: " + id)
  }

  def deleteEmployee(id: Int) = Action {
    Ok("deleted Employee: " + id)
  }

  def listEmployees = Action {
    Ok("list Employees")
  }

  def getEmployee(id: Int) = Action {
    Ok("retrieved Employee: " + id)
  }
}
