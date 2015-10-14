package com.zh.web.dao;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import com.zh.core.base.dao.BaseDao;
import com.zh.web.model.bean.PurchasingAssistant;

@Component("purchasingAssistantDao")
public class PurchasingAssistantDao extends BaseDao<PurchasingAssistant> {

	@Override
	@PostConstruct
	public void init() {
		this.setNamespace("M_PurchasingAssistant");
	}
}
