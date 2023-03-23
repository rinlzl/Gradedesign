package dao;

import config.MapperBase;
import entity.Admins;

public interface AdminsMapper extends MapperBase<Admins> {
    Admins login(Admins admins);
}
