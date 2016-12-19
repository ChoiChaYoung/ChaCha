package moon.admin.menuMgt.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import moon.admin.menuMgt.service.MenuMgtService;
import moon.common.common.CommandMap;

@Controller
@RequestMapping("/admin/menuMgt")
public class MenuMgtController {
	Logger log = Logger.getLogger(this.getClass());
    
    @Resource(name="menuMgtService")
    private MenuMgtService menuMgtService;

    
    @RequestMapping(value="/selectMenuList.do")
    public ModelAndView retrieveMenuList(CommandMap commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("/admin/crudMenu");
         
        List<Map<String, Object>> list = menuMgtService.selectMenuList(commandMap.getMap());
        mv.addObject("list", list);
        
        return mv;
    }
    
}
