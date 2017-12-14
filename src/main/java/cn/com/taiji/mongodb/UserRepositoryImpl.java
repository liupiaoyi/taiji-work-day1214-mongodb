/**   
 *       
 * 名称：UserRepositoryImpl   
 * 描述：   
 * 创建人：Administrator   
 * 创建时间：2017年12月14日 下午4:58:15 
 * @version       
 */ 

package cn.com.taiji.mongodb;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;


/**        
 * 类名称：UserRepositoryImpl   
 * 类描述：   
 * 创建人：Administrator   
 * 创建时间：2017年12月14日 下午4:58:15 
 * @version      
 */

public class UserRepositoryImpl implements UserRepositoryCustom {

	/* (non-Javadoc)
	 * @see cn.com.taiji.mongodb.UserRepositoryCustom#findUserBySearcher(int, int, java.lang.String)
	 * @author Administrator
	 */
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	public Map<String, Object> findUserBySearcher(int pageNo, int pageSize, String username) {

		Criteria criteria = new Criteria();
		if( null!= username && !username.equals("") ) {
			criteria.andOperator(
					Criteria.where("username").regex(".*?"+username+".*"),
					Criteria.where("article.name").exists(true) );
		}
		
		Query query = new Query(criteria);
		query.skip( (pageNo-1) * pageSize );
		query.limit(pageSize);
		
		List<Order> ltOrder = Arrays.asList( Order.asc("article.name"),Order.desc("_id") );
		query.with(Sort.by(ltOrder));
		
		List<UserDoc> users = this.mongoTemplate.find(query, UserDoc.class);
		long count = this.mongoTemplate.count(query, UserDoc.class);
		
		Map<String,Object> result = new HashMap<String,Object>();
		
		result.put("recordsTotal", count);
		result.put("recordsFiltered", count);
		result.put("data", users);
		
		return result;
	}

	/* (non-Javadoc)
	 * @see cn.com.taiji.mongodb.UserRepositoryCustom#userDocList(int, int, java.lang.String)
	 * @author Administrator
	 */
	public List<UserDoc> userDocList(int pageNo, int pageSize, String username) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see cn.com.taiji.mongodb.UserRepositoryCustom#saveJson(java.lang.String)
	 * @author Administrator
	 */
	public void saveJson(String json) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see cn.com.taiji.mongodb.UserRepositoryCustom#aggregate()
	 * @author Administrator
	 */
	public void aggregate() {
		// TODO Auto-generated method stub

	}

}
