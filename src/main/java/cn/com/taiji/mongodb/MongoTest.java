/**   
 *       
 * 名称：MongoTest   
 * 描述：   
 * 创建人：Administrator   
 * 创建时间：2017年12月14日 下午3:54:37 
 * @version       
 */ 

package cn.com.taiji.mongodb;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**        
 * 类名称：MongoTest   
 * 类描述：   
 * 创建人：Administrator   
 * 创建时间：2017年12月14日 下午3:54:37 
 * @version      
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SpringMongoConfig.class,loader=AnnotationConfigContextLoader.class)
public class MongoTest {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	MongoService mongoService;
	
	@Test
	public void saveUserTest() {
		UserDoc user = new UserDoc();
		Article article1 = new Article();
		
		article1.setName("the second day");
		article1.setUrl("http://www.sina.com.cn");
		
		user.setId("50");
		user.setUsername("sharry wang2");
		user.setArticle(article1);
		
		mongoService.saveUser(user);
		UserDoc user1 = userRepo.findByArticleName("the second day");
		System.out.println(user.getArticle().getName());
		System.out.println(user1);
		
		
	}
	
	@Test
	public void te() {
		System.out.println("55");
	}

	@Test
	public void impl() {
		Map<String, Object> map = userRepo.findUserBySearcher(0, 10, "sharry wang2");
		Iterator<Entry<String, Object>> iterator = map.entrySet().iterator();
		if( iterator.hasNext() ) {
			Entry<String, Object> next = iterator.next();
			System.out.println(next.getKey()+"===="+next.getValue());
		}
	
	}
	
}
