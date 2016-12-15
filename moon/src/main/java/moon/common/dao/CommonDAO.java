package moon.common.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository("commonDAO")
public class CommonDAO extends AbstractDAO{
 
	@SuppressWarnings("unchecked")
	public Map<String, Object> selectFileInfo(Map<String, Object> map) throws Exception{
	    return (Map<String, Object>)selectOne("common.selectFileInfo", map);
	}
	
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectMenuList(Map<String, Object> map) throws Exception{
		return (List<Map<String, Object>>)selectList("common.selectMenuList", map);
	}
}
