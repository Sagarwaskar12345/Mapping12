package com.dto;

import com.Entity.Custmor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class orderRequest {
	
	private Custmor custmor;

	public Custmor getCustmor() {
		return custmor;
	}

	public void setCustmor(Custmor custmor) {
		this.custmor = custmor;
	}

	
	
	

}
