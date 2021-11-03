package org.zerock.domain;

import java.util.Date;

import lombok.Data;

@Data
public class MemberVO {
	private String id;
	private String password;
	private String name;
	private String birth;
	private String phone;
	private Date reg;

}
