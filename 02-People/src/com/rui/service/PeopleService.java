package com.rui.service;

import java.io.IOException;
import java.util.List;

import com.rui.pojo.People;

public interface PeopleService {
	List<People> show() throws IOException;
}
