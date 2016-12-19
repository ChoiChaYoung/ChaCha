package moon.admin.menuMgt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import moon.common.dao.AbstractDAO;

@Service("menuMgtDAO")
public class MenuMgtDAO extends AbstractDAO{

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectMenuList(Map<String, Object> map) throws Exception{
		return (List<Map<String, Object>>)selectList("admin.menuMgt.selectMenuList", map);
	}
}
