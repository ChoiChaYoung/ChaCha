package moon.common.menu.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import moon.common.common.CommandMap;
import moon.common.menu.dao.MenuDAO;
import moon.common.menu.service.MenuService;

@Service("menuService")
public class MenuServiceImpl implements MenuService{
    Logger log = Logger.getLogger(this.getClass());

    @Resource(name="menuDAO")
    private MenuDAO menuDAO;
    
	public List<Map<String, Object>> selectMenuList(Map<String, Object> map) throws Exception {
		return menuDAO.selectMenuList(map);
	}

	@Override
	public List<Map<String, Object>> selectMenuList(CommandMap commandMap) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
	
    
}
