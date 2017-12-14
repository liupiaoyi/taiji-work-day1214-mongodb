/**   
 *       
 * 名称：UserRepositoryCustom   
 * 描述：   
 * 创建人：Administrator   
 * 创建时间：2017年12月14日 下午4:52:09 
 * @version       
 */ 

package cn.com.taiji.mongodb;

import java.util.List;
import java.util.Map;

/**        
 * 类名称：UserRepositoryCustom   
 * 类描述：   
 * 创建人：Administrator   
 * 创建时间：2017年12月14日 下午4:52:09 
 * @version      
 */

public interface UserRepositoryCustom {
	
	Map<String, Object> findUserBySearcher(int pageNo, int pageSize, String username);
	
	List<UserDoc> userDocList(int pageNo, int pageSize, String username);
	
	void saveJson(String json);
	void aggregate();

}
