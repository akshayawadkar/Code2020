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
import com.egen.dao.beans.OrderItemInfo;
import com.egen.dao.beans.OrderPaymentInfo;
import com.egen.dao.ecommerceinterface.OrderInfoDao;
import com.egen.dao.ecommerceinterface.PaymentInfoDao;

@Component
public class PaymentInfoDaoImpl {

	@Autowired
	PaymentInfoDao paymentInfoDao;

	public OrderPaymentInfo save(OrderPaymentInfo newPaymentInfo) {

		paymentInfoDao.save(newPaymentInfo);

		return newPaymentInfo;
	}

	public void saveAll(List<OrderPaymentInfo> bulkOrdePaymentInfo) {
		paymentInfoDao.saveAll(bulkOrdePaymentInfo);

	}

	public List<OrderPaymentInfo> getAllOrderPaymentInfo(Long orderId) {
		 
		return paymentInfoDao.getAllOrderPaymentInfo(orderId);
	}

}
