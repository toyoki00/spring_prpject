package com.example.demo.animals.animalsDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class AnimalsData {

	@JsonProperty("id")
	private int id;

	@JsonProperty("name")
	private String name;

	@JsonProperty("japanese_name")
	private String japanese_name;

	@JsonProperty("cry")
	private String cry;
}