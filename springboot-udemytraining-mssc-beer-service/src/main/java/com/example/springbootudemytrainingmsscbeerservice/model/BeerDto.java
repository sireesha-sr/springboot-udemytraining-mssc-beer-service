package com.example.springbootudemytrainingmsscbeerservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Builder
@AllArgsConstructor
public class BeerDto {

	private Long beerId;

	private String beerName;

	private String beerType;

}
