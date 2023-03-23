package service;

import entity.Operator;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

public interface OperatorService {
    /**
     * 获取所有数据
     * @return
     */
    public List<Operator> select();

    /**
     * 根据Operator类搜索数据
     * @param o
     * @return
     */
    public List<Operator> select(Operator o);

    /**
     * 根据主键获取开关机一行数据
     * @param id
     * @return
     */
    public Operator find(Object id);

    /**
     * 根据开关机获取开关机类条件查询一行数据
     * @param id
     * @return
     */
    public Operator findEntity(Operator id);

    /**
     * 搜索分页
     * @param obj
     * @param page
     * @param pageSize
     * @return
     */
    public List<Operator> selectPage(Operator obj, int page, int pageSize);

    /**
     * 根据Example搜索分页
     * @param obj
     * @param page
     * @param pageSize
     * @return
     */
    public List<Operator> selectPageExample(Example obj, int page, int pageSize);

    /**
     * 根据主键删除一行数据
     * @param id
     * @return
     */
    public int delete(Object id);

    /**
     * 插入开关机     * @param o
     * @return
     */
    public int insert(Operator o);

    /**
     * 更新开关机     * @param o
     * @return
     */
    public int update(Operator o);
}
