package nca;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddService 
{
	
	@Autowired
	UserRepository repository;
	
	public UserForm findById(UserForm form) 
	{
		UserEntity entity = findById(form.getEmail());
		//エンティティの情報をフォームにコピー
		BeanUtils.copyProperties(entity,form);
		return form;
	}
	
	private UserEntity findById(String email)
	{
		UserEntity entity = null;
		Optional<UserEntity> optional = repository.findById(email);
		if(optional.isPresent())
		{
			entity = optional.get();
		}
		return entity;
	}
	
	
	public UserForm save(UserForm form)
	{
		//インスタンス生成
		UserEntity entity = new UserEntity();
		//フォームで入力した情報をエンティティにコピー
		BeanUtils.copyProperties(form, entity);
		//DBに登録（更新）をかける※saveはinsert、updateとも同じ
		entity = repository.save(entity);
		//更新したエンティティ情報をフォームにコピーする
		BeanUtils.copyProperties(entity, form);
		return form;
	}
	
}
