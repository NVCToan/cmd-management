package com.comaymanagement.cmd.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employees {
	private String name;
	private String date_of_birth;
	private String email;
	private String phone_number;
	private long manager_id;
	private String create_by;
	private String modify_by;
	private String create_date;
	private String modify_date;
}
