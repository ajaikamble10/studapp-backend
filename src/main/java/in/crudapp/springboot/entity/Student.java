package in.crudapp.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="stud_details")
@Data
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="stud_id")
	private long id;
	@Column(name="first_name")
	private String fName;
	@Column(name="middle_name")
	private String mName;
	@Column(name="last_name")
	private String lName;
	@Column(name="address")
	private String address;
	@Column(name="contact")
	private String contact;
	@Column(name="pin")
	private String pin;
}
