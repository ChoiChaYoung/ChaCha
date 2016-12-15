package moon.sample.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import moon.sample.dao.SampleDAO;
import moon.sample.service.SampleService;
import moon.util.FileUtils;

@Service("sampleService")
public class SampleServiceImpl implements SampleService {
	Logger log = Logger.getLogger(this.getClass());

	@Resource(name = "fileUtils")
	private FileUtils fileUtils;

	@Resource(name = "sampleDAO")
	private SampleDAO sampleDAO;

	public List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception {
		return sampleDAO.selectBoardList(map);
	}

	public void insertBoard(Map<String, Object> map, HttpServletRequest request) throws Exception {
		sampleDAO.insertBoard(map);

		List<Map<String, Object>> list = fileUtils.parseInsertFileInfo(map, request);
		for (int i = 0, size = list.size(); i < size; i++) {
			sampleDAO.insertFile(list.get(i));
		}
		/*
		 * MultipartHttpServletRequest multipartHttpServletRequest =
		 * (MultipartHttpServletRequest)request; Iterator<String> iterator =
		 * multipartHttpServletRequest.getFileNames(); MultipartFile
		 * multipartFile = null; while(iterator.hasNext()){ multipartFile =
		 * multipartHttpServletRequest.getFile(iterator.next());
		 * if(multipartFile.isEmpty() == false){
		 * log.debug("------------- file start -------------");
		 * log.debug("name 	: "+multipartFile.getName());
		 * log.debug("filename : "+multipartFile.getOriginalFilename());
		 * log.debug("size 	: "+multipartFile.getSize());
		 * log.debug("-------------- file end --------------\n"); } }
		 */
	}

	public Map<String, Object> selectBoardDetail(Map<String, Object> map) throws Exception {
		sampleDAO.updateHitCnt(map);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		Map<String, Object> tempMap = sampleDAO.selectBoardDetail(map);
		resultMap.put("map", tempMap);

		List<Map<String, Object>> list = sampleDAO.selectFileList(map);
		resultMap.put("list", list);

		return resultMap;
	}

	@Override
	public void updateBoard(Map<String, Object> map, HttpServletRequest request) throws Exception {
		sampleDAO.updateBoard(map);

		sampleDAO.deleteFileList(map);
		List<Map<String, Object>> list = fileUtils.parseUpdateFileInfo(map, request);
		Map<String, Object> tempMap = null;
		for (int i = 0, size = list.size(); i < size; i++) {
			tempMap = list.get(i);
			if (tempMap.get("IS_NEW").equals("Y")) {
				sampleDAO.insertFile(tempMap);
			} else {
				sampleDAO.updateFile(tempMap);
			}
		}
	}

	@Override
	public void deleteBoard(Map<String, Object> map) throws Exception {
		sampleDAO.deleteBoard(map);
	}

}