package cn.mldn.service;

import java.util.List;

import cn.mldn.vo.News;

public interface INewsService {
	public boolean add(News vo);
	public List<News> list(long currentPage, int lineSize, String column,
			String keyWord);
}
