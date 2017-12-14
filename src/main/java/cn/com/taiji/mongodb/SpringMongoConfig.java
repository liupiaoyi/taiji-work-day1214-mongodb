/**   
 *       
 * 名称：SpringMongoConfig   
 * 描述：   
 * 创建人：Administrator   
 * 创建时间：2017年12月14日 下午3:16:48 
 * @version       
 */ 

package cn.com.taiji.mongodb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.MongoClient;

/**        
 * 类名称：SpringMongoConfig   
 * 类描述：   
 * 创建人：Administrator   
 * 创建时间：2017年12月14日 下午3:16:48 
 * @version      
 */
@Configuration
@ComponentScan("cn.com.taiji.mongodb")
@EnableMongoRepositories(basePackages= {"cn.com.taiji.mongodb"})

public class SpringMongoConfig extends AbstractMongoConfiguration{
	
	@Override
	protected String getDatabaseName() {
		// TODO Auto-generated method stub
		return "mydb";
	}

	@Override
	@Bean
	public MongoClient mongoClient() {
		// TODO Auto-generated method stub
		return new MongoClient("127.0.0.1");
	}


}
