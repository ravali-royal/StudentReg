package info.ravali.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import info.ravali.entity.Timings;

public interface TimingRepository extends JpaRepository<Timings, Serializable>{
	
	@Query("select TimingName from Timings")
	public List<String> getByTimingName();
}
