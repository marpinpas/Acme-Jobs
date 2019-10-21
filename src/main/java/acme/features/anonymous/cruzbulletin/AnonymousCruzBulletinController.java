
package acme.features.anonymous.cruzbulletin;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.bulletins.CruzBulletin;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Anonymous;

@Controller
@RequestMapping("/anonymous/cruz-bulletin/")
public class AnonymousCruzBulletinController extends AbstractController<Anonymous, CruzBulletin> {

	// Internal state ---------------------------------------------------------

	@Autowired
	private AnonymousCruzBulletinListService	listService;

	@Autowired
	private AnonymousCruzBulletinCreateService	createService;


	// Constructors -----------------------------------------------------------

	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.CREATE, this.createService);
	}

}
