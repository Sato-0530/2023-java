package nca;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditService 
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
	
	public void delete(UserForm form)
	{
		delete(form.getEmail());
	}
	
	public void delete(String email)
	{
		repository.deleteById(email);
	}
	
	//public UserEntity delete(String email) 
	//{
		//UserEntity entity = new UserEntity();
		//DBから取得したとみなして、各情報をセットする
//		entity.setName("花子　太郎");
//		entity.setKana("ハナコ　タロウ");
//		entity.setBloodtype("B");
//		entity.setEmail("aaa@gmail.com");
//		entity.setAddress("北海道札幌市");
//		entity.setPassword("nca5f502");
		//return entity;
	//}
	
	
}
