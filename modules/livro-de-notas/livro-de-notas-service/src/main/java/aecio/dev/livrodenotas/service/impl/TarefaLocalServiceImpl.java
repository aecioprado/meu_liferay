/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package aecio.dev.livrodenotas.service.impl;

import aecio.dev.livrodenotas.model.Tarefa;
import aecio.dev.livrodenotas.service.base.TarefaLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=aecio.dev.livrodenotas.model.Tarefa",
	service = AopService.class
)
public class TarefaLocalServiceImpl extends TarefaLocalServiceBaseImpl {
	
	public Tarefa addTarefa(long groupId, String titulo, String descricao, Date dataFinal, ServiceContext serviceContext) throws PortalException {
		
		//printcontext
		System.out.println(serviceContext);
		
		// contexto
		Group group = GroupLocalServiceUtil.getGroup(groupId);
		long userId = serviceContext.getUserId();
		User user = userLocalService.getUser(userId);
		
		// montagem do objeto
		long tarefaId = counterLocalService.increment(Tarefa.class.getName());
		
		Tarefa tarefa = createTarefa(tarefaId);
		tarefa.setGroupId(groupId);
		tarefa.setCompanyId(serviceContext.getCompanyId());
		tarefa.setUserId(userId);
		tarefa.setCreateDate(new Date());
		tarefa.setModifiedDate(new Date());
		
		tarefa.setTitulo(titulo);
		tarefa.setDescricao(descricao);
		tarefa.setDataFinal(dataFinal);
		
		return super.addTarefa(tarefa);
		
	}
	
}