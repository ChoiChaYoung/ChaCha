package moon.common.controller;

import java.awt.List;
import java.io.File;
import java.net.URLEncoder;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import moon.common.common.CommandMap;
import moon.common.service.CommonService;

@Controller
@RequestMapping(value="/common")
public class CommonController {
	private static final String filePath = "C:\\DEV_MOON\\file\\";
     
	Logger log = Logger.getLogger(this.getClass());
    
    @Resource(name="commonService")
    private CommonService commonService;
    
    @RequestMapping(value="/downloadFile.do")
    public void downloadFile(CommandMap commandMap, HttpServletResponse response) throws Exception{
        Map<String,Object> map = commonService.selectFileInfo(commandMap.getMap());
        String storedFileName = (String)map.get("STORED_FILE_NAME");
        String originalFileName = (String)map.get("ORIGINAL_FILE_NAME");
         
        byte fileByte[] = FileUtils.readFileToByteArray(new File(filePath+storedFileName));
         
        response.setContentType("application/octet-stream");
        response.setContentLength(fileByte.length);
        response.setHeader("Content-Disposition", "attachment; fileName=\"" + URLEncoder.encode(originalFileName,"UTF-8")+"\";");
        response.setHeader("Content-Transfer-Encoding", "binary");
        response.getOutputStream().write(fileByte);
         
        response.getOutputStream().flush();
        response.getOutputStream().close();
    }
}
