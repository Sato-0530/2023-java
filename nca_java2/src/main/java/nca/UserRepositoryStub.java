package nca;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryStub {

	public UserEntity findById(String email) {
		UserEntity entity = new UserEntity();
		entity.setName("名前");
		entity.setKana("カナ");
		entity.setBloodtype("O");
		entity.setEmail("user@domain.com");
		entity.setAddress("愛知県名古屋市中区1-10");
		return entity;
	}
	
	
	public List<UserEntity> findAll(){
		String[] b = {"A", "O", "B", "AB"};
		UserEntity entity = null;
		List<UserEntity> list = new ArrayList<UserEntity>();
		for(int i=0; i<10; i++) {
			entity = new UserEntity();
			entity.setName("名前"+i);
			entity.setKana("カナ"+i);
			entity.setBloodtype(b[i%3]);
			entity.setEmail(i+"user@domain.com");
			entity.setAddress("愛知県名古屋市中区1-"+i);
			list.add(entity);
		}
		return list;
	}
}
