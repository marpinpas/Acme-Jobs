
package acme.features.anonymous.pinerobulletin;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.bulletins.PineroBulletin;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Anonymous;

@Controller
@RequestMapping("/anonymous/pinero-bulletin/")
public class AnonymousPineroBulletinController extends AbstractController<Anonymous, PineroBulletin> {

	@Autowired
	private AnonymousPineroBulletinListService		listService;

	@Autowired
	private AnonymousPineroBulletinCreateService	createService;


	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.CREATE, this.createService);
	}
}
