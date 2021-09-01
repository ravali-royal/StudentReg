package info.ravali.entity;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="STUDENT_TBL")
public class StudentEntity {
	
	@Id
	@GeneratedValue
	private Integer StudentId;
	private String Name;
	private String Email;
	private Long Phno;
	private String Gender;
	private String Course;
	@OrderColumn
	@ElementCollection
	@CollectionTable(name="Student_Course_Timing" , joinColumns= @JoinColumn(name="StudentId"))
	private String[] Timings;
}
