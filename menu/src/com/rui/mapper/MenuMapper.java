package com.rui.mapper;

import java.util.List;


import com.rui.pojo.Menu;

public interface MenuMapper {
	List<Menu> selByPid(int pid);
}
