package nca;

import org.springframework.stereotype.Service;

@Service
public class MenuService 
{
	public boolean isAuth(UserForm form) 
	{
		boolean auth = false;
		UserEntity entity = findById(form);
		
		if("nca5f502".equals(form.getPassword()))
		{
			auth = true;
		}
		return auth;
	}
	
	public UserEntity findById(UserForm form)
	{
		UserEntity entity = new UserEntity();
		entity.setPassword("nca5f502");
		return entity;
	}
	
}
