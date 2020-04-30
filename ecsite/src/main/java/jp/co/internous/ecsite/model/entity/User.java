package jp.co.internous.ecsite.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


//Entityクラス宣言
@Entity
//DBの中のuserの実態を指定
@Table(name="user")
public class User {
	
//user内の各カラムをフィールドとして宣言
	
	//プライマリーキーであることを指定
	@Id
	
	//idカラムとマッピング
	@Column(name="id")
	
	//IDフィールドのふるまい方を指定
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	//user_nameカラムとマッピング
	@Column(name="user_name")
	private String userName;
	
	//passwordカラムとマッピング
	@Column(name="password")
	private String password;
	
	//full_nameカラムとマッピング
	@Column(name="full_name")
	private String fullName;
	
	//isAdminカラムとマッピング
	@Column(name="isAdmin")
	private int isAdmin;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}
	
}
