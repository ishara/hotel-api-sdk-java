/**
 * Autogenerated code by SdkModelGenerator.
 * Do not edit. Any modification on this file will be removed automatically after project build
 *
 */
package com.hotelbeds.hotelcontentapi.auto.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.hotelbeds.hotelcontentapi.auto.messages.Content;

import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.Data;

@JsonInclude(Include.NON_NULL)
@ToString
@NoArgsConstructor
@Data
public class Room {

	private String code;
	private String type;
	private String characteristic;
	private Integer minPax;
	private Integer maxPax;
	private Integer maxAdults;
	private Integer maxChildren;
	private Integer minAdults;
	private String description;
	private Content typeDescription;
	private Content characteristicDescription;


}