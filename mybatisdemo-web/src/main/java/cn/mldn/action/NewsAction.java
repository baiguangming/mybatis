package cn.mldn.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.mldn.service.INewsService;
import cn.mldn.vo.News;

@Controller
@RequestMapping("/pages/news/*")
public class NewsAction {
	@Resource
	private INewsService newsService ;
	@RequestMapping("add")
	public ModelAndView add(News vo) {
		System.out.println("【ACTION】" + vo);
		System.out.println(this.newsService.add(vo));
		return null ;
	}
}
