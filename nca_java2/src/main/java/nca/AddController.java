package nca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping({"add"})
public class AddController 
{
	@Autowired
	EditService service;

	@GetMapping
	public String index(Model model, UserForm form) 
	{
		//log.info("新規登録コントローラー");
		//form.setName("");
		//form.setKana("");
		//form.setBloodtype("A");
		//form.setEmail("");
		//form.setAddress("");
		//form = service.findById(form);
		model.addAttribute("form", form);
		return "add";
	}
	
	//@PostMapping(path="action")
	//public String action() 
	//{
	//	log.info("新規登録コントローラー：実行完了");
	//	return "add_msg";
	//}
	
	@PostMapping(path="action")
	public String action(Model model, UserForm form) 
	{
		log.info("変更コントローラー：登録処理実行");
		form = service.save(form);
		return "add_msg";
	}
}
