package com.egen.dao.ecommerceinterface;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.egen.dao.beans.OrderInfo;
import com.egen.dao.beans.OrderItemInfo;

@Repository
public interface OrderInfoDao extends JpaRepository<OrderInfo, Long> {

	 
}
