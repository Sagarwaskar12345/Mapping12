package com.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="custmor")
public class Custmor {
    @Id
    @GeneratedValue
	private int id;
	private String name;
	private String email;
	private String gender;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	@Override
	public String toString() {
		return "Custmor [id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender + ", Products="
				+ Products + "]";
	}


	@OneToMany(targetEntity=Product.class,cascade=  CascadeType.ALL)
	@JoinColumn(name="cp_Fk",referencedColumnName="id")
	private List<Product> Products;
	
}
