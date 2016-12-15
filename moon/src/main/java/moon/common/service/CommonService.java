package moon.common.service;

import java.util.List;
import java.util.Map;

public interface CommonService {
	
	/**
	 * 첨부파일 정보
	 * */
	Map<String, Object> selectFileInfo(Map<String, Object> map) throws Exception;
	
	
	/**
	 * 메뉴 리스트
	 * */
	List<Map<String, Object>> selectMenuList(Map<String, Object> map) throws Exception;
}
