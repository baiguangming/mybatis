package cn.mldn.dao;

import java.util.List;
import java.util.Map;

import cn.mldn.vo.News;

public interface INewsDAO {
	public boolean doCreate(News vo);
	public List<News> findAllSplit(Map<String,Object> param);
}
