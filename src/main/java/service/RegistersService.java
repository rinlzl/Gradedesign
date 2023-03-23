package service;

import entity.Registers;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

public interface RegistersService {
    /**
     * 获取所有数据
     * @return
     */
    public List<Registers> select();

    /**
     * 根据Registers类搜索数据
     * @param r
     * @return
     */
    public List<Registers> select(Registers r);

    /**
     * 根据主键获取登记一行数据
     * @param id
     * @return
     */
    public Registers find(Object id);

    /**
     * 根据登记获取登记类条件查询一行数据
     * @param id
     * @return
     */
    public Registers findEntity(Registers id);

    /**
     * 搜索分页
     * @param obj
     * @param page
     * @param pageSize
     * @return
     */
    public List<Registers> selectPage(Registers obj, int page, int pageSize);

    /**
     * 根据Example搜索分页
     * @param obj
     * @param page
     * @param pageSize
     * @return
     */
    public List<Registers> selectPageExample(Example obj, int page, int pageSize);

    /**
     * 根据主键删除一行数据
     * @param id
     * @return
     */
    public int delete(Object id);

    /**
     * 插入登记     * @param r
     * @return
     */
    public int insert(Registers r);

    /**
     * 更新登记     * @param r
     * @return
     */
    public int update(Registers r);
}
