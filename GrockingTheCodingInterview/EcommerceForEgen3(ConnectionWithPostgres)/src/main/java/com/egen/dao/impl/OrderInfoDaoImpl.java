package com.egen.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.egen.dao.beans.OrderInfo;
import com.egen.dao.ecommerceinterface.OrderInfoDao;

@Component
public class OrderInfoDaoImpl {

	@Autowired
	OrderInfoDao orderInfoDao;

	public OrderInfo getById(Long id) {
		return orderInfoDao.findById(id).get();
	}

	public void save(OrderInfo orderInfo) {
		orderInfoDao.save(orderInfo);

	}

	public void saveAll(List<OrderInfo> bulkOrderInfo) {
		orderInfoDao.saveAll(bulkOrderInfo);
		
	}

}
