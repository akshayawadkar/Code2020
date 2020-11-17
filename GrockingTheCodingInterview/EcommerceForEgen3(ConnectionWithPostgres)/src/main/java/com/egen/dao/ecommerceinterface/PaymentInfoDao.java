package com.egen.dao.ecommerceinterface;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.egen.dao.beans.Item;
import com.egen.dao.beans.OrderInfo;
import com.egen.dao.beans.OrderItemInfo;
import com.egen.dao.beans.OrderPaymentInfo;

@Repository
public interface PaymentInfoDao extends JpaRepository<OrderPaymentInfo, Long> {

	@Query(value = "select * from order_payment_info where order_id = :currId", nativeQuery = true)
	List<OrderPaymentInfo> getAllOrderPaymentInfo(Long currId);
	
	

}
