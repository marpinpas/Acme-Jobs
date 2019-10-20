
package acme.features.anonymous.romero;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.romero.Romero;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Anonymous;

@Controller
@RequestMapping("/anonymous/romero/")
public class AnonymousRomeroController extends AbstractController<Anonymous, Romero> {

	@Autowired
	private AnonymousRomeroListService		listService;

	@Autowired
	private AnonymousRomeroCreateService	createService;


	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.CREATE, this.createService);
	}
}
