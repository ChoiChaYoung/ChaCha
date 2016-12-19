package moon.admin.menuMgt.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import moon.admin.menuMgt.dao.MenuMgtDAO;
import moon.admin.menuMgt.service.MenuMgtService;

@Service("menuMgtService")
public class MenuMgtServiceImpl implements MenuMgtService {
	Logger log = Logger.getLogger(this.getClass());

	@Resource(name = "menuMgtDAO")
	private MenuMgtDAO menuMgtDAO;

	public List<Map<String, Object>> selectMenuList(Map<String, Object> map) throws Exception {
		return menuMgtDAO.selectMenuList(map);
	}

}