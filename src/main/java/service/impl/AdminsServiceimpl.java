package service.impl;

import dao.AdminsMapper;
import entity.Admins;
import org.springframework.stereotype.Service;
import service.AdminsService;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Service("AdminsService")
public class AdminsServiceimpl implements AdminsService {
    @Resource
    private AdminsMapper dao;

    public Admins login(String username,String password){
        Admins user=new Admins();
        user.setUsername(username);
        user.setPassword(password);

        return this.dao.login(user);
    }

    public boolean updatePassword(int id,String newPassword){
        Admins user=new Admins();
        user.setId(id);
        user.setPassword(newPassword);
        int isSucceedUpdated = this.dao.updateByPrimaryKeySelective(user);
        return isSucceedUpdated == 1;
    }

    @Override
    public List<Admins> select() {
        return dao.select(null);
    }

    @Override
    public List<Admins> select(Admins a) {
        return dao.select(a);
    }

    @Override
    public Admins find(Object id) {
        return dao.selectByPrimaryKey(id);
    }

    @Override
    public Admins findEntity(Admins id) {
        return null;
    }

    @Override
    public List<Admins> selectPage(Admins a, int page, int pageSize) {
        return null;
    }

    @Override
    public List<Admins> selectPageExample(Example obj, int page, int pageSize) {
        return null;
    }

    @Override
    public int delete(Object id) {
        return 0;
    }

    @Override
    public int insert(Admins a) {
        return 0;
    }

    @Override
    public int update(Admins a) {
        return 0;
    }


}
