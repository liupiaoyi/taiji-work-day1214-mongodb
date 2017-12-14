/**   
 *       
 * 名称：UserRepository   
 * 描述：   
 * 创建人：Administrator   
 * 创建时间：2017年12月14日 下午3:34:26 
 * @version       
 */ 

package cn.com.taiji.mongodb;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

/**        
 * 类名称：UserRepository   
 * 类描述：   
 * 创建人：Administrator   
 * 创建时间：2017年12月14日 下午3:34:26 
 * @version      
 */
@Repository
public interface UserRepository extends MongoRepository<UserDoc, Long>,UserRepositoryCustom{
	
	UserDoc findByUsername(String username);
	UserDoc findByArticleName(String articlesname);
	
	List<UserDoc> findByUsernameLikeAndArticleNameLike(String username,String articlesname);
	List<UserDoc> findByIdBetween(String userid1,String userid2);
	
	@Query("{ '_id': ?0, 'article.name' : { '$regex' : ?1} }")
	List<UserDoc> searchUsers(String userId,String desc);
	
	
}
