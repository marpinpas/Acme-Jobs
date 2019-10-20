
package acme.features.anonymous.cruz;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.cruz.Cruz;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Anonymous;

@Controller
@RequestMapping("/anonymous/cruz/")
public class AnonymousCruzController extends AbstractController<Anonymous, Cruz> {

	// Internal state ---------------------------------------------------------

	@Autowired
	private AnonymousCruzListService	listService;

	@Autowired
	private AnonymousCruzCreateService	createService;


	// Constructors -----------------------------------------------------------

	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.CREATE, this.createService);
	}

}
