package com.ccb.produce.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ccb.produce.domain.Project;



@RestController
public class ProjectController {
	private List<Project> list = new ArrayList<>();
//	@RequestMapping("/hello")
//    public Project index() {
//		Project user = new Project();  
//        user.setProject_id("1"); 
//        user.setProject_name("杭州奥体中心主体育馆PP项目");
//        user.setProject_detail("杭州奥体中心主体育馆和游泳馆项目总投资45.2亿元，总建筑面积396950平方米，工程预算投资约31.2亿元,目前已完成项目建议书、可行性研究和初步设计批复，已申领建筑工程施工许可证。");;
//        user.setProject_level("1");
//        user.setProject_price("999999.99");
////    	user.put("project_id", "1");
////    	user.put("project_name", "杭州奥体中心主体育馆PP项目");
////    	user.put("project_detail", "杭州奥体中心主体育馆和游泳馆项目总投资45.2亿元，总建筑面积396950平方米，工程预算投资约31.2亿元,目前已完成项目建议书、可行性研究和初步设计批复，已申领建筑工程施工许可证。");
////    	user.put("project_level", "1");
////    	user.put("project_price", "999999.99");
//        return user;  
//    }
    @RequestMapping("/projectdetail")
    public List<Project> getProject( String mId)
    {
    	int id = Integer.valueOf(mId).intValue()-1;
    	Project p=list.get(id);
    	List<Project> list1 = new ArrayList<>();
    	list1.add(p);
        return list1;
    }
	@RequestMapping("/project")
    public List<Project> getProject(){
		if(list.size()==0) {
			Project user1 = new Project();  
			user1.setProject_id(1); 
			user1.setProject_name("杭州奥体中心主体育馆PP项目");
			user1.setProject_detail("杭州奥体中心主体育馆和游泳馆项目总投资45.2亿元，总建筑面积396950平方米，工程预算投资约31.2亿元,目前已完成项目建议书、可行性研究和初步设计批复，已申领建筑工程施工许可证。");
			user1.setProject_level("1");
			user1.setProject_price("999999.99");
	        Project user2 = new Project();  
	        user2.setProject_id(2); 
	        user2.setProject_name("瑞安市江南污水处理厂提示改造工程PPP项目");
	        user2.setProject_detail("从市公用集团了解到，日前，我市重点工程项目江南污水处理厂厂网一体化工程PPP项目完成签约。市委常委、副市长冯金考出席签约仪式，市市政园林局局长张永芬与浙江富春紫光环保有限公司董事长吴黎明代表双方签约。\\r\\n　　据了解，江南污水处理厂一期工程包括建设一座占地74.1亩、处理能力为2.5万吨/日(远期10万吨/日)的污水处理厂和尾水排水管，及相配套的总长24公里的污水主干管和三座污水泵站，总投资约3亿元，服务范围为仙降街道(除江溪外)、飞云街道和南滨街道。工程于2012年12月20日开工，预计将于今年年底前进行调试运行。\\r\\n　　建设江南污水处理厂是我市落实生态文明、实现小城镇功能配套，改造区域内河道水质、解决集镇生活污水达标排放的一件大事，也是我市全力推进“五水共治”的一项重要举措。该项目建成投产后，能有效处理服务范围内的生活污水，避免污水直接流入附近水体，对改善我市生态环境、提升城市品位和促进经济发展具有重要意义。\\r\\n　　据悉，PPP为特许经营模式，即政府和社会资本合作，江南污水处理厂项目特许经营期为30年，出让金额3亿元。");
	        user2.setProject_level("2");
	        user2.setProject_price("999999.99");
	        Project user3 = new Project();  
	        user3.setProject_id(3); 
	        user3.setProject_name("建德市境内货场迁建");
	        user3.setProject_detail("建德市境内铁路货场迁建工程经浙江省发展和改革委员会《关于建德市铁路货场迁建工程初步设计的批复》（浙发改设计〔2013〕9号）核准同意建设，并已列为浙江省重点建设项目，项目业主为上海铁路局和建德市铁路设施投资有限公司，资金来源为铁路资金和地方自筹资金。招标人为上海铁路局杭州铁路枢纽工程建设指挥部，现对该项目所需甲供物资进行公开招标。");
	        user3.setProject_level("3");
	        user3.setProject_price("200000");

	        list.add(user1);
	        list.add(user2);
	        list.add(user3);
		}
		
        return list;
    }
	

}
