package service;

import entity.Users;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

public interface UsersService {
    public Users login(String username, String password);

    public boolean updatePassword(int id, String newPassword);

    /**
     * 获取所有数据
     * @return
     */
    public List<Users> select();

    /**
     * 根据Users类搜索数据
     * @param u
     * @return
     */
    public List<Users> select(Users u);

    /**
     * 根据主键获取用户一行数据
     * @param id
     * @return
     */
    public Users find(Object id);

    /**
     * 根据用户获取用户类条件查询一行数据
     * @param id
     * @return
     */
    public Users findEntity(Users id);

    /**
     * 搜索分页
     * @param obj
     * @param page
     * @param pageSize
     * @return
     */
    public List<Users> selectPage(Users obj, int page, int pageSize);

    /**
     * 根据Example搜索分页
     * @param obj
     * @param page
     * @param pageSize
     * @return
     */
    public List<Users> selectPageExample(Example obj, int page, int pageSize);

    /**
     * 根据主键删除一行数据
     * @param id
     * @return
     */
    public int delete(Object id);

    /**
     * 插入用户     * @param u
     * @return
     */
    public int insert(Users u);

    /**
     * 更新用户     * @param u
     * @return
     */
    public int update(Users u);
}
