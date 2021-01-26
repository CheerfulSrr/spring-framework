package io.greekn;

import lombok.ToString;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-12-19 23:02
 * @package io.greekn
 * @modified Greekn
 * @description
 */
@ToString
public class House {
	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
