/**   
 *       
 * 名称：User   
 * 描述：   
 * 创建人：Administrator   
 * 创建时间：2017年12月14日 下午3:30:12 
 * @version       
 */ 

package cn.com.taiji.mongodb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**        
 * 类名称：User   
 * 类描述：   
 * 创建人：Administrator   
 * 创建时间：2017年12月14日 下午3:30:12 
 * @version      
 */
@Document(collection="users")
public class UserDoc {
	
	@Id
	private String id;
	private String username;
	private Integer age;
	
	private Article article;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public UserDoc() {
		super();
	}

	public UserDoc(String id, String username, Integer age, Article article) {
		super();
		this.id = id;
		this.username = username;
		this.age = age;
		this.article = article;
	}

	public UserDoc(String username, Integer age, Article article) {
		super();
		this.username = username;
		this.age = age;
		this.article = article;
	}

	@Override
	public String toString() {
		return "UserDoc [id=" + id + ", username=" + username + ", age=" + age + ", article=" + article + "]";
	}

}
