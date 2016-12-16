package moon.common.main.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import moon.common.common.CommandMap;
import moon.common.menu.service.MenuService;

@Controller
@RequestMapping("/common/main")
public class MainController {
	Logger log = Logger.getLogger(this.getClass());

	@Resource(name = "menuService")
	private MenuService menuService;

	@RequestMapping(value = "/main.do")
	public ModelAndView retrieveMain(CommandMap commandMap, HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("/main/main");

		List<Map<String, Object>> menuList = menuService.selectMenuList(commandMap.getMap());
		mv.addObject("menuList", menuList);

		HttpSession session = request.getSession(false); // - 기존에 돌아댕기는 세션을
															// 가져와보고...
		if (session != null) { // - Null 이 아니면
			session.invalidate(); // - 초기화 해주고
		}
		session = request.getSession(true);

		session.setAttribute("menuList", menuList);
		return mv;
	}

}
