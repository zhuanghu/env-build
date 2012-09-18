package com.comverse.timesheet.web.impl;

import com.comverse.timesheet.web.bean.TestTable;
import com.comverse.timesheet.web.dao.ITestTableDAO;
import com.comverse.timesheet.web.util.BasicSqlSupport;

public class ITestTableDAOImpl extends BasicSqlSupport implements ITestTableDAO {
	@Override
	public boolean add(TestTable test) throws Exception {
		boolean flag=false;
		int count=this.session.insert("com.comverse.timesheet.web.mapper.Test.add",test);
		if(count>0){
			flag=true;
		}
		return flag;
	}
}
