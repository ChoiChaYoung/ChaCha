package moon.common.menu.service;

import java.util.List;
import java.util.Map;

import moon.common.common.CommandMap;

public interface MenuService {
	/**
	 * �޴� ����Ʈ
	 * */
	List<Map<String, Object>> selectMenuList(Map<String, Object> map) throws Exception;
}
