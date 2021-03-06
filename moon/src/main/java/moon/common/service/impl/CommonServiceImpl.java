package moon.common.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import moon.common.dao.CommonDAO;
import moon.common.service.CommonService;

@Service("commonService")
public class CommonServiceImpl implements CommonService{
    Logger log = Logger.getLogger(this.getClass());
     
    @Resource(name="commonDAO")
    private CommonDAO commonDAO;

	@Override
	public Map<String, Object> selectFileInfo(Map<String, Object> map) throws Exception {
		return commonDAO.selectFileInfo(map);
	}

	@Override
	public List<Map<String, Object>> selectMenuList(Map<String, Object> map) throws Exception {
		return commonDAO.selectMenuList(map);
	}
    
	
    
}
