package com.egen.dao.ecommerceinterface;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.egen.dao.beans.OrderInfo;
import com.egen.dao.beans.OrderItemInfo;

@Repository
public interface OrderItemInfoDao extends JpaRepository<OrderItemInfo, Long> {
	
	@Query(value = "select * from order_item_info where order_id = :currId", nativeQuery = true)
	List<OrderItemInfo> findAllOrderItemInfosById(Long currId);

 
}
