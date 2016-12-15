package moon.common.menu.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import moon.common.common.CommandMap;
import moon.common.menu.service.MenuService;

@Controller
@RequestMapping("/common/menu")
public class MenuController {
	Logger log = Logger.getLogger(this.getClass());
    
    @Resource(name="menuService")
    private MenuService menuService;

    
    @RequestMapping(value="/selectMenuList.do")
    public ModelAndView retrieveMenuList(CommandMap commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("/common/boardDetail");
         
        List<Map<String, Object>> list = menuService.selectMenuList(commandMap);
        mv.addObject("list", list);
        
        return mv;
    }
    
}
