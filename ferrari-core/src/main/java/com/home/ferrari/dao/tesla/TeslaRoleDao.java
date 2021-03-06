/*
 * @Project: GZJK
 * @Author: zengbin
 * @Date: 2015年10月28日
 * @Copyright: 2000-2015 CMCC . All rights reserved.
 */
package com.home.ferrari.dao.tesla;

import org.apache.ibatis.annotations.Param;

import com.home.ferrari.vo.tesla.user.TeslaRole;

/** 
* @ClassName: TeslaRoleDao 
* @Description: 角色信息DAO
* @author zengbin
* @date 2016年05月01日 下午3:23:23 
*/
public interface TeslaRoleDao {
    TeslaRole getTeslaRoleByCode(@Param(value = "roleCode") String roleCode);
}
