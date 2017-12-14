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
public class User {
	
	@Id
	private String id;
	private String username;
	private String password;
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public User() {
		super();
	}
	
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public User(String id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
	}

}
