package com.swim.idao;

import java.sql.SQLException;

import com.swim.domain.*;

public interface idianzandao {
	
	//点赞功能实现,
	public dianzanorfandui DianZan(User user)throws ClassNotFoundException, SQLException;

}
