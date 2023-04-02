package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Student;

//yeh sare methods contain karega jo database ke sath communication keliye help karega
public interface StudentDao {
	//yeh interface so sirf methods rahega. iss interface ko implement krne wali ek class bhi banani padegi
	public int insert( Student student);//isko insert krne keliye Student ka object chahiye hoga
	

}
