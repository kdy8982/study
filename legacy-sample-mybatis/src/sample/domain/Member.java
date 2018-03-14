package sample.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity
public class Member {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	int id;

	@NotNull
	@Size(min = 1, message = "입력하세요.")
	String name;


	@NotNull
	@Size(min = 1, message = "값을 입력해주세요.")
	@Email(message="올바른 이메일 형식이 아닙니다.")
	String email;

	@NotNull
	@Size(min = 1, message = "값을 입력해주세요.")
	String password;


	@Temporal(TemporalType.DATE)
	Date joined;



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the joined
	 */
	public Date getJoined() {
		return joined;
	}

	/**
	 * @param joined the joined to set
	 */
	public void setJoined(Date joined) {
		this.joined = joined;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", joined="
				+ joined + "]";
	}

	
	
	
}
