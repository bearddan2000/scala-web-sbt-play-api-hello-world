package example.controller

import javax.inject._
import play.api.mvc.{Action, AnyContent, BaseController, ControllerComponents}

@Singleton
class DefaultController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  // curl localhost:9000/
  def getMessage(): Action[AnyContent] = Action {
    Ok("hello world")
  }

}
