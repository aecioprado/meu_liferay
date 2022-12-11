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

package aecio.dev.livrodenotas.service.persistence;

import aecio.dev.livrodenotas.model.Tarefa;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tarefa service. This utility wraps <code>aecio.dev.livrodenotas.service.persistence.impl.TarefaPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TarefaPersistence
 * @generated
 */
public class TarefaUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Tarefa tarefa) {
		getPersistence().clearCache(tarefa);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Tarefa> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Tarefa> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Tarefa> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Tarefa> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Tarefa> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Tarefa update(Tarefa tarefa) {
		return getPersistence().update(tarefa);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Tarefa update(Tarefa tarefa, ServiceContext serviceContext) {
		return getPersistence().update(tarefa, serviceContext);
	}

	/**
	 * Returns all the tarefas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching tarefas
	 */
	public static List<Tarefa> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the tarefas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TarefaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of tarefas
	 * @param end the upper bound of the range of tarefas (not inclusive)
	 * @return the range of matching tarefas
	 */
	public static List<Tarefa> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the tarefas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TarefaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of tarefas
	 * @param end the upper bound of the range of tarefas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tarefas
	 */
	public static List<Tarefa> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Tarefa> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tarefas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TarefaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of tarefas
	 * @param end the upper bound of the range of tarefas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tarefas
	 */
	public static List<Tarefa> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Tarefa> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first tarefa in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tarefa
	 * @throws NoSuchTarefaException if a matching tarefa could not be found
	 */
	public static Tarefa findByUuid_First(
			String uuid, OrderByComparator<Tarefa> orderByComparator)
		throws aecio.dev.livrodenotas.exception.NoSuchTarefaException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first tarefa in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tarefa, or <code>null</code> if a matching tarefa could not be found
	 */
	public static Tarefa fetchByUuid_First(
		String uuid, OrderByComparator<Tarefa> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last tarefa in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tarefa
	 * @throws NoSuchTarefaException if a matching tarefa could not be found
	 */
	public static Tarefa findByUuid_Last(
			String uuid, OrderByComparator<Tarefa> orderByComparator)
		throws aecio.dev.livrodenotas.exception.NoSuchTarefaException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last tarefa in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tarefa, or <code>null</code> if a matching tarefa could not be found
	 */
	public static Tarefa fetchByUuid_Last(
		String uuid, OrderByComparator<Tarefa> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the tarefas before and after the current tarefa in the ordered set where uuid = &#63;.
	 *
	 * @param tarefaId the primary key of the current tarefa
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tarefa
	 * @throws NoSuchTarefaException if a tarefa with the primary key could not be found
	 */
	public static Tarefa[] findByUuid_PrevAndNext(
			long tarefaId, String uuid,
			OrderByComparator<Tarefa> orderByComparator)
		throws aecio.dev.livrodenotas.exception.NoSuchTarefaException {

		return getPersistence().findByUuid_PrevAndNext(
			tarefaId, uuid, orderByComparator);
	}

	/**
	 * Removes all the tarefas where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of tarefas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching tarefas
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the tarefa where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchTarefaException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching tarefa
	 * @throws NoSuchTarefaException if a matching tarefa could not be found
	 */
	public static Tarefa findByUUID_G(String uuid, long groupId)
		throws aecio.dev.livrodenotas.exception.NoSuchTarefaException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the tarefa where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching tarefa, or <code>null</code> if a matching tarefa could not be found
	 */
	public static Tarefa fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the tarefa where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tarefa, or <code>null</code> if a matching tarefa could not be found
	 */
	public static Tarefa fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the tarefa where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the tarefa that was removed
	 */
	public static Tarefa removeByUUID_G(String uuid, long groupId)
		throws aecio.dev.livrodenotas.exception.NoSuchTarefaException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of tarefas where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching tarefas
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the tarefas where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching tarefas
	 */
	public static List<Tarefa> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the tarefas where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TarefaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of tarefas
	 * @param end the upper bound of the range of tarefas (not inclusive)
	 * @return the range of matching tarefas
	 */
	public static List<Tarefa> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the tarefas where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TarefaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of tarefas
	 * @param end the upper bound of the range of tarefas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tarefas
	 */
	public static List<Tarefa> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Tarefa> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tarefas where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TarefaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of tarefas
	 * @param end the upper bound of the range of tarefas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tarefas
	 */
	public static List<Tarefa> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Tarefa> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first tarefa in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tarefa
	 * @throws NoSuchTarefaException if a matching tarefa could not be found
	 */
	public static Tarefa findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Tarefa> orderByComparator)
		throws aecio.dev.livrodenotas.exception.NoSuchTarefaException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first tarefa in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tarefa, or <code>null</code> if a matching tarefa could not be found
	 */
	public static Tarefa fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Tarefa> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last tarefa in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tarefa
	 * @throws NoSuchTarefaException if a matching tarefa could not be found
	 */
	public static Tarefa findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Tarefa> orderByComparator)
		throws aecio.dev.livrodenotas.exception.NoSuchTarefaException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last tarefa in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tarefa, or <code>null</code> if a matching tarefa could not be found
	 */
	public static Tarefa fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Tarefa> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the tarefas before and after the current tarefa in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param tarefaId the primary key of the current tarefa
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tarefa
	 * @throws NoSuchTarefaException if a tarefa with the primary key could not be found
	 */
	public static Tarefa[] findByUuid_C_PrevAndNext(
			long tarefaId, String uuid, long companyId,
			OrderByComparator<Tarefa> orderByComparator)
		throws aecio.dev.livrodenotas.exception.NoSuchTarefaException {

		return getPersistence().findByUuid_C_PrevAndNext(
			tarefaId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the tarefas where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of tarefas where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching tarefas
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Caches the tarefa in the entity cache if it is enabled.
	 *
	 * @param tarefa the tarefa
	 */
	public static void cacheResult(Tarefa tarefa) {
		getPersistence().cacheResult(tarefa);
	}

	/**
	 * Caches the tarefas in the entity cache if it is enabled.
	 *
	 * @param tarefas the tarefas
	 */
	public static void cacheResult(List<Tarefa> tarefas) {
		getPersistence().cacheResult(tarefas);
	}

	/**
	 * Creates a new tarefa with the primary key. Does not add the tarefa to the database.
	 *
	 * @param tarefaId the primary key for the new tarefa
	 * @return the new tarefa
	 */
	public static Tarefa create(long tarefaId) {
		return getPersistence().create(tarefaId);
	}

	/**
	 * Removes the tarefa with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tarefaId the primary key of the tarefa
	 * @return the tarefa that was removed
	 * @throws NoSuchTarefaException if a tarefa with the primary key could not be found
	 */
	public static Tarefa remove(long tarefaId)
		throws aecio.dev.livrodenotas.exception.NoSuchTarefaException {

		return getPersistence().remove(tarefaId);
	}

	public static Tarefa updateImpl(Tarefa tarefa) {
		return getPersistence().updateImpl(tarefa);
	}

	/**
	 * Returns the tarefa with the primary key or throws a <code>NoSuchTarefaException</code> if it could not be found.
	 *
	 * @param tarefaId the primary key of the tarefa
	 * @return the tarefa
	 * @throws NoSuchTarefaException if a tarefa with the primary key could not be found
	 */
	public static Tarefa findByPrimaryKey(long tarefaId)
		throws aecio.dev.livrodenotas.exception.NoSuchTarefaException {

		return getPersistence().findByPrimaryKey(tarefaId);
	}

	/**
	 * Returns the tarefa with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tarefaId the primary key of the tarefa
	 * @return the tarefa, or <code>null</code> if a tarefa with the primary key could not be found
	 */
	public static Tarefa fetchByPrimaryKey(long tarefaId) {
		return getPersistence().fetchByPrimaryKey(tarefaId);
	}

	/**
	 * Returns all the tarefas.
	 *
	 * @return the tarefas
	 */
	public static List<Tarefa> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the tarefas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TarefaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tarefas
	 * @param end the upper bound of the range of tarefas (not inclusive)
	 * @return the range of tarefas
	 */
	public static List<Tarefa> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the tarefas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TarefaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tarefas
	 * @param end the upper bound of the range of tarefas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tarefas
	 */
	public static List<Tarefa> findAll(
		int start, int end, OrderByComparator<Tarefa> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tarefas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TarefaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tarefas
	 * @param end the upper bound of the range of tarefas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tarefas
	 */
	public static List<Tarefa> findAll(
		int start, int end, OrderByComparator<Tarefa> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tarefas from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tarefas.
	 *
	 * @return the number of tarefas
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TarefaPersistence getPersistence() {
		return _persistence;
	}

	private static volatile TarefaPersistence _persistence;

}