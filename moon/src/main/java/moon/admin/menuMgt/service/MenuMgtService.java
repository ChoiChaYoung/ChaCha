package moon.admin.menuMgt.service;

import java.util.List;
import java.util.Map;

public interface MenuMgtService {

	List<Map<String, Object>> selectMenuList(Map<String, Object> map) throws Exception;
}