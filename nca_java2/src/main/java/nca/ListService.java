package nca;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class ListService 
{
	@Autowired
	UserRepository repository;
	
	//引数として検索条件を受け取りDBから条件マッチした情報を受け取りコントローラーに返す
	public List<UserForm> search(UserForm where)
	{
		//引数の情報をコンソールに出力
		System.out.println(where.toString());
		//リポジトリ作成。実際DBに接続するときは上で生成するから本番では削除
		//UserRepositoryStub repository = new UserRepositoryStub();
		//ユーザーフォームの変数を準備
		UserForm form = null;
		
		
		if(Objects.isNull(where.getBloodtype()))
		{
			where.setBloodtype("%%");
		}
		List<UserEntity> entityList =  repository.findByKanaContainingAndBloodtypeLikeAndAddressStartingWith(where.getKana(), where.getBloodtype(),where.getAddress());
		
		
		//DBから受け取ったユーザー情報をentityListに格納する
		//List<UserEntity> entityList = repository.findAll();
		//ユーザーフォームリストのインスタを生成する
		ArrayList<UserForm> formList = new ArrayList<UserForm>();
		//DBから受け取ったユーザー情報を情報フォームに移す(詰め替え)
		for(UserEntity entity : entityList)
		{
			//フォームのインスタンスを生成
			form = new UserForm();
			//DBの情報をフォームにコピーする
			BeanUtils.copyProperties(entity, form);
			//姓と名を結合したいとき
			//form.setName(entity.getName() + "" + entity.getKana());
			//フォームリストにフォームを追加する
			formList.add(form);
		}
		return formList;
	}

}
