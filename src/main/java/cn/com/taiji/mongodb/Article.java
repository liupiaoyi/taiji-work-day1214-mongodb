/**   
 *       
 * 名称：Article   
 * 描述：   
 * 创建人：Administrator   
 * 创建时间：2017年12月14日 下午3:36:30 
 * @version       
 */ 

package cn.com.taiji.mongodb;

/**        
 * 类名称：Article   
 * 类描述：   
 * 创建人：Administrator   
 * 创建时间：2017年12月14日 下午3:36:30 
 * @version      
 */

public class Article {
	
	private String name;
	private String url;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "Article [name=" + name + ", url=" + url + "]";
	}

}
