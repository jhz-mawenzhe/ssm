package com.wise.service;

import com.wise.pojo.Items;
import java.util.List;

/**
 * 对商品的查找/修改/删除的接口
 * Created by MaWenZhe on 2017/9/11.
 */
public interface ItemsService {

     public List<Items> findAll();

     public Items findById(Integer id);

     public int edit(Items item);

     public int delete(Integer id);

     public void addItme(Items item);
}
