package com.learnkafka.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class LibraryEvent {

	@JsonProperty("libraryEventId")
	private Integer libraryEventId;
	
	private LibraryEventType libraryEventType;

	@JsonProperty("book")
	private Book book;

}
