package sample.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Post {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	int postNumber;
	
	@NotNull
	String creator;
	
	@NotNull
	@Size(min=1, message="입력하세요")
	String title;
	
	@NotNull
	@Size(min=1, max=20, message="제목은 1~20글자로 설정할 수 있습니다.")
	String content;
	
	Date pcreated;
	Date pmodified;
	public int getPostNumber() {
		return postNumber;
	}
	public void setPostNumber(int postNumber) {
		this.postNumber = postNumber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getPcreated() {
		return pcreated;
	}
	public void setPcreated(Date pcreated) {
		this.pcreated = pcreated;
	}
	public Date getPmodified() {
		return pmodified;
	}
	public void setPmodified(Date pmodified) {
		this.pmodified = pmodified;
	}
	
	
}
