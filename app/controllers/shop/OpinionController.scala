package controllers.shop

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, ControllerComponents}

@Singleton
class OpinionController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

    def createOpinionForm = Action {
    Ok("Create Opinion Form")
  }

  def createOpinion(id: Int) = Action {
    Ok("created Opinion: " + id)
  }

  def updateOpinionForm = Action {
    Ok("update Opinion form")
  }

  def updateOpinion(id: Int) = Action {
    Ok("updated Opinion: " + id)
  }

  def deleteOpinion(id: Int) = Action {
    Ok("deleted Opinion: " + id)
  }

  def listOpinions = Action {
    Ok("list Opinions")
  }

  def getOpinion(id: Int) = Action {
    Ok("retrieved Opinion: " + id)
  }
}
