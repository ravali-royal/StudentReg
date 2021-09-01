package info.ravali.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import info.ravali.entity.Genders;

public interface GenderRepository extends JpaRepository<Genders, Serializable> {

	@Query("select genderName from Genders")
	public List<String> getByGenederName();
}
