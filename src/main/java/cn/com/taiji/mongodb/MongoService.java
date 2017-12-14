/**   
 *       
 * 名称：MongoService   
 * 描述：   
 * 创建人：Administrator   
 * 创建时间：2017年12月14日 下午3:50:24 
 * @version       
 */ 

package cn.com.taiji.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

/**        
 * 类名称：MongoService   
 * 类描述：   
 * 创建人：Administrator   
 * 创建时间：2017年12月14日 下午3:50:24 
 * @version      
 */
@Service
public class MongoService {
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	MongoTemplate mongoTemplate;

	public MongoService() {
		
	}
	
	
	public void saveUser(UserDoc user) {
		userRepo.save(user);
	}
	
	public UserDoc findByUsername(String username) {
		return userRepo.findByUsername(username);
	}
	

}
