package moon.common.service;

import java.util.List;
import java.util.Map;

public interface CommonService {
	
	/**
	 * ÷������ ����
	 * */
	Map<String, Object> selectFileInfo(Map<String, Object> map) throws Exception;
	
	
	/**
	 * �޴� ����Ʈ
	 * */
	List<Map<String, Object>> selectMenuList(Map<String, Object> map) throws Exception;
}
