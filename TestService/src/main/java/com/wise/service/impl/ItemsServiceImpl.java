package com.wise.service.impl;

import com.wise.dao.ItemsMapper;
import com.wise.pojo.Items;
import com.wise.service.ItemsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by wise on 2017/9/11.
 */
@Service
public class ItemsServiceImpl implements ItemsService {

    @Resource
    private ItemsMapper itemsMapper;

    /**
     * 查询所有商品
     * @return
     */
    @Override
    public List<Items> findAll() {
        return itemsMapper.findAll();
    }

    /**
     * 预修改,根据id查找商品
     * @param id
     * @return
     */
    @Override
    public Items findById(Integer id) {
        return itemsMapper.selectByPrimaryKey(id);
    }

    /**
     * 修改一个商品
     * @param item
     * @return
     */
    @Override
    public int edit(Items item) {
        return itemsMapper.updateByPrimaryKey(item);
    }

    /**
     * 根据id删除一个商品
     * @param id
     * @return
     */
    @Override
    public int delete(Integer id) {
        return itemsMapper.deleteByPrimaryKey(id);
    }

    /**
     * 添加商品
     */
    @Override
    public void addItme(Items item) {
        itemsMapper.insert(item);
    }
}
