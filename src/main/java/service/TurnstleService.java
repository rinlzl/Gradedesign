package service;

import entity.Turnstle;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

public interface TurnstleService {
    /**
     * 获取所有数据
     * @return
     */
    public List<Turnstle> select();

    /**
     * 根据Turnstle类搜索数据
     * @param t
     * @return
     */
    public List<Turnstle> select(Turnstle t);

    /**
     * 根据主键获取闸机一行数据
     * @param id
     * @return
     */
    public Turnstle find(Object id);

    /**
     * 根据闸机获取闸机类条件查询一行数据
     * @param id
     * @return
     */
    public Turnstle findEntity(Turnstle id);

    /**
     * 搜索分页
     * @param obj
     * @param page
     * @param pageSize
     * @return
     */
    public List<Turnstle> selectPage(Turnstle obj, int page, int pageSize);

    /**
     * 根据Example搜索分页
     * @param obj
     * @param page
     * @param pageSize
     * @return
     */
    public List<Turnstle> selectPageExample(Example obj, int page, int pageSize);

    /**
     * 根据主键删除一行数据
     * @param id
     * @return
     */
    public int delete(Object id);

    /**
     * 插入闸机     * @param t
     * @return
     */
    public int insert(Turnstle t);

    /**
     * 更新闸机     * @param t
     * @return
     */
    public int update(Turnstle t);
}
