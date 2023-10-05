package nca;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping({"edit_msg"})
public class Edit_msgController 
{

	@PostMapping
	public String index() 
	{
		log.info("編集完了メッセージコントローラー");
		return "edit_msg";
	}
	
	@GetMapping
	public String index2() 
	{
		log.info("編集完了メッセージコントローラー");
		return "edit_msg";
	}
	
}
