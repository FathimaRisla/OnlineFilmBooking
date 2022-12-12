package com.film.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.film.beans.OrderHistory;

@Repository
public interface HistoryRepo extends JpaRepository<OrderHistory, Long>{
	@Query(value = "select * from o_history where customer_b_id=?", nativeQuery = true)
	public List<OrderHistory> getAllHistory(long id);

}
