
package acme.features.anonymous.arroyobulletin;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.bulletins.ArroyoBulletin;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Anonymous;

@Controller
@RequestMapping("/anonymous/arroyo-bulletin/")
public class AnonymousArroyoBulletinController extends AbstractController<Anonymous, ArroyoBulletin> {

	@Autowired
	private AnonymousArroyoBulletinListService		listService;

	@Autowired
	private AnonymousArroyoBulletinCreateService	createService;


	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.CREATE, this.createService);
	}

}
