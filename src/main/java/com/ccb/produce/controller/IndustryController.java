package com.ccb.produce.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ccb.produce.domain.Industry;
import com.ccb.produce.domain.Project;



@RestController
public class IndustryController {
	private List<Industry> list = new ArrayList<>();

    @RequestMapping("/detail")
    public List<Industry> getProject( String mId)
    {
    	int id = Integer.valueOf(mId).intValue()-1;
    	Industry p=list.get(id);
    	List<Industry> list1 = new ArrayList<>();
    	list1.add(p);
        return list1;
    }
	@RequestMapping("/industry")
    public List<Industry> getProject(){
		if(list.size()==0) {
			Industry user1 = new Industry();  
			user1.setNews_id(1); 
			user1.setNews_title("钢材产量大幅下降，将影响棉花市场交易价格");
			user1.setNews_detail("钢材产量大幅下降，将影响棉花市场交易价格");
			user1.setNews_level("1");
			Industry user2 = new Industry();  
			user2.setNews_id(2); 
			user2.setNews_title("棉花市场遇冷寒冬是否来临");
			user2.setNews_detail("棉花市场遇冷寒冬是否来临");
			user2.setNews_level("2");
	        Industry user3 = new Industry();  
	        user3.setNews_id(3); 
	        user3.setNews_title("煤炭估值存修复空间");
	        user3.setNews_detail("煤炭估值存修复空间");
	        user3.setNews_level("3");
	        list.add(user1);
	        list.add(user2);
	        list.add(user3);
		}
		
        return list;
    }
	

}
