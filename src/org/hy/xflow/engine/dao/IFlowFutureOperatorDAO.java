package org.hy.xflow.engine.dao;

import java.util.Map;

import org.hy.common.PartitionMap;
import org.hy.common.xml.annotation.XType;
import org.hy.common.xml.annotation.Xjava;
import org.hy.common.xml.annotation.Xsql;
import org.hy.xflow.engine.bean.FutureOperator;





/**
 * 工作流未来操作人(实时数据)的DAO
 *
 * @author      ZhengWei(HY)
 * @createDate  2018-05-15
 * @version     v1.0
 */
@Xjava(id="FlowFutureOperatorDAO" ,value=XType.XSQL)
public interface IFlowFutureOperatorDAO
{
    
    /**
     * 查询所有未来操作人，并分区保存，用于人找实例ID的高速缓存查询
     * 
     *   Map.key分区为参与人的形式的值：objectType:objectID 
     *   Map.value元素为工作流实例ID：workID
     * 
     * @author      ZhengWei(HY)
     * @createDate  2018-05-15
     * @version     v1.0
     *
     * @return
     */
    @Xsql(id="XSQL_XFlow_TFlowFutureOperator_QueryAllByWorkID" ,cacheID="$FutureOperatorsByWorkID")
    public PartitionMap<String ,FutureOperator> queryAllByWorkID();
    
    
    
    /**
     * 查询所有未来操作人，并分区保存，用于实例ID找人的高速缓存查询
     * 
     *   Map.key分区为工作流实例ID：workID
     *   Map.value元素为参与人的形式的值：objectType:objectID 
     * 
     * @author      ZhengWei(HY)
     * @createDate  2018-05-15
     * @version     v1.0
     *
     * @return
     */
    @Xsql(id="XSQL_XFlow_TFlowFutureOperator_QueryAll_KeyWorkID" ,cacheID="$FutureOperators_KeyWorkID")
    public PartitionMap<String ,FutureOperator> queryAll_KeyWorkID();
    
    
    
    /**
     * 查询所有未来操作人，用业务ID找实例ID
     * 
     *   Map.key    为业务ID - serviceDataID
     *   Map.value  为实例ID - workID
     * 
     * @author      ZhengWei(HY)
     * @createDate  2019-09-11
     * @version     v1.0
     *
     * @return
     */
    @Xsql(id="XSQL_XFlow_TFlowFutureOperator_QueryAll_SToWorkID" ,cacheID="$FutureOperators_SToWorkID")
    public Map<String ,String> queryAll_SToWorkID();
    
}
