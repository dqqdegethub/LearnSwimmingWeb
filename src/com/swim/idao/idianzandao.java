package com.swim.idao;

import java.sql.SQLException;

import com.swim.domain.*;

public interface idianzandao {
	
	//���޹���ʵ��,
	public dianzanorfandui DianZan(User user)throws ClassNotFoundException, SQLException;

}
