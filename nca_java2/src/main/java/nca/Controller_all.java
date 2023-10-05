package nca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller


public class Controller_all 
{
	//login-------------------------------------------------------------
	@GetMapping(path="login")
	public String indexlogin() 
	{
		log.info("ログインコントローラー");
		return "login";
	}
	
	//menu-----------------------------------------------------------------
	Service_all service;
	@Autowired
	@PostMapping(path="menu")
	public String indexmenu(Model model, UserForm form) 
	{
		log.info("メニューコントローラー");
		String ret = "login";
		if(service.isAuth(form)) 
		{
			ret = "menu";
		}
		return ret;
	}
	
	@GetMapping
	public String back()
	{
		log.info("メニューコントローラー戻り処理");
		return "menu";
	}
	//------------------------------------------------------------------------

	//----------------------------------------------------------------------------------s
	
}
