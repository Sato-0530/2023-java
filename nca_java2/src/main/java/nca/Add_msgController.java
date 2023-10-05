package nca;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping({"add_msg"})
public class Add_msgController 
{

	@PostMapping
	public String index() 
	{
		log.info("新規登録メッセージコントローラー");
		return "add_msg";
	}
	
	@GetMapping
	public String back()
	{
		log.info("メニューコントローラー戻り処理");
		return "menu";
	}
}
