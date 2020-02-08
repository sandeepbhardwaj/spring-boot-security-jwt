package com.koko.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class User {
	private Long id;
	private String username;
	private String email;
	private String password;
}